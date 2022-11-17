package net.raisetech.raisetechtask9.service;

import net.raisetech.raisetechtask9.entity.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {

    List<Movie> findAll();

    Optional<Movie> findById(int id);

    Optional<Movie> findByPublished_year(Integer published_year);
}
