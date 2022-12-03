package net.raisetech.raisetechtask9.controller;

import net.raisetech.raisetechtask9.entity.Movie;
import net.raisetech.raisetechtask9.form.CreateForm;
import net.raisetech.raisetechtask9.form.UpdateForm;
import net.raisetech.raisetechtask9.service.MovieService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    @GetMapping("/movies/{id}")
    public Movie getById(@PathVariable("id") int id) {
        return movieService.findById(id);
    }
    @GetMapping("/movies")
    public List<MovieResponse> getMovies(@RequestParam(name = "publishedYear") Optional<Integer> publishedYear) {
        if (publishedYear.isEmpty()) {
            return movieService.findAll().stream().map(MovieResponse::new).toList();
        } else {
            return movieService.findByPublishedYear(publishedYear.get()).stream().map(MovieResponse::new).toList();
        }
    }

    @PostMapping("/movies")
    public Map<String, String> createMovie(@Validated @RequestBody CreateForm form) {
        movieService.createMovie(form);
        return Map.of("message","映画の登録に成功しました。");
    }

    @DeleteMapping("/movies/{id}")
    public Map<String, String> deleteMovie(@Validated @PathVariable("id") int id) {
        movieService.deleteById(id);
        return Map.of("message", "映画の削除に成功しました。");
    }

    @PatchMapping("/movies/{id}")
    public Map<String, String> updateMovie(@Validated @PathVariable("id") int id, @RequestBody UpdateForm form) {
        movieService.updateById(id,form);
        return Map.of("message", "映画の更新に成功しました。");
    }
}
