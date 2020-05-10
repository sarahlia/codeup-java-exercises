package movies;

import util.Input;

public class MoviesApplication {


    public static void main(String[] args) {

        while(true) {
            System.out.println("What would you like to do ?\n ");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");

            Input input = new Input();
//            int userResponse = input.getInt(0, 5);
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
