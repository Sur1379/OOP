package com.company.films.service.movie.model;

import com.company.films.controller.model.movie.Genre;
import com.company.films.service.model.director.Director;

public class Movie {

    private Genre genre;
    private String name;
    private int ID;
    private Director director;
    private int year;
    private int rating;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "genre =" + genre +
                ", name ='" + name + '\'' +
                ", ID =" + ID +
                ", director =" + director +
                ", year =" + year +
                ", rating =" + rating +
                "}\n";
    }
}
