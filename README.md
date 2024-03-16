# api-movies

Api encargada de listar peliculas,entregando la siguiente información:

   ● id
   ● titulo
   ● ano
   ● director
   ● genero
   ● sinopsis

## Uso básico
```http
GET /peliculas                       : Lista el total de peliculas
GET /peliculas/{id}                  : Busca una pelicula por id
```


### Consultar todas las películas

GET /peliculas

Respuesta:

```json
[
    {
        "id": 1,
        "titulo": "Inception",
        "ano": 2010,
        "director": "Christopher Nolan",
        "genero": "Sci-Fi",
        "sinopsis": "https://www.imdb.com/title/tt1375666/"
    },
    {
        "id": 2,
        "titulo": "The Shawshank Redemption",
        "ano": 1994,
        "director": "Frank Darabont",
        "genero": "Drama",
        "sinopsis": "https://www.imdb.com/title/tt0111161/"
    },
    {
        "id": 3,
        "titulo": "The Godfather",
        "ano": 1972,
        "director": "Francis Ford Coppola",
        "genero": "Crime",
        "sinopsis": "https://www.imdb.com/title/tt0068646/"
    },
    {
        "id": 4,
        "titulo": "The Dark Knight",
        "ano": 2008,
        "director": "Christopher Nolan",
        "genero": "Action",
        "sinopsis": "https://www.imdb.com/title/tt0468569/"
    },
    {
        "id": 5,
        "titulo": "Pulp Fiction",
        "ano": 1994,
        "director": "Quentin Tarantino",
        "genero": "Crime",
        "sinopsis": "https://www.imdb.com/title/tt0110912/"
    },
    {
        "id": 6,
        "titulo": "Forrest Gump",
        "ano": 1994,
        "director": "Robert Zemeckis",
        "genero": "Drama",
        "sinopsis": "https://www.imdb.com/title/tt0109830/"
    },
    {
        "id": 7,
        "titulo": "The Matrix",
        "ano": 1999,
        "director": "Lana Wachowski, Lilly Wachowski",
        "genero": "Sci-Fi",
        "sinopsis": "https://www.imdb.com/title/tt0133093/"
    },
    {
        "id": 8,
        "titulo": "The Lord of the Rings: The Return of the King",
        "ano": 2003,
        "director": "Peter Jackson",
        "genero": "Adventure",
        "sinopsis": "https://www.imdb.com/title/tt0167260/"
    },
    {
        "id": 9,
        "titulo": "Schindler's List",
        "ano": 1993,
        "director": "Steven Spielberg",
        "genero": "Biography",
        "sinopsis": "https://www.imdb.com/title/tt0108052/"
    },
    {
        "id": 10,
        "titulo": "Fight Club",
        "ano": 1999,
        "director": "David Fincher",
        "genero": "Drama",
        "sinopsis": "https://www.imdb.com/title/tt0137523/"
    }
]
```

### Consultar peliculas por 'id'

GET /peliculas/1
```

Respuesta:

{
    "id": 1,
    "titulo": "Inception",
    "ano": 2010,
    "director": "Christopher Nolan",
    "genero": "Sci-Fi",
    "sinopsis": "https://www.imdb.com/title/tt1375666/"
}