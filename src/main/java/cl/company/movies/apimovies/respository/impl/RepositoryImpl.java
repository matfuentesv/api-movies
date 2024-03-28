package cl.company.movies.apimovies.respository.impl;

import cl.company.movies.apimovies.model.Movie;
import cl.company.movies.apimovies.respository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


import java.util.ArrayList;
import java.util.List;


@org.springframework.stereotype.Repository
public class RepositoryImpl implements Repository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<String> findAllNames() {
        return jdbcTemplate.queryForList("SELECT NOMBRE_COMUNA FROM COMUNA", String.class);
    }

    @Override
    public List<Movie> movies() {

        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie(1, "Inception", 2010, "Christopher Nolan", "Sci-Fi", "https://www.imdb.com/title/tt1375666/"));
        movieList.add(new Movie(2, "The Shawshank Redemption", 1994, "Frank Darabont", "Drama", "https://www.imdb.com/title/tt0111161/"));
        movieList.add(new Movie(3, "The Godfather", 1972, "Francis Ford Coppola", "Crime", "https://www.imdb.com/title/tt0068646/"));
        movieList.add(new Movie(4, "The Dark Knight", 2008, "Christopher Nolan", "Action", "https://www.imdb.com/title/tt0468569/"));
        movieList.add(new Movie(5, "Pulp Fiction", 1994, "Quentin Tarantino", "Crime", "https://www.imdb.com/title/tt0110912/"));
        movieList.add(new Movie(6, "Forrest Gump", 1994, "Robert Zemeckis", "Drama", "https://www.imdb.com/title/tt0109830/"));
        movieList.add(new Movie(7, "The Matrix", 1999, "Lana Wachowski, Lilly Wachowski", "Sci-Fi", "https://www.imdb.com/title/tt0133093/"));
        movieList.add(new Movie(8, "The Lord of the Rings: The Return of the King", 2003, "Peter Jackson", "Adventure", "https://www.imdb.com/title/tt0167260/"));
        movieList.add(new Movie(9, "Schindler's List", 1993, "Steven Spielberg", "Biography", "https://www.imdb.com/title/tt0108052/"));
        movieList.add(new Movie(10, "Fight Club", 1999, "David Fincher", "Drama", "https://www.imdb.com/title/tt0137523/"));
        return movieList;
    }
}
