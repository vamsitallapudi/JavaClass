package main.designPatterns.creational.abstractFactory;

public class SuzukiFactory implements CarFactory{
    @Override
    public Sedan buildSedan() {
        return new SuzukiSedan();
    }

    @Override
    public SUV buildSUV() {
        return new SuzukiSUV();
    }
}
