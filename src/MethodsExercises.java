import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Factorial test.");
            factorial();
            System.out.println("Do you want to continue? [y/n]");
            String answer = sc.nextLine();
            if(answer.toLowerCase().equals("n")) {
                break;
            }
        }
//        System.out.println(2 == sum(1, 1));
//        System.out.println(0 == sum(-1, 1));
//        System.out.println(0 != sum(-2, -5));
//        System.out.println("add(3, 5) = " + add(3, 5));
//        System.out.println("subtract(10, 7) = " + subtract(10, 7));
//        System.out.println("multiply(6, 4) = " + multiply(6, 4));
//        System.out.println("multiply(4, -3) = " + multiply(4, -3));
//        System.out.println("divide(69, 23) = " + divide(69, 23));
//        System.out.println("modulus(13, 4) = " + modulus(13, 4));
//        getInteger(1, 10);
//        getFactorial(sc);
        factorial();
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

//    public static double multiply(double num1, double num2) {
//        return num1 * num2;
//    }

    public static double divide(double num1, double num2) {
        if (num2 ==0) {
            System.out.println("Cannot divide by 0.");
        }
        return num1 / num2;
    }

    public static double modulus(double num1, double num2) {
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
    public static double multiply(double num1, double num2) {
        if (num1 == 0 || num2 ==0 ) {
            return 0;
        } else if (num2 > 0) {
            return num1 + multiply(num1, num2 - 1);
        } else {
            return -num1 + multiply(num1, num2 + 1);
        }
    }

    //Exercise 2
    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
//        int userInput = Integer.parseInt(scan.nextLine());
        int userInput = scan.nextInt();

        //how to proceed:
        if ( userInput < min || userInput > max ) {
            System.out.println("Invalid number, try again.");
            return getInteger(min, max);
        } else {
            //how to stop
            System.out.println("The number is within range, thanks!");
            return userInput;
        }

    }

    //Exercise 3
    public static void factorial() {
        long userInput = getInteger(1, 10);
        long result = 1;
        System.out.println("userInput = " + userInput);
        for (long i = userInput; i >= 1; i--) {
            result = result * i;
        }
        System.out.println("factorial of " + userInput + " = " + result);

        }







}
