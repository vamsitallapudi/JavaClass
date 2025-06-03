package main.designPatterns.creational.factory;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Notified via SMS");
    }
}
