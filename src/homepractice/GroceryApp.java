package homepractice;

import util.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryApp {

    static ArrayList<Item> groceries;
    static ArrayList<Food> availableItems;


    static Input input = new Input();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        groceries = new ArrayList<>();
        groceries.add(new Item("clorox wipes", 1));
//        System.out.println(groceries);

        availableItems = new ArrayList<>();
//        Food rice = new Food("rice", 1, 19.99);
        Food rice = new Food("rice", 1);
//        Food sugar = new Food("sugar", 1, 5.00);
        Food sugar = new Food("sugar", 1);
//        Food brownie = new Food("brownie", 1, 2.25);
        Food brownie = new Food("brownie", 1);
//        Food cookie = new Food("cookie", 1, 1.50);
        Food cookie = new Food("cookie", 1);
//        Food water = new Food("water", 1, 3.49);
        Food water = new Food("water", 1);
//        Food pepsi = new Food("pepsi", 1, 1.00);
        Food pepsi = new Food("pepsi", 1);
        pepsi.addPrice(1.00);

//        availableItems.add(rice);
//        availableItems.add(sugar);
//        availableItems.add(brownie);
//        availableItems.add(cookie);
//        availableItems.add(water);
        availableItems.add(pepsi);
        System.out.println(availableItems);


        System.out.println("Welcome to Green Grocer! Enjoy a free container of Clorox Wipes with your purchase today.");
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
            System.out.println("2 - cleaning products");
            System.out.println("3 - Exit");

            int inp = input.getInt(1, 3);
            if(inp == 1) {
                System.out.println("Available food items:");
                System.out.println("rice, sugar, brownie, cookie, water, pepsi");
                addItem();
                listOptions();
            } else if(inp == 2) {
                System.out.println("Available cleaning items:");
                System.out.println("clorox wipes, laundry detergent, dishwashing liquid, windex, toilet paper, paper towel");
                addItem();
                listOptions();
            } else if(inp == 3) {
                break;
            }

        }

    }

    public static void addItem() {
        System.out.println("Type an item to add to your groceries cart.");
        String name = scanner.nextLine();

        System.out.println("How many?");
        int qty = Integer.parseInt(scanner.nextLine());

        if (availableItems.contains(name)) {
            System.out.println("You have added " + qty + " " + name +"(s)");
//            System.out.println("The price of " + qty + " " + name +"(s) is: $" + );
        }
//        for(Item grocery:groceries) {
//            grocery.
//        }
//        groceries.add(new Food(name, qty));
//        System.out.println("You have added " + qty + " " + name +"(s)");

        System.out.println("Item(s) in your groceries cart: " + groceries.toString());
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
