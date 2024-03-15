package cl.company.movies.apimovies.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie {

    private int id;
    private String titulo;
    private int año;
    private String director;
    private String género;
    private String sinopsis;

}
