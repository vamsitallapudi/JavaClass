package main.designPatterns.creational.abstractFactory;

public class Company {

    public static CarFactory getCarFactory(String name) {
        switch (name) {
            case "TATA":
                return new TataFactory();
            case "Suzuki":
                return new SuzukiFactory();
            default:
                return null;
        }
    }
}
