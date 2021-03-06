package homepractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Mockprep {

    ListNode head;

    public static void main(String[] args) {

        //Make an ArrayList of Strings with 3 string objects
//        ArrayList<String> anArray = new ArrayList<>();
//        anArray.add("a");
//        anArray.add("b");
//        anArray.add("c");
//        System.out.println(anArray);

        //Fizz/Buzz: numbers divisible by 3: Fizz, numbers divisible by 5: Buzz, numbers divisible by both 3 AND 5: FizzBuzz
//        for(int i=1; i<=100; i++) {
//            if(i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if(i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //call countToThirtyFive method
//        countToThirtyFive();

        //call countTo method
//        countTo(17);


        // We'll start by defining a hash map
//        HashMap<String, Integer> students = new HashMap<>();

// and putting some data into it
//        students.put("Ryan", 1);
//        students.put("Zach", 5);
//        students.put("Fernando", 2);
//        students.put("Justin", 19);
//
//        System.out.println(students);

// obtaining values from the hash map by key
//        System.out.println("students.get(\"Ryan\") = " + students.get("Ryan"));
//        System.out.println("students.get(\"Phillip\") = " + students.get("Phillip"));
//        System.out.println("students.getOrDefault(\"Jason\", 0) = " + students.getOrDefault("Jason", 0));

// checking if keys or values are present
//        System.out.println("students.containsKey(\"Justin\") = " + students.containsKey("Justin"));
//        System.out.println("students.containsValue(4) = " + students.containsValue(4));
//    }

    //Write a Java for loop method that prints out 0 to 35 when called
//    public static void countToThirtyFive() {
//        for(int i = 0; i <= 35; i++) {
//            System.out.println(i);
//        }


       //SWITCH STATEMENT

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
                break;
        }

//        int caseSwitch = 1;
//
//        switch (caseSwitch) {
//            case 1:
//                System.out.println("Case 1");
//                // Fall through!
//            case 2:
//                System.out.println("Case 2");
//                break;
//            default:
//                System.out.println("Default case");
//                break;
//        }

        //test out singleNumber method (using HashMap):
        Mockprep mockprep = new Mockprep();
//        int[] arr = {2, 4, 2, 4, 3};
//        System.out.println("mockprep.singleNumber(arr) = " + mockprep.singleNumber(arr));

        //test out uniqueNumber method (using ArrayList):
//        int[] anotherArray = {7, 5, 6, 5, 9, 6, 7};
//        System.out.println("mockprep.uniqueNumber(anotherArray) = " + mockprep.uniqueNumber(anotherArray));
//        System.out.println("mockprep.containsDuplicate(anotherArray) = " + mockprep.containsDuplicate(anotherArray));

//        To test: create two sorted linked lists:
//           llist1: 5->10->15,
//           llist2: 2->3->20
        Mockprep llist1 = new Mockprep();
        Mockprep llist2 = new Mockprep();
        llist1.addToTheLast(new ListNode(5));
        llist1.addToTheLast(new ListNode(10));
        llist1.addToTheLast(new ListNode(15));

        llist2.addToTheLast(new ListNode(2));
        llist2.addToTheLast(new ListNode(3));
        llist2.addToTheLast(new ListNode(20));

        llist1.head = llist1.mergeTwoLists(llist1.head, llist2.head);
        llist1.printList();
    }

    //Write a Java method that takes in a parameter and counts up to that parameter
//    public static void countTo(int param) {
//        for(int i = 0; i <= param; i++) {
//            System.out.println(i);
//        }
//
//
//    }


    //In an array of integers, every element appears twice except for one. Find it.
    //HashMap method:
    public int singleNumber(int[] numbers) {
        HashMap<Integer, Integer> table = new HashMap<>();

        for(int el:numbers) {
            table.put(el, table.getOrDefault(el, 0) + 1);
        }
        for(int el:numbers) {
            if (table.get(el) == 1) {
                return el;
            }
        }

        return 0;
    }

    //ArrayList method:
    public int uniqueNumber(int[] numbers) {
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for(int el:numbers) {
            if(!uniqueList.contains(el)) {
                uniqueList.add(el);
            } else {
                uniqueList.remove(new Integer(el));
            }
        }
        return uniqueList.get(0);
    }

    //Given an array of integers, find if the array contains any duplicates.
    //Your function should return true if any value appears at least twice in the array,
    // and it should return false if every element is distinct.
    //Time complexity: O(n). Space complexity: O(n).
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(nums.length);

        for(int num:nums) {
            if(set.contains(num)) return true;
            set.add(num);
        }
        System.out.println(set);
        return false;

    }

    //Merge two sorted linked lists and return it as a new sorted list.
    //The new list should be made by splicing together the nodes of the first two lists.
    //Time complexity: O(n). Space complexity: O(n).
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }

        if(l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public void addToTheLast(ListNode node) {
        if (head == null) { //if list is empty
            head = node;
        } else { //if list is not empty
            ListNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void printList() {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println(); //extra line after the printed list, optional.
    }

}

class ListNode {

    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}