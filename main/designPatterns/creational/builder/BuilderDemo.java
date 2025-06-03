package main.designPatterns.creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        User ub = new UserBuilder().name("XYZ").age(10).build();
    }
}
