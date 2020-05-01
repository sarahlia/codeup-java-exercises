import java.util.Scanner;

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

        System.out.println("Enter a sentence.");
//        String sentence = scanner.next();
        String sentence = scanner.nextLine();

        System.out.printf("%s", sentence);




    }
}
