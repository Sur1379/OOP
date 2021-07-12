package com.company.films.util;

import com.company.films.controller.model.movie.Genre;
import com.company.films.controller.model.movie.MovieRequest;

import java.util.Locale;

public class Validator {

    public static void checkMovie(MovieRequest movieRequest) {
        checkName(movieRequest.getName());
        checkYear(movieRequest.getYear());
        checkRating(movieRequest.getRating());
    }

    public static Genre checkGenre(String genre) {
        Genre genre1;
        genre = genre.toUpperCase(Locale.ROOT);
        switch (genre) {
            case "THRILLER":
                genre1 = Genre.THRILLER;
                break;
            case "DRAMA":
                genre1 = Genre.DRAMA;
                break;
            case "ACTION":
                genre1 = Genre.ACTION;
                break;
            case "FANTASY":
                genre1 = Genre.FANTASY;
                break;
            case "COMEDY":
                genre1 = Genre.COMEDY;
                break;
            case "ROMANCE":
                genre1 = Genre.ROMANCE;
                break;
            case "HORROR":
                genre1 = Genre.HORROR;
                break;
            default:
                throw new IllegalArgumentException("Illegal genre");
        }
        return genre1;
    }

    public static void checkName(String name) {
        if (name == null) {
            throw new NullPointerException();
        }
    }

    public static void checkYear(int year) {
        if (year > 2021 || year < 1900) {
            throw new IllegalArgumentException("Illegal year");
        }
    }

    public static void checkRating(int rating) {
        if (rating > 5 || rating < 1) {
            throw new IllegalArgumentException("Illegal rating");
        }
    }
}
