package homepractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Game game = new Game();
        Scanner scan = new Scanner(System.in);
        Computer computer = new Computer();

        intro(game);

        while(!game.isWon()) {
            userMove(game, scan);

            if(game.isLastMove()) {
                if(game.isWon()) {
                    gameWon(game);
                } else {
                    gameTie(game);
                }
            } else {
                computerMove(game, computer);
            }
            game.printBoard();
        }

        finalPrint(game);
    }

    public static void intro(Game game) {
        System.out.println("Let's play TicTacToe! It's your turn.");
        System.out.println("You are 'X'. Pick a number between 1-9 to place your piece:");
        game.showOptions();
    }

    public static void userMove(Game game, Scanner scan) {

        int userMove = 0;
        while( (userMove < 1) ||(userMove > 9)) {
            try {
                userMove = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Not a valid input. Exiting game.");
                System.exit(0);
            }

            if ( (userMove < 1) || (userMove > 9) ) {
                System.out.println("Invalid input. Please enter a number between 1-9:");
            } else if (game.positionIsTaken(userMove)) {
                System.out.println("That piece is already taken. Please try again:");
                userMove = 0;
            }
        }

        game.placeUserPosition(userMove, 'X');
    }

    public static void computerMove(Game game, Computer computer) {
        int computerMove = computer.move(game.getPlacements());
        game.placeComputerPosition(computerMove, 'O');
    }

    public static void gameTie(Game game) {
        System.out.println("Tie game!");
        game.printBoard();
        System.exit(0);
    }

    public static void gameWon(Game game) {
        finalPrint(game);
        System.exit(0);
    }

    public static void finalPrint(Game game) {
        game.printBoard();
        System.out.printf("%s won the game!", game.getWinner());
    }

}
