import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);

//        System.out.println("Enter an integer");
//        int anInteger = scanner.nextInt();
//
//        System.out.println("You entered " + anInteger);


//        System.out.println("Enter 3 words, each on a separate line.");
//        String wordOne = scanner.nextLine();
//        String wordTwo = scanner.nextLine();
//        String wordThree = scanner.nextLine();
//
//        System.out.printf("You like %s, hate %s, and are neutral about %s.", wordOne, wordTwo, wordThree);

//        System.out.println("Enter a sentence.");
//        String sentence = scanner.next();//this is just for show-and-tell. will only output the first word.
//        String sentence = scanner.nextLine();

//        System.out.printf("%s", sentence);

        System.out.println("Enter length:");
        float aLength = Float.parseFloat(scanner.nextLine());
        System.out.println(aLength);

        System.out.println("Enter width:");
        float aWidth = Float.parseFloat(scanner.nextLine());

        float perimeter = 2 * (aLength + aWidth);
        System.out.println("The perimeter is " + perimeter);

        float area = aLength * aWidth;
        System.out.println("The area is " + area);


    }
}
