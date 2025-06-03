package main.designPatterns.creational.abstractFactory;

public class TataSedan implements Sedan {
    @Override
    public void build() {
        System.out.println("TATA Sedan Built");
    }
}