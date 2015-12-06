package com.dothings.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dothings.model.User;
import com.dothings.utils.Constants;


@RestController
public class PhotoUploadController extends BaseController {
    
    @Autowired
    ApplicationContext applicationContext;
    
    
    @RequestMapping(value = "/uploadImages")
    public Response uploadImages(@RequestBody MultipartFile file, HttpServletRequest request) {
        User user = getUser();
        String fileName = user.getId() + "-" + System.currentTimeMillis();;
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                BufferedOutputStream stream = 
                        new BufferedOutputStream(new FileOutputStream(new File(Constants.IMAGE_PATH + fileName)));
                stream.write(bytes);
                stream.close();
                return Response.ok().entity("You successfully uploaded " + fileName + " into " + fileName).build();
            } catch (Exception e) {
                return Response.status(500).entity("You failed to upload " + fileName + " => " + e.getMessage()).build();
            }
        } else {
            return Response.status(500).entity("You failed to upload " + fileName + " because the file was empty.").build();
        }
    }

}
