package com.smart_notification;

import java.util.*;
import com.smart_notification.interfaces.*;
import com.smart_notification.adapters.*;
import com.smart_notification.exceptions.*;

public class Main {
    static Notification notif;
    static Scanner sc = new Scanner(System.in);
    static String name;
    static int choice;
    static String info;

    public static void main(String[] args) {
        System.out.print("Hello! Enter your name: ");

        name = sc.nextLine();
        System.out.print("Enter preferred type of msg [1] SMS [2] Whatsapp [3] Email: ");
        choice = sc.nextInt();
        notif = getNotificationType(choice);
        sc.nextLine();
        boolean flag = false;
        System.out.print("Enter corresponding contact info: ");
        while (!flag) {
            info = sc.next();
            try {
                notif.notify_user(name, info);
                System.out.println("Notification successfully sent to " + name + "!");
                flag = true;
            } catch (InvalidContactInfoException e) {
                System.out.print(e.getMessage());
            }
        }
    }

    static Notification getNotificationType(int choice) {
        while (true) {
            if (choice == 1) {
                return (Notification) new SMSAdapter();
            } else if (choice == 2) {
                return new WhatsappAdapter();
            } else if (choice == 3) {
                return new EmailAdapter();
            } else {
                System.out.print("Invalid Choice.Please try again.");
                choice = sc.nextInt();
            }
        }

    }
}