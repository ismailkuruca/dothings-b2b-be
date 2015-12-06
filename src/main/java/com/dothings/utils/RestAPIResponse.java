package com.dothings.utils;

import org.springframework.http.HttpStatus;

public class RestAPIResponse {

    private boolean success = false;
    private String message;
    private Object data;
    private HttpStatus status;

    public static RestAPIResponse ok(Object data, String message) {
        return new RestAPIResponse(Boolean.TRUE, message, data, HttpStatus.OK);
    }

    public static RestAPIResponse ok(Object data) {
        return new RestAPIResponse(Boolean.TRUE, "success", data, HttpStatus.OK);
    }

    public static RestAPIResponse error(Object data, String message) {
        return new RestAPIResponse(Boolean.FALSE, message, data, HttpStatus.BAD_REQUEST);
    }

    public static RestAPIResponse error(HttpStatus status, String message) {
        return new RestAPIResponse(Boolean.FALSE, message, null, status);
    }

    public static RestAPIResponse error(HttpStatus status, Object body) {
        return new RestAPIResponse(Boolean.FALSE, null, body, status);
    }

    public static RestAPIResponse error(HttpStatus status) {
        return new RestAPIResponse(Boolean.FALSE, null, null, status);
    }

    public RestAPIResponse(boolean success, String message, Object data, HttpStatus status) {
        this.success = success;
        this.message = message;
        this.data = data;
        this.status = status;
    }

    public boolean isSuccess() {
        return success;
    }

    public RestAPIResponse setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public RestAPIResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public RestAPIResponse setData(Object data) {
        this.data = data;
        return this;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

}
