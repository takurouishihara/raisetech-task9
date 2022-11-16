package net.raisetech.raisetechtask9.service;

import net.raisetech.raisetechtask9.ResourceNotFoundException;
import net.raisetech.raisetechtask9.entity.Movie;
import net.raisetech.raisetechtask9.mapper.MovieMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<Movie> findById(int id) {
        return movieMapper.findById(id);
    }
    @Override
    public Optional<Movie> findByPublished_Year(Integer published_Year) {
        return movieMapper.findByPublished_Year(published_Year);
    }
}
