import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("add(3, 5) = " + add(3, 5));
//        System.out.println("subtract(10, 7) = " + subtract(10, 7));
//        System.out.println("multiply(6, 4) = " + multiply(6, 4));
//        System.out.println("multiply(4, -3) = " + multiply(4, -3));
//        System.out.println("divide(69, 23) = " + divide(69, 23));
//        System.out.println("modulus(13, 4) = " + modulus(13, 4));
//          getInteger(sc);
//        System.out.println(getInteger(1, 10));
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

//    public static int multiply(int num1, int num2) {
//        return num1 * num2;
//    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    //exercise 1 bonus using for loop
//    public static int multiply(int num1, int num2) {
//        int result = 1;
//        for(int i = 1; i <= num2; i++) {
//            result = result + num1;
//        }
//        return result - 1;
//    }

    //exercise 1 bonus using recursion
    public static int multiply(int num1, int num2) {
        if (num1 == 0 || num2 ==0 ) {
            return 0;
        } else if (num2 > 0) {
            return num1 + multiply(num1, num2 - 1);
        } else {
            return -num1 + multiply(num1, num2 + 1);
        }
    }

    //Exercise 2
//    public static void getInteger(Scanner min) {
//        System.out.println("Enter a number between 1 and 10: ");
//        int userInput = Integer.parseInt(min.nextLine());
//        int userInput = min.nextInt();
//        if (userInput >= 1 && userInput <= 10) {
//            System.out.println("You've entered a valid number. Thank you.");
//            return;
//        }
//        System.out.println("Invalid number. Try again.");
//        getInteger(min);
//    }

    //trial
//    public static int getInteger(int min, int max) {
//        if ( (min >= 1) && (max <= 10) ) {
//            return min;
//        }
//        System.out.println("Invalid number, try again.");
//        return getInteger(min, max);
//    }






}
