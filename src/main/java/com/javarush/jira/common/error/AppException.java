package com.javarush.jira.common.error;

import org.springframework.lang.NonNull;

public class AppException extends RuntimeException {
    public AppException(@NonNull String message) {
        super(message);
    }

    public AppException(@NonNull String message, Exception ex) {
        super(message, ex);
    }
}
