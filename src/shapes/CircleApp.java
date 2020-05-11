package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();

//        Circle circle = new Circle(input.getDouble());

//        System.out.println("circle.getArea() = " + circle.getArea());
//        System.out.println("circle.getCircumference() = " + circle.getCircumference());
//
        //bonus
        Circle aCircle;//declaring it out here..

        while(input.yesNo()) {
            aCircle = new Circle(input.getDouble()); //and assigning it here
            System.out.println("aCircle.getArea() = " + aCircle.getArea());
            System.out.println("aCircle.getCircumference() = " + aCircle.getCircumference());
        }

        System.out.println("Circle.getCount() = " + Circle.getCount());

    }

}
