package main.designPatterns.behavioural.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Channel youtube = new YouTube();
        Subscriber s1 = new Subscriber("s1");
        Subscriber s2 = new Subscriber("s2");
        Subscriber s3 = new Subscriber("s3");
        youtube.subscribe(s1);
        youtube.subscribe(s2);
        youtube.subscribe(s3);
        youtube.notifyEveryone();
        youtube.unsubscribe(s1);
        youtube.notifyEveryone();
    }
}
