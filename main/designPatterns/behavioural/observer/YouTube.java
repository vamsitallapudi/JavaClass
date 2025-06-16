package main.designPatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTube implements Channel {

    List<Subscriber> subscribers = new ArrayList<>();
    @Override
    public void subscribe(Subscriber s) {
        subscribers.add(s);
        System.out.println("Subscribed: " + s.name);
    }

    @Override
    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
        System.out.println("Unsubscribed: " + s.name);
    }

    @Override
    public void notifyEveryone() {
        subscribers.forEach(Subscriber::update);
    }
}
