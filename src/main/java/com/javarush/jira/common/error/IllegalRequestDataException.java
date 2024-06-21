package com.javarush.jira.common.error;

public class IllegalRequestDataException extends AppException {
    public IllegalRequestDataException(String msg) {
        super(msg);
    }

    public IllegalRequestDataException(String msg, Exception ex) {
        super(msg, ex);
    }
}