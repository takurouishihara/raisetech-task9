package net.raisetech.raisetechtask9.controller;

import net.raisetech.raisetechtask9.entity.Movie;
import net.raisetech.raisetechtask9.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {



    private final MovieService movieService;
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    @GetMapping("/movies")
    public List<Movie> getMovies(){
        return movieService.findAll();

        //returnnameService.findAll().stream().map(NameResponse::new).toList();
    }


    }

