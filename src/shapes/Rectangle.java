package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double aLength, double aWidth) {
        super(aLength, aWidth);
    }

//    @Override
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

//    @Override
    public double getArea() {
        return this.length * this.width;
    }

//    @Override
    public void setLength(double length) {
        this.length = length;
    }

//    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}