package main.designPatterns.creational.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        NotificationFactory.getNotification("Email");
        NotificationFactory.getNotification("SMS");
    }
}
