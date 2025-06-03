package main.designPatterns.creational.abstractFactory;

public class TataSUV implements SUV {
    @Override
    public void build() {
        System.out.println("Tata SUV Built");
    }
}