package net.raisetech.raisetechtask9.entity;

import lombok.Getter;

@Getter
public class Movie {

    private int id;
    private  String name;
    private Integer age;

    public Movie(int id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }
}
