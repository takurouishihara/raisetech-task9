package net.raisetech.raisetechtask9.controller;

import lombok.Getter;
import net.raisetech.raisetechtask9.entity.Movie;

@Getter
public class MovieResponse {
    private int id;
    private String name;
    private Integer publishedYear;

    public MovieResponse(Movie movie) {
        this.id = movie.getId();
        this.name = movie.getName();
        this.publishedYear = movie.getPublishedYear();
    }
}
