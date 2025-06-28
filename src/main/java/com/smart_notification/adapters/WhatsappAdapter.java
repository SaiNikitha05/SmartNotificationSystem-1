package com.smart_notification.adapters;

import com.smart_notification.services.*;
import com.smart_notification.exceptions.InvalidContactInfoException;
import com.smart_notification.interfaces.*;

public class WhatsappAdapter implements Notification {
    Whatsapp api;
    Validator validator;

    public WhatsappAdapter() {
        this.api = new Whatsapp();
        this.validator = new NumberValidator();
    }

    public void notify_user(String name, String contact_info) throws InvalidContactInfoException {
        if (!validator.isValid(contact_info)) {
            throw new InvalidContactInfoException("Invalid phone number. Use 10 digits format.");
        }
        long number = Long.parseLong(contact_info);
        api.send_notification(name, number);
    }
}