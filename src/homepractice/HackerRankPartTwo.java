package homepractice;

import java.util.*;
import java.io.IOException;
import java.lang.reflect.Method;

public class HackerRankPartTwo {

    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        Maps names (keys) to phone numbers (values)
//        Map<String, Integer> phoneBook = new HashMap<>();
//
//        System.out.println("How many contacts?");
//        int numEntries = sc.nextInt();
//        sc.nextLine();
//        for (int i = 0; i < numEntries; i++) {
//            System.out.println("Enter name:");
//            String name = sc.nextLine();
//
//            System.out.println("Enter 8-digit phone#: ");
//            int number = sc.nextInt();
//            sc.nextLine();
//            phoneBook.put(name, number);
//        }
//
//        while (sc.hasNext()) {
//            String name = sc.nextLine();
//            Integer number = phoneBook.get(name);
//
//            if (phoneBook.containsKey(name)) {
//                System.out.println(name + "=" + number);
//            } else {
//                System.out.println("Not found");
//            }
//        }
//        sc.close();

        //Collections.sort exercise to sort in descending cgpa order:
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number of entries:");
//        int testCases = Integer.parseInt(in.nextLine());

//        List<Student> studentList = new ArrayList<Student>();
//        while(testCases>0){
//            System.out.println("Enter id:");
//            int id = in.nextInt();
//
//            System.out.println("Enter name:");
//            String fname = in.next();
//
//            System.out.println("Enter cgpa:");
//            double cgpa = in.nextDouble();
//
//            Student st = new Student(id, fname, cgpa);
//            studentList.add(st);
//
//            testCases--;
//        }

//        Collections.sort(studentList, Comparator.comparing(Student :: getCgpa).reversed().
//                thenComparing(Student :: getFname).thenComparing(Student :: getId));
//
//        for(Student st: studentList){
//            System.out.println(st.getFname());
//        }

        //Printer
//        Printer myPrinter = new Printer();
//        Integer[] intArray = { 1, 2, 3 };
//        String[] stringArray = {"Hello", "World"};
//        myPrinter.printArray(intArray);
//        myPrinter.printArray(stringArray);
//        int count = 0;
//
//        for (Method method : Printer.class.getDeclaredMethods()) {
//            String name = method.getName();
//
//            if(name.equals("printArray"))
//                count++;
//        }
//
//        if(count > 1)System.out.println("Method overloading is not allowed!");

        //Exception Handling
//        while (in .hasNextInt()) {
//            int n = in .nextInt();
//            int p = in .nextInt();
//
//            try {
//                System.out.println(my_calculator.power(n, p));
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }

//        int[] arr = {1, 3, 9, 7};
//        reverseArray(arr);
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
    }

    //insert a node at the head of a linked list
//    static class SinglyLinkedListNode {
//        public int data;
//        public SinglyLinkedListNode next;
//
//        public SinglyLinkedListNode(int nodeData) {
//            this.data = nodeData;
//            this.next = null;
//        }
//    }

//    static class SinglyLinkedList {
//        public SinglyLinkedListNode head;
//        public SinglyLinkedListNode tail;
//
//        public SinglyLinkedList() {
//            this.head = null;
//            this.tail = null;
//        }
//    }

//    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
//        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
//        newNode.data = data;
//        newNode.next = null;
//
//        if (llist == null) {
//            llist = newNode;
//        } else {
//            newNode.next = llist;
//            llist = newNode;
//
//        }
//        return llist;
//    }

    //reverse the order of an array
//    static int[] reverseArray(int[] a) {
//        for(int i = 0, j = a.length-1; i < a.length; i++, j--){
//            if(i < j){
//                int temp = a[i];
//                a[i] = a[j];
//                a[j] = temp;
//            }
//        }
//        return a;
//
//    }

    //print the elements of a LinkedList
//    public static void printLinkedList(SinglyLinkedListNode head) {
//        SinglyLinkedListNode current = head;
//        while (current != null) {
//            System.out.println(current.data);
//            current = current.next;
//        }
//
//    }

    //print the elements of a LinkedList in reverse
    static void reversePrint(SinglyLinkedListNode head) {
        if (head != null) {
            reversePrint(head.next);
            System.out.println(head.data);
        }

    }
}
