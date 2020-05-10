package movies;

import java.util.Arrays;

public class Movie {
    private String name;
    private String category;

    //constructor
    public Movie(String aName, String aCategory) {
        this.name = aName;
        this.category = aCategory;
    }

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

    public static Movie[] addMovie(Movie[] arr, Movie obj) {
        Movie[] result = Arrays.copyOf(arr, arr.length + 1);
        result[result.length - 1] = obj;
        return result;
    }

}
