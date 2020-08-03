package homepractice;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class HackerRank {


    public static void main(String[] args) {

        //Given an integer, n , perform the following conditional actions:
        //If n is odd, print Weird
        //If n is even and in the inclusive range of  to , print Not Weird
        //If n is even and in the inclusive range of  to , print Weird
        //If n is even and greater than , print Not Weird
//        for(int n = 1; n <= 100; n++ ) {
//            if ((n % 2 == 0) && (n > 20) || (n == 2) || (n == 4))  {
//                System.out.println(n + "Not Weird");
//            } else {
//                System.out.println(n + "Weird");
//            }
//        }

//        In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below. To make the problem a little easier, a portion of the code is provided for you in the editor.
//                Input Format
//        There are three lines of input:
//        The first line contains an integer.
//        The second line contains a double.
//        The third line contains a String.
//                Output Format
//        There are three lines of output:
//        On the first line, print String: followed by the unaltered String read from stdin.
//        On the second line, print Double: followed by the unaltered double read from stdin.
//        On the third line, print Int: followed by the unaltered integer read from stdin.
//        To make the problem easier, a portion of the code is already provided in the editor.
//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter an integer:");
//        int i = scan.nextInt();
//
//        System.out.println("enter a decimal number:");
//        double d = scan.nextDouble();
//
//        System.out.println("enter a welcome message:");
//        scan.nextLine();
//        String s = scan.nextLine();
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);


//        Print the following using printf
//        Sample Input
//        java 100
//        cpp 65
//        python 50

//        Sample Output
//        ================================
//        java           100
//        cpp            065
//        python         050
//        ================================
//        Each String is left-justified with trailing whitespace through the first  characters. The leading digit of the integer is the  character, and each integer that was less than  digits now has leading zeroes.

//        Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int a=0;a<3;a++){
//            System.out.println("Enter words:");
//            String s1=sc.next();
//
//            System.out.println("Enter numbers:");
//            int x=sc.nextInt();
//            System.out.printf("%-15s%03d%n", s1, x);
//        }
//        System.out.println("================================");

//        Print the following output
//        Sample Output
//        2 x 1 = 2
//        2 x 2 = 4
//        2 x 3 = 6
//        2 x 4 = 8
//        2 x 5 = 10
//        2 x 6 = 12
//        2 x 7 = 14
//        2 x 8 = 16
//        2 x 9 = 18
//        2 x 10 = 20
//        for(int N = 1; N <= 10; N++) {
//            System.out.println("2 x " + N + " = " + (2*N));
//        }
//
//        int r = 0;
//        int e = 2;
//        int f = 10;
//        int g = r;
//        for(int h=0; h<= f-1; h++){
//            g += (Math.pow(2, h) * e);
//            System.out.printf("%d ", g);
//        }
//        System.out.printf("%n");
//
//        int a = 5;
//        int b = 3;
//        int n = 5;
//        int c = a;
//        for(int y=0; y<= n-1; y++){
//            c += (Math.pow(2, y) * b);
//            System.out.printf("%d ", c);
//        }

        //currency formatter problem:
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter amount:");
//        double payment = scanner.nextDouble();
//        scanner.close();
//
//        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
//        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
//        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
//        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
//
//        String us = usFormat.format(payment);
//        String india = indiaFormat.format(payment);
//        String china = chinaFormat.format(payment);
//        String france = franceFormat.format(payment);
//
//        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);

        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();


    }

//    ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
