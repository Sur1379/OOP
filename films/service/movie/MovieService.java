package com.company.films.service.movie;

import com.company.films.controller.model.movie.Genre;
import com.company.films.controller.model.movie.MovieRequest;
import com.company.films.persistance.Database;
import com.company.films.service.movie.model.Movie;
import com.company.films.util.Validator;

import java.util.List;

public class MovieService {

    public static void create(MovieRequest movieRequest) {
        Validator.checkMovie(movieRequest);
        Movie movie = buildMovie(movieRequest);
        Database.getMovieList().add(movie);
    }

    public static Movie readById(int id) {
        Movie movie = null;
        for (int i = 0; i < Database.getMovieList().size(); i++) {
            if (Database.getMovieList().get(i).getID() == id) {
                movie = Database.getMovieList().get(i);
            }
        }
        return movie;
    }

    public static List<Movie> readAll() {
        return Database.getMovieList();
    }

    public static void updateName(int index, String updatedName) {
        Database.getMovieList().get(index).setName(updatedName);
    }

    public static void updateYear(int index, int updatedYear) {
        Database.getMovieList().get(index).setYear(updatedYear);
    }

    public static void updateRating(int index, int updatedRating) {
        Database.getMovieList().get(index).setRating(updatedRating);
    }

    public static void updateGenre(int index, Genre genre) {
        Database.getMovieList().get(index).setGenre(genre);
    }

    public static void deleteById(int index) {
        Database.getMovieList().remove(index);
    }

    private static Movie buildMovie(MovieRequest movieRequest) {
        Movie movie = new Movie();
        movie.setName(movieRequest.getName());
        movie.setGenre(Validator.checkGenre(movieRequest.getGenre()));
        calculateCurrentId(movie);
        movie.setYear(movieRequest.getYear());
        movie.setRating(movieRequest.getRating());
        return movie;
    }

    private static void calculateCurrentId(Movie movie) {
        if (Database.getMovieList().isEmpty()) {
            movie.setID(1);
        } else {
            movie.setID(Database.getMovieList().get(Database.getMovieList().size() - 1).getID() + 1);
        }
    }
}
