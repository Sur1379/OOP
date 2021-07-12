package com.company.films.controller;

import com.company.films.controller.model.movie.MovieRequest;
import com.company.films.persistance.Database;
import com.company.films.service.movie.MovieService;
import com.company.films.util.Validator;

import java.util.Scanner;

public class MovieController {

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("For add film press 1");
        System.out.println("For read by ID press 2");
        System.out.println("For read all press 3");
        System.out.println("For update by ID press 4");
        System.out.println("For delete by ID press 5");
        System.out.println("For exit press any key");
        String input = scanner.next();
        switch (input) {
            case "1":
                create();
                break;
            case "2":
                readById();
                break;
            case "3":
                readAll();
                break;
            case "4":
                update();
            case "5":
                delete();
            default:
                break;
        }
    }

    static void create() {
        MovieRequest movieRequest = new MovieRequest();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the genre of movie");
        movieRequest.setGenre(scanner.next());
        System.out.println("Enter the name of movie");
        movieRequest.setName(scanner.next());
        System.out.println("Enter the year of movie");
        movieRequest.setYear(scanner.nextInt());
        System.out.println("Enter the rating of movie");
        movieRequest.setRating(scanner.nextInt());
        MovieService.create(movieRequest);
    }

    public static void readById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ID of film");
        int id = scanner.nextInt() - 1;
        if (Database.getMovieList().isEmpty()) {
            throw new IllegalArgumentException("Directory is empty");
        }
        if (id > Database.getMovieList().size() - 1 || id < 0) {
            throw new ArrayIndexOutOfBoundsException("Illegal ID");
        }

//        MovieService.readById();
        System.out.println(MovieService.readById(id));
        start();
    }

    public static void readAll() {
        if (Database.getMovieList().isEmpty()) {
            throw new IllegalArgumentException("Directory is empty");
        }
        System.out.println(MovieService.readAll());
        start();
    }

    public static void update() {
        Scanner scanner = new Scanner(System.in);
        if (Database.getMovieList().isEmpty()) {
            throw new IllegalArgumentException("Directory is empty");
        }
        System.out.println("Input ID for update");
        int index = scanner.nextInt() - 1;
        if (index > Database.getMovieList().size() - 1 || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Illegal ID");
        }
        for (int i = 0; i < Database.getMovieList().size(); i++) {
            if (Database.getMovieList().get(i).getID() == index) {
                System.out.println("For update all fields press 1");
                System.out.println("For update name press 2");
                System.out.println("For update year press 3");
                System.out.println("For update genre press 4");
                System.out.println("For update rating press 5");
                System.out.println("For update director press 6");
                MovieRequest movieRequest = new MovieRequest();
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Input the genre of film");
                        movieRequest.setGenre(scanner.next());
                        MovieService.updateGenre(index, Validator.checkGenre(movieRequest.getGenre()));
                        System.out.println("Input the name of film");
                        movieRequest.setName(scanner.next());
                        Validator.checkName(movieRequest.getName());
                        System.out.println("Input the year of film");
                        movieRequest.setYear(scanner.nextInt());
                        Validator.checkYear(movieRequest.getYear());
                        System.out.println("Input the rating of film");
                        movieRequest.setRating(scanner.nextInt());
                        Validator.checkRating(movieRequest.getRating());
                        MovieService.updateName(index, movieRequest.getName());
                        MovieService.updateYear(index, movieRequest.getYear());
                        MovieService.updateRating(index, movieRequest.getRating());
                        break;
                    case 2:
                        System.out.println("Input the name of film");
                        movieRequest.setName(scanner.next());
                        Validator.checkName(movieRequest.getName());
                        MovieService.updateName(index, movieRequest.getName());
                        break;
                    case 3:
                        System.out.println("Input the year of film");
                        movieRequest.setYear(scanner.nextInt());
                        Validator.checkYear(movieRequest.getYear());
                        MovieService.updateYear(index, movieRequest.getYear());
                        break;
                    case 4:
                        System.out.println("Input the genre of film");
                        movieRequest.setGenre(scanner.next());
                        MovieService.updateGenre(index, Validator.checkGenre(movieRequest.getGenre()));
                        break;
                    case 5:
                        System.out.println("Input the rating of film");
                        movieRequest.setRating(scanner.nextInt());
                        Validator.checkRating(movieRequest.getRating());
                        MovieService.updateRating(index, movieRequest.getRating());
                        break;
                }
            } else if (i == Database.getMovieList().size() - 1) {
                throw new IllegalArgumentException("No much ID found");
            }
        }


    }

    public static void delete() {
        Scanner scanner = new Scanner(System.in);
        if (Database.getMovieList().isEmpty()) {
            throw new IllegalArgumentException("Directory is empty");
        }
        System.out.println("Input the ID for movie");
        int index = scanner.nextInt() - 1;
        if (index > Database.getMovieList().size() - 1 || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Illegal ID");
        }
        MovieService.deleteById(index);
    }
}
