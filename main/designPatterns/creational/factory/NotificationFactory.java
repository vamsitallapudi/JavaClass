package main.designPatterns.creational.factory;

import designPatterns.creational.factory.EmailNotification;

public class NotificationFactory {

    Notification notification;

    public static Notification getNotification(String type) {
        switch (type) {
            case "Email":
                return new EmailNotification();
            default:
                throw new AssertionError();
        }
    }
}
