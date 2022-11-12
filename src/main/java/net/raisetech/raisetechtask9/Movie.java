package net.raisetech.raisetechtask9;

public class Movie {

    private int id;
    private  String name;
    private int age;

    public Movie(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
