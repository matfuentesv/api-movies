package cl.company.movies.apimovies.service.impl;

import cl.company.movies.apimovies.model.Movie;
import cl.company.movies.apimovies.respository.Repository;
import cl.company.movies.apimovies.service.MovieService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Log
public class MovieServiceImpl implements MovieService {

    @Autowired
    private Repository repository;

    @Override
    public List<Movie> allMovie() {
        log.info("Se solicitó la lista de todas las películas.");
        List<String>profesional = repository.findAllNames();
        return repository.movies();
    }

    @Override
    public Movie findMovie(int id) {
        log.info("Se solicitó la película con ID: " + id);
        return repository
                .movies()
                .stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(new Movie());
    }
}
