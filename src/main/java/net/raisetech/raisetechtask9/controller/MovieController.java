package net.raisetech.raisetechtask9.controller;

import net.raisetech.raisetechtask9.service.MovieService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class MovieController {
    private final MovieService movieService;
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    @GetMapping("/movies")
    public List<MovieResponse> getMovies() {
        return movieService.findAll().stream().map(MovieResponse::new).toList();
    }
    @GetMapping("/published_year")
    public List<MovieResponse> getPublished_year(@RequestParam("published_year") Integer published_year){
        return movieService.findByPublished_year(published_year).stream().map(MovieResponse::new).toList();
    }
}
