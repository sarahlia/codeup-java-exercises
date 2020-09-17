import java.util.*;

public class Problems {

    public static void main(String[] args) {
        int[] arrA = {10, 20, 30, 20, 40, 30};
//        int[] arrB = {20, 25, 30, 40, 50};
//
//        int s1 = arrA.length;
//        int s2 = arrB.length;
//        printUncommon(arrA, arrB, s1, s2);

         int[][] nums = { {1,91}, {1, 92}, {2,93}, {2,97}, {1,60}, {2,77}, {1,65}, {1,87} , {1,100}, {2,100}, {2,76} };
         Problems p = new Problems();
        System.out.println(Arrays.deepToString(p.highFive(nums)));

//        int[] numbers = new int[] {1, 2, 3, 4};
//        int result = 0;
//        for(int number:numbers) {
//            result *= number;
//
//        }
//        System.out.println(result);

        List<Integer> numbs = new ArrayList<>();
        numbs.add(1);
        numbs.add(5);
        numbs.add(23);
        numbs.add(2);

        System.out.println("p.someFunction(numbs) = " + p.someFunction(numbs));
//        System.out.println("p.merge(arrA, arrB) = " + Arrays.toString(p.merge(arrA, arrB)));
        System.out.println("p.isSpecial(\"ab1221ba\") = " + p.isSpecial("ab1221ba"));
        System.out.println("p.isSpecial(\"madam\") = " + p.isSpecial("madam"));
        System.out.println("p.isSpecial(\"cab\") = " + p.isSpecial("cab"));
        System.out.println("p.isSpecial(\"dad\") = " + p.isSpecial("dad"));

        System.out.println("nonDuplicates(arrA) = " + nonDuplicates(arrA));

    }

    //You have two arrays of integers.
    //Output an array that will only have elements found in one, but not both, arrays.
//    public static void printUncommon(int arr1[], int arr2[], int l1, int l2) {
//        int i = 0, j = 0, k = 0;
//        while (i < l1 && j < l2) {
//            if (arr1[i] < arr2[j]) {
//                System.out.println(arr1[i]);
//                i++;
//                k++;
//            } else if (arr2[j] < arr1[i]) {
//                System.out.println(arr2[j]);
//                j++;
//                k++;
//            } else {
//                i++;
//                j++;
//            }
//        }
//
//        while (i < l1) {
//            System.out.println(arr1[i]);
//            i++;
//            k++;
//        }
//
//        while (j < l2) {
//            System.out.println(arr2[j]);
//            j++;
//            k++;
//        }
//    }

    //    Given a list of scores of different students, return the average score of each student's top five scores in the order of each student's id.
    public int[][] highFive(int[][] items) {

        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        for(int[] item : items){
            int id = item[0];
            int score = item[1];

            if(!map.containsKey(id)){
                PriorityQueue<Integer> pq = new PriorityQueue<Integer>(5);
                pq.offer(score);
                map.put(id, pq);
            }else{
                PriorityQueue<Integer> pq = map.get(id);
                pq.offer(score);
                if(pq.size() > 5){
                    pq.poll();
                }
                map.put(id, pq);
            }
        }

        int index = 0;

        int[][] res = new int[map.size()][2];

        for(int id : map.keySet()){
            res[index][0] = id;

            PriorityQueue<Integer> pq = map.get(id);
            int sum = 0;
            int size = pq.size();

            while(!pq.isEmpty()){
                sum+= pq.poll();
            }
            res[index][1] = sum/size;

            index++;

        }

        return res;

    }

    //generates a reverse ordered list:
    public List<Integer> someFunction(final List<Integer> numbers) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = numbers.size()-1; i >= 0; i--) {
            result.add(numbers.get(i));
        }
        return result;
    }

    //merge 2 int arrays, but only correctly if they're the same length.
    public int[] merge(int[] a, int[] b) {
       int[] result = new int[a.length + b.length];
       for(int i = 0; i < a.length; i++) {
           result[2*i] = a[i];
           result[(2*i)+1] = b[i];
       }
       return result;
    }

    //same as checking if string is palindrome
    public boolean isSpecial(String text) {
        String tempText = alterText(text);
        return text.equals(tempText);
    }
    //palindrome
    public String alterText(String inputText) {

        if(inputText == null || inputText.isEmpty()) {
            return inputText;
        }
        return inputText.charAt(inputText.length() - 1) + alterText(inputText.substring(0, inputText.length() -1));
    }

    //how many elements are non-duplicates (unique) in an array:
    public static int nonDuplicates(int[] array) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int a:array) {
            Integer aNum = count.get(a);
            if(aNum == null) {
                aNum = 1;
            } else {
                aNum++;
            }
            count.put(a, aNum);
        }

        Set<Integer> keySet = new HashSet<>(count.keySet());
        for(Integer key:keySet) {
            if( (count.get(key) != null) && (count.get(key) > 1) ) {
                count.remove(key);
            }
        }
        return count.size();
    }

}
