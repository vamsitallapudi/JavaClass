package main.designPatterns.creational.singleton;

public final class Singleton {
    private static volatile Singleton instance;
    private Singleton() {
    }

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
