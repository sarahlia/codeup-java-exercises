package shapes;

public class Square extends Quadrilateral {
    public Square(double aSide) {
        super(aSide, aSide);
    }

//    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

//    @Override
    public void setWidth(double width) {
        this.setLength(width);
    }

//    @Override
    public double getPerimeter() {
        return 4 * length;
    }

//    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

}
