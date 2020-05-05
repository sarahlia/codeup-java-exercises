import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//
//        int counter = 0;
//        do {
//            System.out.println("From a do-while loop. counter = " + counter);
//            counter += 2;
//        } while (counter <= 100);
//
//        int x = 100;
//        do {
//            System.out.println("Do-while loop, counting backwards from 100. x = " + x);
//            x -= 5;
//        } while (x >= -10);
//
//        int y = 1;
//        do {
//            System.out.println("Do-while loop. " + (int) Math.pow(2, y));
//            y *= 2;
//        } while (y <= 16);

        //DOUGLAS WAY:
//        long counter = 2L;
//        do {
//            System.out.println(counter);
//            counter *= counter;
//        } while(counter < 1000000L);

        //Exercise 1. Using for loop instead:
//        for(int i = 5; i <= 15; i++) {
//            System.out.println("From a for loop. i = " + i);
//        }
//
//        for(int counter = 0; counter <= 100; counter += 2) {
//            System.out.println("From a for loop, counting up to 100 by 2s. " + counter);
//        }
//
//        for(int x = 100; x >= -10; x -=5) {
//            System.out.println("For loop, counting backwards from 100 by 5s. " + x);
//        }
//
//        for(int y = 1; y <= 16; y *=2) {
//            int intResult = (int) Math.pow(2,y);
//            System.out.println("Squares using for loop. " + intResult);
//        }
//
        //DOUGLAS WAY:
//        for(long counter = 2L; counter < 1000000; counter *= counter) {
//            System.out.println(counter);
//        }

        //Exercise 2
//        for(int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//           if ((i % 5 == 0) && (i % 3 == 0)) {  //or the previous line can be written like this
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0 ) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //Exercise 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What number would you like to go up to? Enter an integer:");
//        int userInput = Integer.parseInt(sc.nextLine());
//
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for(int i = 1; i <= userInput; i++) {
//            int square = (int) Math.pow(i, 2);
//            int cube = (int) Math.pow(i, 3);
//            System.out.println(i);
//            System.out.println(square);
//            System.out.printf("%1d      | %2d      | %3d      %n", i, square, cube);
//            System.out.println("Continue? [y/n]");
//            String userConfirm = sc.nextLine();
//            boolean confirmation = userConfirm.equals("y");
//            if (confirmation) {
//                continue;
//            } else {
//                break;
//            }

//        }

        //DOUGLAS' WAY
//        Scanner scan = new Scanner(System.in);
//
//        boolean userContinues = true;
//
//        do {
//            System.out.println("What number would you like to go up to?");
//            int userInt = scan.nextInt(); //Integer.parseInt( sc.nextInt() ) is fine too here.
//            System.out.println();
//            System.out.println("Here is your table!");
//            System.out.println();
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for(int i = 1; i <= userInt; i++) {
//                System.out.format("%-6d", i);
//                System.out.print(" | ");
//                System.out.format("%-7d", i * i);
//                System.out.print(" | ");
//                System.out.print(i * i * i);
//                System.out.println();
//            }
//            System.out.print("Would you like to enter another number (y/n) ");
//            String userResponse = scan.next();
//            if (!userResponse.equalsIgnoreCase("y")) {
//                userContinues = false;
//            }
//        } while (userContinues);

        //Exercise 4
//    for (int i = 0; i <= 100; i++) {
//        System.out.println("Enter a numerical grade from 0 to 100:");
//
//        int inputGrade = Integer.parseInt(sc.nextLine());
//        System.out.println(inputGrade);
//         if (inputGrade >= 88) {
//             System.out.println("The corresponding letter grade: A");
//         } else if (inputGrade >= 80) {
//             System.out.println("The corresponding letter grade: B");
//         } else if (inputGrade >= 67) {
//             System.out.println("The corresponding letter grade: C");
//         } else if (inputGrade >= 60) {
//             System.out.println("The corresponding letter grade: D");
//         } else {
//             System.out.println("The corresponding letter grade: F");
//         }
//
//         System.out.println("Continue? [y/n]");
//         String userConf = sc.nextLine();
//         boolean confirmation = userConf.equals("y");
//         if (confirmation) {
//             continue;
//         } else {
//             break;
//         }
//    }

        //DOUGLAS' WAY
//        Scanner scanner = new Scanner(System.in);
//
//        boolean anotherGrade = true;
//
//        do {
//            System.out.println("Please enter a numerical grade from 0 to 100:");
//
//            int numericGrade = scanner.nextInt(); //.nextLine works too, with Integer.parseInt
//
//            if (numericGrade >= 88) {
//                System.out.println("The corresponding letter grade: A");
//            } else if (numericGrade >= 80) {
//                System.out.println("The corresponding letter grade: B");
//            } else if (numericGrade >= 67) {
//                System.out.println("The corresponding letter grade: C");
//            } else if (numericGrade >= 60) {
//                System.out.println("The corresponding letter grade: D");
//            } else {
//                System.out.println("The corresponding letter grade: F");
//            }
//
//            System.out.println("Do you want to enter a new grade?");
//            String userResponse = scanner.next();
//            if (!userResponse.equalsIgnoreCase("y")) {
//                anotherGrade = false;
//            }
//        } while (anotherGrade);


    }
}
