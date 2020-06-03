package homepractice;

import util.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {

    static Input input = new Input();

    public static void main(String[] args) {
//        ArrayList<GroceryList> groceries = new ArrayList<>();
        ArrayList<String> groceries = new ArrayList<>();
//        GroceryList apple = new GroceryList();
//        GroceryList pepsi = new GroceryList();

        groceries.add("apple");
        groceries.add("pepsi");

        System.out.println(groceries);

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Do you want to create a grocery list? [y/n]");
            String inp = scanner.nextLine();

            if(inp.toLowerCase().equals("y")) {
                newItem();
                break;
            } else if(inp.toLowerCase().equals("n")) {
                exit();
                break;
            } else {
                System.out.println("Invalid input.");
            }

        }


    }

    public static void newItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to enter a new item?");
        while(input.yesNo()) {
            System.out.println("Select a category: ");
            System.out.println("1 - food");
            System.out.println("2 - drinks");
            System.out.println("3 - Exit");

            String resp = input.getString();
            if(resp.equals("1")) {
                input.getString("Type name of the item: ");
                System.out.println("How many?");
                String qty = scanner.nextLine();
                System.out.println("You have added " + qty + " item(s)." );
                listOptions();

            } else if(resp.equals("2")) {
                input.getString("Type name of the item: ");
                System.out.println("How many?");
                String qty = scanner.nextLine();
                System.out.println("You have added " + qty + " item(s)." );
                listOptions();

            } else if(resp.equals("3")) {
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
//            addItem();
        } else {
            System.out.println("Invalid input.");
            listOptions();
        }
    }

    public static void exit() {
            System.out.println("Goodbye!");
    }

}
