package net.raisetech.raisetechtask9.service;

import net.raisetech.raisetechtask9.entity.Movie;
import java.util.List;

public interface MovieService {

    List<Movie> findAll();

    Movie findById(int id);

    List<Movie> findByPublishedYear(Integer publishedYear);
}
