package main.designPatterns.creational.abstractFactory;

public interface CarFactory {
    Sedan buildSedan();
    SUV buildSUV();
}
