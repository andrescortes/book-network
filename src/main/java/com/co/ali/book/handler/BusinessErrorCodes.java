package com.co.ali.book.handler;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum BusinessErrorCodes {

    NO_CODE(0, HttpStatus.NOT_IMPLEMENTED, "NO Code"),
    INCORRECT_CURRENT_PASSWORD(300, HttpStatus.BAD_REQUEST, "Incorrect Current Password"),
    NEW_PASSWORD_DOES_NOT_MATH(301, HttpStatus.BAD_REQUEST, "New Password Does Not Math"),
    ACCOUNT_DISABLED(302, HttpStatus.FORBIDDEN, "User account is disabled"),
    BAD_CREDENTIALS(303, HttpStatus.BAD_REQUEST, "Login and / or password is incorrect"),
    ACCOUNT_LOCKED(304, HttpStatus.FORBIDDEN, "User account is locked");

    private final int code;
    private final String description;
    private final HttpStatus httpStatus;

    BusinessErrorCodes(final int code, final HttpStatus httpStatus, final String description) {
        this.code = code;
        this.description = description;
        this.httpStatus = httpStatus;
    }
}
