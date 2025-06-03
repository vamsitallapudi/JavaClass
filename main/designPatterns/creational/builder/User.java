package main.designPatterns.creational.builder;

public class User {
    private String name;
    private int age;

    private UserBuilder userBuilder;

    public User(UserBuilder b) {
        b.name = name;
        b.age = age;
    }
}
