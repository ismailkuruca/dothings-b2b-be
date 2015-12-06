package com.dothings.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dothings.model.QuestCompletion;
import com.dothings.model.User;
import com.dothings.utils.Constants;
import com.dothings.utils.RestAPIResponse;


@RestController
public class UserController extends BaseController {

    @RequestMapping(value = "/updateProfilePicture", method = RequestMethod.POST)
    public RestAPIResponse uploadImages(@RequestBody MultipartFile file, HttpServletRequest request) {
        User user = getUser();
        String fileName = user.getId() + "-profile-" + System.currentTimeMillis();;
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                BufferedOutputStream stream =
                        new BufferedOutputStream(new FileOutputStream(new File(Constants.IMAGE_PATH
                                + fileName)));
                stream.write(bytes);
                stream.close();
                user.setProfilePicture(fileName);
                userRepository.save(user);
                return RestAPIResponse.ok(null, "You successfully uploaded " + fileName + " into "
                        + fileName);
            } catch (Exception e) {
                e.printStackTrace();
                return RestAPIResponse.error(HttpStatus.SERVICE_UNAVAILABLE,
                        "You failed to upload " + fileName + " => " + e.getMessage());
            }
        } else {
            return RestAPIResponse.error(HttpStatus.SERVICE_UNAVAILABLE, "You failed to upload "
                    + fileName + " because the file was empty.");
        }
    }
}
