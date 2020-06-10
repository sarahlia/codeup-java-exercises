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

    }
}
