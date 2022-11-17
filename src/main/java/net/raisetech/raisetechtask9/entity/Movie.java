package net.raisetech.raisetechtask9.entity;

import lombok.Getter;

@Getter
public class Movie {

    private int id;
    private  String name;
    private Integer published_year;

    public Movie(int id, String name, Integer published_year) {
        this.id = id;
        this.name = name;
        this.published_year = published_year;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPublished_year() {
        return published_year;
    }
}
