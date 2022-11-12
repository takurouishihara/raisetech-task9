package net.raisetech.raisetechtask9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    private final MovieMapper movieMapper;

    public MovieController(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    @GetMapping("/movies")
    public List<Movie> getMovies(){
        List<Movie> movies = movieMapper.findAll();
        return movies;
    }


    }

