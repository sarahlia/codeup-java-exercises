import java.util.Scanner;

public class Bob {
     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          for(int i = 0; i <= 10; i++) {
             System.out.println("Say something to Bob:");
             String userInput = sc.nextLine();
             if (userInput.endsWith("?")) {
                 System.out.println("Sure.");
             } else if (userInput.endsWith("!")) {
                 System.out.println("Whoa, chill out!");
             } else if (userInput.equals("")) {
                 System.out.println("Fine. Be that way!");
                 break;
             } else {
                 System.out.println("Whatever.");
             }
          }

     }
}
