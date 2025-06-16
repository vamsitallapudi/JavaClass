package main.designPatterns.behavioural.chainOfResponsibilities;

public class Manager implements Handle{

    private Handle nextHandler;
    public Manager(Handle nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(int days) {
        if(days < 5) {
            System.out.println("Approved from Manager");
        } else {
            nextHandler.handle(days);
        }
    }
}
