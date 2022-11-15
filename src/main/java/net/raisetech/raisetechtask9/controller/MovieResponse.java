package net.raisetech.raisetechtask9.controller;

import lombok.Getter;
import lombok.Setter;
import net.raisetech.raisetechtask9.entity.Movie;

@Getter
@Setter
public class MovieResponse {

    private String name;
    private Integer age;

    public MovieResponse(Movie movie) {

        this.name = movie.getName();
        this.age = movie.getAge();
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
