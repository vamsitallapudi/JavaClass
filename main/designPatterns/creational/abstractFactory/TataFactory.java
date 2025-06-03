package main.designPatterns.creational.abstractFactory;

public class TataFactory implements CarFactory{
    @Override
    public Sedan buildSedan() {
        return new TataSedan();
    }

    @Override
    public SUV buildSUV() {
        return new TataSUV();
    }
}
