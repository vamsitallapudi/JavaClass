package main.designPatterns.behavioural.chainOfResponsibilities;

public class CORDemo {
    public static void main(String[] args) {
        Handle dir = new Director();
        Handle manager = new Manager(dir);
        Handle tl = new TL(manager);
        tl.handle(1);
        tl.handle(4);
        tl.handle(5);
    }
}
