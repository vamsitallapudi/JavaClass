package main.designPatterns.behavioural.chainOfResponsibilities;

public class TL implements Handle{

    private Handle nextHandler;
    public TL(Handle nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(int days) {
        if(days <2) {
            System.out.println("Approved from TL");
        } else {
            nextHandler.handle(days);
        }
    }
}
