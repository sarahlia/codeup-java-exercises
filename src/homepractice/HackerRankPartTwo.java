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
//    static void reversePrint(SinglyLinkedListNode head) {
//        if (head != null) {
//            reversePrint(head.next);
//            System.out.println(head.data);
//        }
//
//    }

    //insert a node at the tail of a LinkedList
//    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
//        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
//
//        if(head == null) {
//            return newNode;
//        }
//
//        SinglyLinkedListNode current = head;
//        while (current.next != null) {
//            current = current.next;
//        }
//        current.next = newNode;
//        return head;
//    }

    // Reverse the LinkedList below
//    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
//        if(head == null || head.next == null) {
//            return head;
//        }
//        SinglyLinkedListNode remaining = reverse(head.next);
//        head.next.next = head;
//        head.next = null;
//        return remaining;
//
//    }

    //Insert a node at a specific location
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.data = data;
        SinglyLinkedListNode current = head;
        SinglyLinkedListNode prev = current;
        int counter = 0;

        if (position == 0) {
            newNode.next = head;
            return newNode;

        } else {
            current = head.next;
            while (current != null) {
                if (++counter == position) {
                    newNode.next = prev.next;
                    prev.next = newNode;
                    break;
                }
                prev = current;
                current = current.next;
            }

            if (current == null) {
                newNode.next = prev.next;
                prev.next = newNode;
            }
        }
        return head;

    }

    // delete a node from a LinkedList
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode current = head;
        SinglyLinkedListNode prev = current;
        int counter = 0;

        if (head == null && position == 0) {
            return null;
        }
        if (position == 0 && head != null) {
            head = head.next;
            return head;
        } else {

            current = head.next;
            while (current != null) {

                if (++counter == position) {
                    prev.next = current.next;
                    break;
                }
                prev = current;
                current = current.next;
            }

        }
        return head;
    }

    // Complete the getNode function below.
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode p1 = head;
        SinglyLinkedListNode p2 = head;

        for (int i = 0; i < positionFromTail; i++) {
            p1 = p1.next;
        }

        while (p1.next != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        return p2.data;
    }

    // Complete the compareLists function below.
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        while (head1 != null && head2 != null) {
            if (head1.data != head2.data) {
                return false;
            } else {
                head1 = head1.next;
                head2= head2.next;
            }
        }
        return ((head1 == null) && (head2 == null));

    }

    // Complete the removeDuplicates function below.
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;

        while (current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
                continue;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    // Complete the reverse function below.
    static DoublyLinkedListNode reverse(DoublyLinkedListNode current) {
        DoublyLinkedListNode temp = current.next;
        current.next = current.prev;
        current.prev = temp;
        return temp == null ? current : reverse(temp);
    }

    // Complete the mergeLists function below.
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }

        if (head1.data < head2.data) {
            head1.next = mergeLists(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeLists(head1, head2.next);
            return head2;
        }

    }

    // Complete the findMergeNode function below.
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode currentA = head1;
        SinglyLinkedListNode currentB = head2;

        int lenA = 0, lenB = 0, d;

        while (currentA != null) {
            lenA++;
            currentA = currentA.next;
        }
        while (currentB != null) {
            lenB++;
            currentB = currentB.next;
        }

        if (lenA > lenB) {
            d = lenA - lenB;
        } else {
            d = lenB - lenA;
        }

        currentA = head1;
        currentB = head2;
        for (int i = 0; i < d; i++) {
            if (lenA > lenB) {
                currentA = currentA.next;
            } else {
                currentB = currentB.next;
            }

        }

        while (currentA != currentB) {
            currentA = currentA.next;
            currentB = currentB.next;
        }

        return currentA.data;

    }

    //insert a node into a sorted doubly LinkedList
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {

        DoublyLinkedListNode temp=head;	//have a copy of head, to return the DLL,after the changes
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);//create a new node and add data to it

        //case 1: if DLL is empty
        if (head == null) {//if DLL is empty,make newNode as head
            newNode.next = null;
            newNode.prev = null;
            return newNode;
        }

        //case 2: if new_node has to be inserted at head's position
        if (head.data > data) {//if new_node is to be added in front of head
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = null;
            return newNode;
        }

        //case 3: if new_node can be added in other places except head

        //in while loop have null checking as first condition to prevent NullPointerException
        while (head.next != null && head.next.data<data) {
            head=head.next;
        }

        newNode.next=head.next;
        head.next=newNode;
        newNode.prev=head;

        return temp;
    }

    //2D Arrays
    private static final int ROWS = 6;
    private static final int COLS = 6;

    // Returns the sum of the hourglass whose upper-left index is array[r][c]
    private static int hourglassSum(int[][] array, int r, int c) {
        return
                array[r + 0][c + 0] + array[r + 0][c + 1] + array[r + 0][c + 2]
                        + array[r + 1][c + 1] +
                        array[r + 2][c + 0] + array[r + 2][c + 1] + array[r + 2][c + 2];
    }

    // Returns the maximum sum of all hourglasses in the specified array
    private static int maxHourglassSum(int[][] array) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int r = 0; r <= ROWS - 3; r++) {
            for (int c = 0; c <= COLS - 3; c++) {
                currentSum = hourglassSum(array, r, c);

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[][] array = new int[ROWS][COLS];

        // Read in the 2D array
        Scanner in = new Scanner(System.in);
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {;
                array[r][c] = in.nextInt();
            }
        }
        in.close();

        System.out.println(maxHourglassSum(array));
    }

    //tree - inorder traversal
    public static void inOrder(Node root) {
        Stack<Node> st = new Stack<Node>();
        while (true) {
            while (root != null) {
                st.push(root);
                root = root.left;
            }
            if (st.empty())
                return;
            root = st.pop();
            System.out.print(root.data + " ");
            root = root.right;
        }
    }

    //tree - postorder traversal
    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");

        }
    }

    //tree - preorder traversal
    public static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //tree - height of a tree
    public static int height(Node root) {
        if (root == null)
            return -1;
        return (Math.max(height(root.left), height(root.right)) + 1);
    }

    //tree - level order traversal
    public static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while (!q.isEmpty()) {

            Node currentNode = q.poll();
            System.out.print(currentNode.data + " ");
            if (currentNode.left != null)
                q.add(currentNode.left);
            if (currentNode.right != null)
                q.add(currentNode.right);
        }

    }

    //tree - print the top view
    //new class to store level of each node along with the node
    static class QueueNode{
        Node node;
        int level;
        public QueueNode(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }


    public static void topView(Node root) {
        //took a queue - similar to BFS approach
        Queue<QueueNode> queue = new LinkedList<QueueNode>();

        //Taking a TreeMap<first, second>
        //first - stores the level of the node
        //second - stores the node.data
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        //why TreeMap? Because I want the nodes to be sorted from leftmost to rightmost

        //start (since root, level = 0)
        queue.add(new QueueNode(root, 0));

        while(!queue.isEmpty()){
            //remove element from queue
            QueueNode r = queue.poll();
            //if the level of this node has never been reached before -> visible in top view
            if(!map.containsKey(r.level)){
                map.put(r.level, r.node.data);
            }

            //add node's descendants
            //all left child node levels = node.level - 1
            //all right child node levels = node.level + 1
            if(r.node.left != null){
                queue.add(new QueueNode(r.node.left, r.level - 1));
            }
            if(r.node.right != null){
                queue.add(new QueueNode(r.node.right, r.level + 1));
            }
        }
        //since already sorted, print from left to right
        for (Integer value : map.values()) {
            System.out.print(value + " ");
        }
    }

    //binary search tree - lowest common ancestor
    public static Node lca(Node root, int v1, int v2) {
        if(root.data < v1 && root.data < v2){
            return lca(root.right,v1,v2);
        }

        if(root.data > v1 && root.data > v2){
            return lca(root.left,v1,v2);
        }
        return root;
    }

    //    Find the maximum possible height of the stacks such that all of the stacks are exactly the same height.
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();
        Stack<Integer> st3 = new Stack<Integer>();

        int st1TotalHeight = 0, st2TotalHeight = 0, st3TotalHeight = 0;

        for (int i = h1.length - 1; i >= 0; i--) {
            st1TotalHeight += h1[i];
            st1.push(st1TotalHeight);
        }
        for (int i = h2.length - 1; i >= 0; i--) {
            st2TotalHeight += h2[i];
            st2.push(st2TotalHeight);
        }
        for (int i = h3.length - 1; i >= 0; i--) {
            st3TotalHeight += h3[i];
            st3.push(st3TotalHeight);
        }

        while (true) {
            if (st1.isEmpty() || st2.isEmpty() || st3.isEmpty()) {
                return 0;
            }

            st1TotalHeight = st1.peek();
            st2TotalHeight = st2.peek();
            st3TotalHeight = st3.peek();

            if (st1TotalHeight == st2TotalHeight && st2TotalHeight == st3TotalHeight) {
                return st1TotalHeight;
            }

            if (st1TotalHeight >= st2TotalHeight && st1TotalHeight >= st3TotalHeight) {
                st1.pop();
            } else if (st2TotalHeight >= st1TotalHeight && st2TotalHeight >= st3TotalHeight) {
                st2.pop();
            } else if (st3TotalHeight >= st2TotalHeight && st3TotalHeight >= st1TotalHeight) {
                st3.pop();
            }

        }

    }

    //for each type 3 query, print the maximum element in the stack on a new line
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        maxStack.push(Integer.MIN_VALUE);

        for (int i = 0; i < N; i++) {
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    int item = sc.nextInt();
                    mainStack.push(item);
                    int maxSoFar = maxStack.peek();
                    if (item > maxSoFar) {
                        maxStack.push(item);
                    } else {
                        maxStack.push(maxSoFar);
                    }
                    break;
                case 2:
                    mainStack.pop();
                    maxStack.pop();
                    break;

                case 3:

                    System.out.println(maxStack.peek());
                    break;
            }
        }
        sc.close();
    }












}
