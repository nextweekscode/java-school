package com.lambdaschool.schools.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ErrorDetail {

    // errorDetails Object
    // title:
    // status: some status number
    // detail:
    // timestamp:
    // developermessage:
    // errors: list of validation errors

    private String title;
    private int status;
    private String detail;
    private Date timestamp;
    private String developermessage;
    private List<ValidationError> errors = new ArrayList<>();

    public ErrorDetail() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getDevelopermessage() {
        return developermessage;
    }

    public void setDevelopermessage(String developermessage) {
        this.developermessage = developermessage;
    }

    public List<ValidationError> getErrors() {
        return errors;
    }

    public void setErrors(List<ValidationError> errors) {
        this.errors = errors;
    }
}