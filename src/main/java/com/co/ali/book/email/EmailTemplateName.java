package com.co.ali.book.email;

import lombok.Getter;

@Getter
public enum EmailTemplateName {
    ACTIVATION_ACCOUNT("activate_account"),
    EMAIL_TEMPLATE("email_template"),;

    private final String name;

    EmailTemplateName(String name) {
        this.name = name;
    }
}
