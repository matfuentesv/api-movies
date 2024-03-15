package cl.company.movies.apimovies.controller;

import cl.company.movies.apimovies.model.Movie;
import cl.company.movies.apimovies.service.MovieService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@Log
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping(value = "/peliculas", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Movie>> getAllMovies() {
        log.info("Se solicita la lista de todas las películas.");
        return ResponseEntity.ok(movieService.allMovie());
    }

    @GetMapping(value = "/peliculas/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Movie> findMovie(@PathVariable int id) {
        log.info("Se solicita la película con ID: " + id);
        return ResponseEntity.ok(movieService.findMovie(id));
    }
}

