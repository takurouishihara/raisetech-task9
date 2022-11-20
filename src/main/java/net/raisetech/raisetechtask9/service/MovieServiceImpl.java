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
        return Optional.ofNullable(movieMapper.findById(id).orElseThrow(() -> new ResourceNotFoundException("resource not found")));
    }
    @Override
    public List<Movie> findByPublishedYear(Integer publishedYear) {
        return movieMapper.findByPublishedYear(publishedYear);
    }
}
