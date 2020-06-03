package homepractice;

import util.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryApp {

    static ArrayList<String> groceries;

    static Input input = new Input();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        groceries = new ArrayList<>();

        System.out.println("Do you want to create a grocery list?");
        while(input.yesNo()) {
            itemPrompt();
            break;
        }


    }


    public static void itemPrompt() {
        System.out.println("Do you want to enter a new item?");
        while(input.yesNo()) {
            System.out.println("Select a category: ");
            System.out.println("1 - food");
            System.out.println("2 - beverage");
            System.out.println("3 - Exit");

            int inp = input.getInt(1, 3);
            if(inp == 1) {
                addItem();
//
                listOptions();

            } else if(inp == 2) {
                addItem();
//
                listOptions();

            } else if(inp == 3) {
//                exit();
                break;
            }
//            else {
//                break;
//            }
        }

    }

    public static void addItem() {
        System.out.println("Type an item to add to your cart.");
        String item = scanner.nextLine();
        groceries.add(item);

        System.out.println("How many?");
        String qty = scanner.nextLine();
        System.out.println("You have added " + qty + " " + item +"(s)");

        System.out.println("Item(s) in your cart: " + groceries);
    }

    public static void listOptions() {
        System.out.println("Select an option: ");
        System.out.println("1 - Finalize list");
        System.out.println("2 - Add item(s)");

        int inp = input.getInt(1, 2);
        if(inp == 1) {
//            finalizeList();
        } else if(inp == 2) {
            addItem();
            listOptions();
        }

    }


}
