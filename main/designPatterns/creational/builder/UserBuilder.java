package main.designPatterns.creational.builder;

public class UserBuilder {
    public String name;
    public int age;
    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }
    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }
    public User build() {
        return new User(this);
    }
}
