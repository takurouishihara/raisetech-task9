package net.raisetech.raisetechtask9.entity;

import lombok.Getter;

@Getter
public class Movie {

    private int id;
    private  String name;
    private Integer published_Year;

    public Movie(int id, String name, Integer published_Year) {
        this.id = id;
        this.name = name;
        this.published_Year = published_Year;
    }

    public int getId() {
        return id;
    }

    public Integer getPublished_Year() {
        return published_Year;
    }
}
