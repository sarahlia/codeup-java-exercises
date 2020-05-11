package shapes;

public class Square extends Rectangle {

//    constructor
    public Square(double aSide) {
        super(aSide, aSide);
    }


    public double getArea() {
        return Math.pow(super.length, 2);
    }

    public double getPerimeter() {
        return 4 * super.length;
    }


}
