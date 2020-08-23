import java.util.*;

public class Problems {

    public static void main(String[] args) {
//        int[] arrA = {10, 20, 30};
//        int[] arrB = {20, 25, 30, 40, 50};
//
//        int s1 = arrA.length;
//        int s2 = arrB.length;
//        printUncommon(arrA, arrB, s1, s2);

         int[][] nums = { {1,91}, {1, 92}, {2,93}, {2,97}, {1,60}, {2,77}, {1,65}, {1,87} , {1,100}, {2,100}, {2,76} };
         Problems p = new Problems();
        System.out.println(Arrays.deepToString(p.highFive(nums)));

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


}
