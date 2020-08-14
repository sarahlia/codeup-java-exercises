package homepractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Mockprep {
    public static void main(String[] args) {

        //Make an ArrayList of Strings with 3 string objects
//        ArrayList<String> anArray = new ArrayList<>();
//        anArray.add("a");
//        anArray.add("b");
//        anArray.add("c");
//        System.out.println(anArray);

        //Fizz/Buzz: numbers divisible by 3: Fizz, numbers divisible by 5: Buzz, numbers divisible by both 3 AND 5: FizzBuzz
//        for(int i=1; i<=100; i++) {
//            if(i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if(i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //call countToThirtyFive method
//        countToThirtyFive();

        //call countTo method
//        countTo(17);


        // We'll start by defining a hash map
//        HashMap<String, Integer> students = new HashMap<>();

// and putting some data into it
//        students.put("Ryan", 1);
//        students.put("Zach", 5);
//        students.put("Fernando", 2);
//        students.put("Justin", 19);
//
//        System.out.println(students);

// obtaining values from the hash map by key
//        System.out.println("students.get(\"Ryan\") = " + students.get("Ryan"));
//        System.out.println("students.get(\"Phillip\") = " + students.get("Phillip"));
//        System.out.println("students.getOrDefault(\"Jason\", 0) = " + students.getOrDefault("Jason", 0));

// checking if keys or values are present
//        System.out.println("students.containsKey(\"Justin\") = " + students.containsKey("Justin"));
//        System.out.println("students.containsValue(4) = " + students.containsValue(4));
//    }

    //Write a Java for loop method that prints out 0 to 35 when called
//    public static void countToThirtyFive() {
//        for(int i = 0; i <= 35; i++) {
//            System.out.println(i);
//        }


       //SWITCH STATEMENT

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
                break;
        }

//        int caseSwitch = 1;
//
//        switch (caseSwitch) {
//            case 1:
//                System.out.println("Case 1");
//                // Fall through!
//            case 2:
//                System.out.println("Case 2");
//                break;
//            default:
//                System.out.println("Default case");
//                break;
//        }

    }

    //Write a Java method that takes in a parameter and counts up to that parameter
//    public static void countTo(int param) {
//        for(int i = 0; i <= param; i++) {
//            System.out.println(i);
//        }
//
//
//    }


    //In an array of integers, every element appears twice except for one. Find it.
    //HashMap method:
    public int singleNumber(int[] numbers) {
        HashMap<Integer, Integer> table = new HashMap<>();

        for(int el:numbers) {
            table.put(el, table.getOrDefault(el, 0) + 1);
        }
        for(int el:numbers) {
            if (table.get(el) == 1) {
                return el;
            }
        }

        return 0;
    }


}
