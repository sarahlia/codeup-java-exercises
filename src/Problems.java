public class Problems {

    public static void main(String[] args) {
        int[] arrA = {10, 20, 30};
        int[] arrB = {20, 25, 30, 40, 50};

        int s1 = arrA.length;
        int s2 = arrB.length;
        printUncommon(arrA, arrB, s1, s2);
    }

    //You have two arrays of integers.
    //Output an array that will only have elements found in one, but not both, arrays.
    public static void printUncommon(int arr1[], int arr2[], int l1, int l2) {
        int i = 0, j = 0, k = 0;
        while (i < l1 && j < l2) {
            if (arr1[i] < arr2[j]) {
                System.out.println(arr1[i]);
                i++;
                k++;
            } else if (arr2[j] < arr1[i]) {
                System.out.println(arr2[j]);
                j++;
                k++;
            } else {
                i++;
                j++;
            }
        }

        while (i < l1) {
            System.out.println(arr1[i]);
            i++;
            k++;
        }

        while (j < l2) {
            System.out.println(arr2[j]);
            j++;
            k++;
        }
    }

}
