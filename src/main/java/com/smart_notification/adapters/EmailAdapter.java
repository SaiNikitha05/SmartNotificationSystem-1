package com.smart_notification.adapters;

import com.smart_notification.exceptions.InvalidContactInfoException;
import com.smart_notification.interfaces.*;
import com.smart_notification.services.*;

public class EmailAdapter implements Notification {
    Email api;
    Validator validator;

    public EmailAdapter() {
        this.api = new Email();
        this.validator = new MailValidator();
    }

    public void notify_user(String name, String info) throws InvalidContactInfoException {
        if (!validator.isValid(info)) {
            throw new InvalidContactInfoException("Enter valid mailId: ");
        }

        api.send_mail(name, info);
    }
}
