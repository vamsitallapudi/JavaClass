package main.designPatterns.creational.abstractFactory;

public class SuzukiSUV implements SUV {
    @Override
    public void build() {
        System.out.println("Suzuki SUV Built");
    }
}