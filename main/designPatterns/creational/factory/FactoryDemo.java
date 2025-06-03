package main.designPatterns.creational.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        Notification emailNotification = NotificationFactory.getNotification("Email");
    }
}
