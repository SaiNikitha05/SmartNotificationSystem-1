package com.smart_notification.services;

import com.smart_notification.interfaces.Validator;

public class NumberValidator implements Validator {

    public boolean isValid(String input) {
        return input.matches("^\\d{10}$");
    }

}
