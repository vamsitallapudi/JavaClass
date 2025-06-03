package main.designPatterns.creational.abstractFactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        CarFactory carFactory = Company.getCarFactory("Tata");
        SUV suv = carFactory.buildSUV();
        Sedan sedan = carFactory.buildSedan();
        suv.build();
        sedan.build();
    }
}
