package main.designPatterns.creational.abstractFactory;

public class SuzukiSedan implements Sedan {
    @Override
    public void build() {
        System.out.println("Suzuki Sedan Built");
    }
}