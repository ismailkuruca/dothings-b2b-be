package com.dothings.controller;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.dothings.auth.AuthUtils;
import com.dothings.init.AuthFilter;
import com.dothings.model.User;
import com.dothings.service.UserService;
import com.nimbusds.jose.JOSEException;

public class BaseController {

    @Autowired
    HttpServletRequest request;

    @Autowired
    HttpServletResponse response;

    @Autowired
    UserService userService;

    public User getUser() {
        String authHeader = request.getHeader(AuthUtils.AUTH_HEADER_KEY);

        if (StringUtils.isBlank(authHeader) || authHeader.split(" ").length != 2) {
            try {
                response.sendError(HttpServletResponse.SC_UNAUTHORIZED, AuthFilter.AUTH_ERROR_MSG);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        User findById = null;
        try {
            findById = userService.getUserById(Long.parseLong(AuthUtils.getSubject(authHeader)));
        } catch (NumberFormatException | ParseException | JOSEException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        if (findById == null) {
            try {
                response.sendError(HttpServletResponse.SC_UNAUTHORIZED, AuthFilter.AUTH_ERROR_MSG);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return findById;
    }
}
