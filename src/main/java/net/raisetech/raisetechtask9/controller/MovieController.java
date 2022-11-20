package net.raisetech.raisetechtask9.controller;

import net.raisetech.raisetechtask9.ResourceNotFoundException;
import net.raisetech.raisetechtask9.entity.Movie;
import net.raisetech.raisetechtask9.service.MovieService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    @GetMapping("/movies/{id}")
    public Optional<Movie> getMovieId(@PathVariable("id") int id) {
        return Optional.ofNullable(movieService.findById(id).orElseThrow(() -> new ResourceNotFoundException("resource not found")));
    }
    @GetMapping("/movies")
    public List<MovieResponse> getMovies(@RequestParam(name = "published_year") Optional<Integer> publishedYear) {
        if (publishedYear.isEmpty()) {
            return movieService.findAll().stream().map(MovieResponse::new).toList();
        } else {
            return movieService.findByPublishedYear(publishedYear.get()).stream().map(MovieResponse::new).toList();
        }
    }
}
