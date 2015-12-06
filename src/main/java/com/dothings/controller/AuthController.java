package com.dothings.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dothings.auth.AuthUtils;
import com.dothings.auth.PasswordService;
import com.dothings.model.ErrorMessage;
import com.dothings.model.Token;
import com.dothings.model.User;
import com.dothings.repository.UserRepository;
import com.dothings.utils.RestAPIResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nimbusds.jose.JOSEException;

@RestController
public class AuthController extends BaseController {

	@Resource
	private UserRepository userRepository;

	public static final String CONFLICT_MSG = "There is already a %s account that belongs to you",
			NOT_FOUND_MSG = "User not found", LOGING_ERROR_MSG = "Wrong email and/or password",
			UNLINK_ERROR_MSG = "Could not unlink %s account because it is your only sign-in method",
			DUPLICATE_EMAIL_ERROR = "Email already exists";

	public static final ObjectMapper MAPPER = new ObjectMapper();

	@RequestMapping(value = "/auth/login", method = RequestMethod.POST)
	public RestAPIResponse login(@RequestBody final User user, @Context final HttpServletRequest request)
			throws JOSEException {
		User foundUser = userRepository.findByEmail(user.getEmail());
		if (foundUser != null && PasswordService.checkPassword(user.getPassword(), foundUser.getPassword())) {
			final Token token = AuthUtils.createToken(request.getRemoteHost(), foundUser.getId());
			return RestAPIResponse.ok(token);
		}
		return RestAPIResponse.error(HttpStatus.UNAUTHORIZED, new ErrorMessage(LOGING_ERROR_MSG));
	}

	@RequestMapping(value = "/auth/signup", method = RequestMethod.POST)
	public RestAPIResponse signup(@RequestBody final User user, HttpServletRequest request) throws JOSEException {
		User foundUser = userRepository.findByEmail(user.getEmail());
		if (foundUser != null) {
			return RestAPIResponse.error(HttpStatus.UNAUTHORIZED, new ErrorMessage(DUPLICATE_EMAIL_ERROR));
		}
		user.setPassword(PasswordService.hashPassword(user.getPassword()));
		final User savedUser = userRepository.save(user);
		final Token token = AuthUtils.createToken(request.getRemoteHost(), savedUser.getId());
		return RestAPIResponse.ok(token);
	}

	@RequestMapping(value = "/auth/me", method = RequestMethod.GET)
	public RestAPIResponse me() {
		return RestAPIResponse.ok(getUser());
	}

}
