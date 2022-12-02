package net.raisetech.raisetechtask9.service;

import net.raisetech.raisetechtask9.form.CreateForm;
import net.raisetech.raisetechtask9.ResourceNotFoundException;
import net.raisetech.raisetechtask9.entity.Movie;
import net.raisetech.raisetechtask9.form.UpdateForm;
import net.raisetech.raisetechtask9.mapper.MovieMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieMapper movieMapper;

    public MovieServiceImpl(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    @Override
    public List<Movie> findAll() {
        return movieMapper.findAll();
    }

    @Override
    public Movie findById(int id) {
        return movieMapper.findById(id).orElseThrow(() -> new ResourceNotFoundException("resource not found"));
    }
    @Override
    public List<Movie> findByPublishedYear(Integer publishedYear) {
        return movieMapper.findByPublishedYear(publishedYear);
    }
    @Override
    public void createMovie(CreateForm form)  {
        movieMapper.createMovie(form);
    }

    @Override
    public void deleteById(int id) {
        movieMapper.deleteMovieId(id);
    }

    @Override
    public void updateById(int id,UpdateForm form){
        movieMapper.updateMovie(id,form);
    }
}
