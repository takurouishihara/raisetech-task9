package net.raisetech.raisetechtask9.service;

import net.raisetech.raisetechtask9.entity.Movie;
import net.raisetech.raisetechtask9.mapper.MovieMapper;
import net.raisetech.raisetechtask9.service.MovieService;

import java.util.List;

public class MovieServiceImpl implements MovieService {

    private final MovieMapper movieMapper;

    public MovieServiceImpl(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }


    @Override
    public List<Movie> findAll() {
        return movieMapper.findAll();
    }
}
