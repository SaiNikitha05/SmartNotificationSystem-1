package com.smart_notification.services;

import com.smart_notification.interfaces.Validator;

public class MailValidator implements Validator {

    public boolean isValid(String input) {
        return input.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$");
    }

}
