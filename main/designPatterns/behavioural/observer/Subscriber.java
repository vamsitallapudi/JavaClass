package main.designPatterns.behavioural.observer;

public class Subscriber {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println("updated subscriber: " + name);
    }
}
