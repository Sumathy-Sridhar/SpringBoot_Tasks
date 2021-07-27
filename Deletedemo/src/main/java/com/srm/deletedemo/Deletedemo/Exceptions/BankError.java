package com.srm.deletedemo.Deletedemo.Exceptions;

import java.util.Date;

public class BankError {

    private String message;
    private String category;
    private String errCode;
    private String id;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "BankError [category=" + category + ", errCode=" + errCode + ", id=" + id + ", message=" + message + "]";
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
