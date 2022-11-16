package net.raisetech.raisetechtask9.controller;

import lombok.Getter;
import net.raisetech.raisetechtask9.entity.Movie;

@Getter
public class MovieResponse {
    private int id;
    private String name;
    private Integer published_Year;

    public MovieResponse(Movie movie) {
        this.id = movie.getId();
        this.name = movie.getName();
        this.published_Year = movie.getPublished_Year();
    }
}
