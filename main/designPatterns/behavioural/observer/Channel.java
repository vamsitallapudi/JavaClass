package main.designPatterns.behavioural.observer;

public interface Channel {
    void subscribe(Subscriber s);
    void unsubscribe(Subscriber s);
    void notifyEveryone();
}
