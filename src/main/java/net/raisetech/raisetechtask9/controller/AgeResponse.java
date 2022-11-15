package net.raisetech.raisetechtask9.controller;

import lombok.Getter;
import net.raisetech.raisetechtask9.entity.Movie;

@Getter
public class AgeResponse {

    private String name;
    private Integer age;

    public AgeResponse(Movie movie) {

        this.name = movie.getName();
        this.age = movie.getAge();
    }
}
