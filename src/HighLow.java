import java.util.Scanner;

//Exercise 5: High - low game
public class HighLow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        highLow(scan);
    }

    public static void highLow(Scanner scan) {
        int range = 100 - 1 + 1;
        int numberToGuess = ((int) (Math.random() * range) +1);
//        System.out.println("numberToGuess = " + numberToGuess);

        while(true) {
            System.out.println("Guess a number between 1 and 100: ");
            int userInput = Integer.parseInt(scan.nextLine());
            if (userInput > numberToGuess) {
                System.out.println("Lower");
            } else if ( userInput < numberToGuess) {
                System.out.println("Higher");
            } else {
                System.out.println("Good guess");
                break;
            }
        }

    }



}
