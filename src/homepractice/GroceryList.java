package homepractice;

import util.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {

    static Input input = new Input();

    static ArrayList<String> groceries;
//            = new ArrayList<>();

    public static void main(String[] args) {
        groceries = new ArrayList<>();
//        GroceryList apple = new GroceryList();
//        GroceryList pepsi = new GroceryList();

        System.out.println(groceries);

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Do you want to create a grocery list? [y/n]");
            String inp = scanner.nextLine();

            if(inp.toLowerCase().equals("y")) {
                itemPrompt();
                break;
            } else if(inp.toLowerCase().equals("n")) {
                exit();
                break;
            } else {
                System.out.println("Invalid input.");
            }

        }


    }

    public static void itemPrompt() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to enter a new item?");
        while(input.yesNo()) {
            System.out.println("Select a category: ");
            System.out.println("1 - food");
            System.out.println("2 - drinks");
            System.out.println("3 - Exit");

            String inp = scanner.nextLine();
//            String resp = input.getString();
            if(inp.equals("1")) {
                addItem();

                listOptions();

            } else if(inp.equals("2")) {
                addItem();

                listOptions();

            } else if(inp.equals("3")) {
                exit();
                break;
            } else {
                break;
            }
        }
//        System.out.println("Bye!");
//        break;
    }

    public static void listOptions() {
        System.out.println("Select an option: ");
        System.out.println("1 - Finalize list");
        System.out.println("2 - Add item(s)");

        String resp = input.getString();
        if(resp.equals("1")) {
//            finalizeList();
        } else if(resp.equals("2")) {
            addItem();
            listOptions();
        } else {
            System.out.println("Invalid input.");
            listOptions();
        }
    }

    public static void addItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type an item to add to your cart.");
        String item = scanner.nextLine();
        groceries.add(item);

        System.out.println("How many?");
        String qty = scanner.nextLine();
        System.out.println("You have added " + qty + " " + item +"(s)");

        System.out.println("Item(s) in your cart: " + groceries);
    }

    public static void exit() {
            System.out.println("Goodbye!");
    }

}
