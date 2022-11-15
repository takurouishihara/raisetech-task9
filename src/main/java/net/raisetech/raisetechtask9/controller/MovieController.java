package net.raisetech.raisetechtask9.controller;

import net.raisetech.raisetechtask9.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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
        @GetMapping("/movies/{age}")
        public List<AgeResponse> getAge (@RequestParam("age") Integer age){
            return movieService.findByAge(age).stream().map(AgeResponse::new).toList();
        }
    }
