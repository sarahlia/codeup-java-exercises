import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String args[]) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %,.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer");
//        int anInteger = scanner.nextInt();
//
//        System.out.printf("You entered %,d%n", anInteger);

//        System.out.println("Enter 3 words, each on a separate line.");
//        String wordOne = scanner.nextLine();
//        String wordTwo = scanner.nextLine();
//        String wordThree = scanner.nextLine();
//
//        System.out.printf("You like %s, hate %s, and are neutral about %s.", wordOne, wordTwo, wordThree);

//        System.out.println("Enter a sentence.");
////        String sentence = scanner.next();
//        String sentence = scanner.nextLine();

//        System.out.printf("%s", sentence);

        System.out.println("Enter length:");
        String aLength = scanner.nextLine();
        int length = Integer.parseInt(aLength);
        System.out.println(length);

        System.out.println("Enter width:");
        String aWidth = scanner.nextLine();

        int width = Integer.parseInt(aWidth);
        System.out.println(width);

        int perimeter = 2 * (length + width);
        System.out.printf("The perimeter is %,d%n", perimeter);

        int area = length * width;
        System.out.printf("The area is %,d", area);









    }
}
