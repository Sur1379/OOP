package com.company.films.persistance;

import com.company.films.service.model.director.Director;
import com.company.films.service.movie.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private static final List<Movie> movieList = new ArrayList<>();
    private static final List<Director> directorList = new ArrayList<>();


    public static List<Movie> getMovieList() {
        return movieList;
    }

    public static List<Director> getDirectorList() {
        return directorList;
    }

}
