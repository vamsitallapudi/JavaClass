package main.designPatterns.creational.factory;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Notified via email");
    }

}
