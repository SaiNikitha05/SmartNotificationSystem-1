package com.smart_notification.interfaces;

import com.smart_notification.exceptions.InvalidContactInfoException;

public interface Notification {
    void notify_user(String name, String contact_info) throws InvalidContactInfoException; // we can pass message as a
                                                                                           // parameter here
}
