package main.designPatterns.behavioural.chainOfResponsibilities;

public class Director implements Handle{
    @Override
    public void handle(int days) {
        System.out.println("Approved from Director");
    }
}
