package com.smart_notification.adapters;

import com.smart_notification.exceptions.InvalidContactInfoException;
import com.smart_notification.interfaces.*;
import com.smart_notification.services.*;

public class SMSAdapter implements Notification {
    SMS api;
    Validator validate;

    public SMSAdapter() {
        this.api = new SMS();
        this.validate = new NumberValidator();
    }

    public void notify_user(String name, String contact_info) throws InvalidContactInfoException {
        if (!validate.isValid(contact_info)) {
            throw new InvalidContactInfoException("Invalid phone number. Use 10 digits format.");
        }
        long number = Long.parseLong(contact_info);
        api.send_sms(name, number);
    }
}