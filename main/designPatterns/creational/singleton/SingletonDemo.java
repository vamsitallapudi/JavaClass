package main.designPatterns.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
    }
}
