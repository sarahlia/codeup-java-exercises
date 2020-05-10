package movies;

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

    public static void main(String[] args) {
//        Movie mov = new Movie("star wars", "sci-fi");
//        System.out.println(mov.getName() + " is a " + mov.getCategory() + " movie.");
//        mov.setName("mulan");
    }
}
