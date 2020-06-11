package homepractice;

import java.util.ArrayList;

public class Mockprep {
    public static void main(String[] args) {

        //Make an ArrayList of Strings with 3 string objects
        ArrayList<String> anArray = new ArrayList<>();
        anArray.add("a");
        anArray.add("b");
        anArray.add("c");
        System.out.println(anArray);

        //Fizz/Buzz: numbers divisible by 3: Fizz, numbers divisible by 5: Buzz, numbers divisible by both 3 AND 5: FizzBuzz
        for(int i=1; i<=100; i++) {
            if(i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        //call countToThirtyFive method
        countToThirtyFive();

        //call countTo method
        countTo(17);

    }

    //Write a Java for loop method that prints out 0 to 35 when called
    public static void countToThirtyFive() {
        for(int i = 0; i <= 35; i++) {
            System.out.println(i);
        }
    }

    //Write a Java method that takes in a parameter and counts up to that parameter
    public static void countTo(int param) {
        for(int i = 0; i <= param; i++) {
            System.out.println(i);
        }
    }

}
