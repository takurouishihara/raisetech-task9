package net.raisetech.raisetechtask9.controller;

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

    @GetMapping("/movies")
    public List<MovieResponse> getMovies(@RequestParam(name = "published_year") Optional<Integer> publishedYear) {
        if (publishedYear.isEmpty()) {
            return movieService.findAll().stream().map(MovieResponse::new).toList();
        } else {
            return movieService.findByPublished_year(publishedYear.get()).stream().map(MovieResponse::new).toList();
        }
    }
}
