package shapes;

public class Circle {

    private double radius;
    static private int counter = 0;

    //constructor
    public Circle(double aRadius) {
        this.radius = aRadius;
        counter++; //bonus only
    }

    //bonus only: create a getCount method
    public static int getCount() {
        return counter++;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

}
