package net.raisetech.raisetechtask9.service;

import net.raisetech.raisetechtask9.form.CreateForm;
import net.raisetech.raisetechtask9.entity.Movie;
import java.util.List;

public interface MovieService {

    List<Movie> findAll();

    Movie findById(int id);

    List<Movie> findByPublishedYear(Integer publishedYear);

    void createMovie(CreateForm form);

    void deleteById(int id);

    void updateById(CreateForm form);
}
