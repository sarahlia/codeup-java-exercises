import javax.swing.*;
import java.util.function.DoubleToIntFunction;

public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello, World!");
        System.out.println("Hello, Sarah!");

        int myFavoriteNumber = 23;
        System.out.println(myFavoriteNumber);

        String myString = "Sarah";
        System.out.println(myString);

        float myNumber = 3.14f;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String class = "something";

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        System.out.println(x);
        y -= x;
        System.out.println(y);

//        short price = 90000;
//        System.out.println(price);

        short priceOfCar = 32767;
        priceOfCar++;
        System.out.println(priceOfCar);

        int gdpOfSmallCountry = 2147483647;
        gdpOfSmallCountry++;
        System.out.println(gdpOfSmallCountry);

        System.out.println("What is the maximum integer? " + Integer.MAX_VALUE);



    }

}

