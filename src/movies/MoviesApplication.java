package movies;

import util.Input;

import static movies.Movie.addMovie;

public class MoviesApplication {


    public static void main(String[] args) {

//        Movie mov = new Movie("bolt", "comedy");
//        mov.setName("raw");
//        System.out.println("mov.getName() = " + mov.getName());
//
//        Movie[] moreMovies = addMovie(MoviesArray.findAll(), new Movie("bolt", "comedy"));
//        for (Movie movie : moreMovies) {
//            System.out.println(movie.getName());
//        }

        while(true) {
            System.out.println("What would you like to do ?\n ");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - add a new movie");

            Input input = new Input();

            String resp = input.getString();

            if (resp.equals("1")) {
                for (Movie movie : MoviesArray.findAll()) {
                    System.out.println(movie.getName()+ " -- " + movie.getCategory());
                }
                continue;
            } else if (resp.equals("2")) {
                for (Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equals("animated")) {
                        System.out.println(movie.getName());
                    }
                }
                continue;
            } else if (resp.equals("3")) {
                for (Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equals("drama")) {
                        System.out.println(movie.getName());
                    }
                }
                continue;
            } else if (resp.equals("4")) {
                for (Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equals("horror")) {
                        System.out.println(movie.getName());
                    }
                }
                continue;
            } else if (resp.equals("5")) {
                for (Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equals("scifi")) {
                        System.out.println(movie.getName());
                    }
                }
                continue;
            } else if (resp.equals("6")) {

                Input inp = new Input();
                System.out.println("Enter a movie title and category separated by a space, i.e.: Matrix scifi");
                String str1 = inp.getString();
                String str2 = inp.getString();
                Movie newMovCat = new Movie(str1, str2);

                Movie[] moreMovies = addMovie(MoviesArray.findAll(), newMovCat);
                for (Movie movie : moreMovies) {
                    System.out.println(movie.getName() + " " + movie.getCategory());
                }
                continue;
            } else if (resp.equals("0")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Not a valid number choice, try again.");
                continue;
            }
        }

    }
}
