package homepractice;

import util.Input;

import java.util.HashMap;

public class GroceryList {



    static Input input = new Input();

    public static void main(String[] args) {
        HashMap<String, GroceryList> groceries = new HashMap<>();

        GroceryList apple = new GroceryList();
        GroceryList pepsi = new GroceryList();


    }

    public static void cla(HashMap<String, GroceryList> groceries) {
        System.out.println("Do you want to create a grocery list?");
//        Input input = new Input();
//        boolean resp = input.yesNo();
        while(input.yesNo()) {
            System.out.println("Do you want to enter a new item?");
            while(input.yesNo()) {
                System.out.println("Select a category: ");
                System.out.println("1 - food");
                System.out.println("2 - drinks");

                String resp = input.getString();
                if(resp.equals("1")) {
                    input.getString("Type name of the item: ");
                } else if (resp.equals("2")) {
                    input.getString("Type name of the item: ");
                } else {
                    System.out.println("Goodbye!");
                    break;
                }
            }
        }





    }

}
