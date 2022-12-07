package net.raisetech.raisetechtask9.entity;

import lombok.Getter;

@Getter
public class Movie {

    private int id;
    private  String name;
    private Integer publishedYear;

    public Movie(int id, String name, Integer publishedYear) {
        this.id = id;
        this.name = name;
        this.publishedYear = publishedYear;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPublishedYear() {
        return publishedYear;
    }
}
