package homepractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HackerRankPartTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Maps names (keys) to phone numbers (values)
        Map<String, Integer> phoneBook = new HashMap<>();

        System.out.println("How many contacts?");
        int numEntries = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numEntries; i++) {
            System.out.println("Enter name:");
            String name = sc.nextLine();

            System.out.println("Enter 8-digit phone#: ");
            int number = sc.nextInt();
            sc.nextLine();
            phoneBook.put(name, number);
        }

        while (sc.hasNext()) {
            String name = sc.nextLine();
            Integer number = phoneBook.get(name);

            if (phoneBook.containsKey(name)) {
                System.out.println(name + "=" + number);
            } else {
                System.out.println("Not found");
            }
        }
        sc.close();

    }
}
