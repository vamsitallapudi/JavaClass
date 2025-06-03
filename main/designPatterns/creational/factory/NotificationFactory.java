package main.designPatterns.creational.factory;

public class NotificationFactory {

    public static void getNotification(String type) {
        switch (type) {
            case "Email":
                new EmailNotification().notifyUser();
                break;
            case "SMS":
                new SMSNotification().notifyUser();
                break;
            default:
                new EmailNotification().notifyUser();
                break;
        }
    }
}
