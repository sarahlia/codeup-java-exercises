package homepractice;

import java.sql.SQLOutput;
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
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an integer:");
        int i = scan.nextInt();

        System.out.println("enter a decimal number:");
        double d = scan.nextDouble();

        System.out.println("enter a welcome message:");
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);



    }
}
