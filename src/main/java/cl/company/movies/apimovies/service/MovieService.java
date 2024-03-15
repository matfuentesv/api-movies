package cl.company.movies.apimovies.service;

import cl.company.movies.apimovies.model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> allMovie();
    Movie findMovie(int id);
}
