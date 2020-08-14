package homepractice;

public class HackerRankPartThree {

//    public static void main(String[] args) {
//        long [] arr = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
////        plusMinus(arr);
//        System.out.println("aVeryBigSum(arr) = " + aVeryBigSum(arr));
//        staircase(7);
//    }

    //simple array sum
//    static int simpleArraySum(int[] ar) {
//        int sum = 0;
//        for(int i=0; i<ar.length; i++) {
//            sum += ar[i];
//        }
//        return sum;
//    }

    // Complete the plusMinus function below.
//    static void plusMinus(int[] arr) {
//        int countPositive = 0;
//        int countZero = 0;
//        int countNegative = 0;
//
//        for (int n : arr) {
//            if (n > 0) {
//                countPositive++;
//            } else if (n < 0) {
//                countNegative++;
//            } else {
//                countZero++;
//            }
//        }
//
//        System.out.printf("%.6f\n%.6f\n%.6f\n",
//                (double) countPositive / arr.length,
//                (double) countNegative / arr.length,
//                (double) countZero     / arr.length);
//
//    }

    // Complete the aVeryBigSum function below.
//    static long aVeryBigSum(long[] ar) {
//        long sum = 0L;
//        for(int i=0; i<ar.length; i++) {
//            sum += ar[i];
//        }
//        return sum;
//    }

    // Complete the staircase function below.
//    static void staircase(int n) {
//        StringBuilder string = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            string.append("#");
//            System.out.printf("%" + n + "s\n", string);
//        }
//    }

    //diagonal difference
//    public static int diagonalDifference(List<List<Integer>> arr) {
//        int leftToRightSum = 0;
//        int rightToLeftSum = 0;
//
//        int topRight = arr.size() - 1;
//        for(int i = 0; i < arr.size(); i++) {
//            leftToRightSum += arr.get(i).get(i);
//            rightToLeftSum += arr.get(i).get(topRight - i);
//        }
//
//        return Math.abs(leftToRightSum - rightToLeftSum);
//    }

    // Complete the miniMaxSum function below.
//    static void miniMaxSum(int[] arr) {
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        long sum = 0;
//
//        for (int n : arr) {
//            sum += n;
//            if (n < min) {
//                min = n;
//            }
//            if (n > max) {
//                max = n;
//            }
//        }
//
//        long minSum = sum - max;
//        long maxSum = sum - min;
//        System.out.println(minSum + " " + maxSum);
//    }

    // Complete the birthdayCakeCandles function below.
//    static int birthdayCakeCandles(int[] ar) {
//        int max = Integer.MIN_VALUE;
//        int maxOccurences = 0;
//
//        for (int n : ar) {
//            if (n > max) {
//                max = n;
//                maxOccurences = 1;
//            } else if (n == max) {
//                maxOccurences++;
//            }
//        }
//        return maxOccurences;
//    }

    //convert the time to 24-hr/military time
//    static String timeConversion(String s) {
//        String[] split = s.split(":");
//        String hh = split[0];
//        String mm = split[1];
//        String ss = split[2].substring(0, 2);
//        boolean isAM = split[2].substring(2).equals("AM");
//
//        int hour = Integer.parseInt(hh);
//        if (isAM && hour == 12) {
//            hour = 0;
//        } else if (!isAM && hour != 12) {
//            hour += 12;
//        }
//        hh = String.format("%02d", hour);
//
//        return String.format("%s:%s:%s", hh, mm, ss);
//    }

    //complete gradingStudents method
//    public static List<Integer> gradingStudents(List<Integer> grades) {
//        int sisaMod;
//
//        for (int i=0; i<grades.size(); i++){
//            if (grades.get(i) % 5 != 0) {
//                sisaMod = grades.get(i) % 5;
//                if (5-sisaMod <3 && grades.get(i) > 37)
//                    grades.set(i, grades.get(i) + (5-sisaMod));
//            }
//        }
//        return grades;
//    }

    // Complete the birthday function below.
//    static int birthday(List<Integer> s, int d, int m) {
//        int sum = 0,ways=0;
//        for (int i=0;i<m;i++){
//            sum += s.get(i);
//        }
//        for (int i=0;i<s.size()-m+1;i++) {
//            if (sum==d) {
//                ways++;
//            }
//            if (i+m <s.size()){
//                sum =sum-s.get(i)+s.get(i+m);
//            }
//        }
//        return ways;
//    }

    // Complete the migratoryBirds function below.
//    static int migratoryBirds(List<Integer> arr) {
//        int[] types = new int[5];
//        for(int i=0; i<arr.size(); i++){
//            switch(arr.get(i)){
//                case 1:
//                    types[0]++;
//                    break;
//                case 2:
//                    types[1]++;
//                    break;
//                case 3:
//                    types[2]++;
//                    break;
//                case 4:
//                    types[3]++;
//                    break;
//                case 5:
//                    types[4]++;
//                    break;
//            }
//        }
//        int max = types[0];
//        int index = 1;
//        for(int j = 1; j<types.length;j++){
//            if(max < types[j]){
//                max = types[j];
//                index = j+1;
//            }
//        }
//        return index;
//    }

    // Complete the countApplesAndOranges function below.
//    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
//        long np= 0;
//        long no= 0;
//        for(int i=0;i<apples.length;i++){
//            if(a+apples[i]>=s && a+apples[i]<=t){
//                np++;
//            }
//        }
//        for(int j=0;j<oranges.length;j++){
//            if(b+oranges[j]>=s && b+oranges[j]<=t){
//                no++;
//            }
//        }
//        System.out.println(np);
//        System.out.println(no);
//    }

    // Complete the divisibleSumPairs function below.
//    static int divisibleSumPairs(int n, int k, int[] ar) {
//        int m = 0;
//        for(int i=0; i<n-1; i++){
//            for(int j=i+1; j<n; j++){
//                if( (ar[i] + ar[j]) %k==0 ){
//                    m++;
//                }
//            }
//        }
//        return m;
//    }

    // Complete the breakingRecords function below.
//    static int[] breakingRecords(int[] scores) {
//        int minR = 0;
//        int maxR = 0;
//        int min=scores[0];
//        int max=scores[0];
//        for(int i=1; i<scores.length; i++){
//            if(scores[i]<min){
//                min = scores[i];
//                minR++;
//            }
//            if(scores[i]>max){
//                max=scores[i];
//                maxR++;
//            }
//        }
//        int[] m = new int[2];
//        m[1] = minR;
//        m[0] = maxR;
//        return m;
//    }

    // Complete the sockMerchant function below.
//    static int sockMerchant(int n, int[] ar) {
//        int t=0; int s;
//        for(int i=1; i<=100; i++){
//            s=0;
//            for(int j=0; j<n; j++){
//                if(i==ar[j]){
//                    s++;
//                }
//            }
//            t+=s/2;
//        }
//        return t;
//    }

    //Complete the getMoneySpent function in the editor below. It should return the maximum total price for the two items within Monica's budget, or  if she cannot afford both items.
//    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
//        int maximum = 0;
//        int sum = 0;
//        for(int i = 0; i < keyboards.length; i ++){
//            for(int j = 0; j < drives.length; j++){
//                sum = keyboards[i] + drives[j];
//                if(sum >= maximum && sum <= b){
//                    maximum = sum;
//                }
//            }
//        }
//        if(maximum == 0) return -1;
//        return maximum;
//    }

    //Complete the pageCount function below.
//    static int pageCount(int n, int p) {
//        int s = 0;
//        if(p <= n/2){
//            for(int i =1; i<=p; i++){
//                if(i%2 == 0){
//                    s++;
//                }
//            }
//        }else{
//            if(n%2 == 1){
//                s--;
//            }
//            for(int j=n; j>=p; j--){
//                if(j%2 == 1){
//                    s++;
//                }
//            }
//        }
//        return s;
//    }

    // Complete the countingValleys function below.
//    static int countingValleys(int n, String s) {
//        int sea = 0, counter = 0; boolean above = false, below = false;
//        for(int i=0;i<n;i++){
//            if(s.charAt(i)=='D'){
//                sea--;
//            }else sea++;
//            if(sea > 0) {
//                above = true;
//                if(below){
//                    below = false;
//                    counter ++;
//                }
//            }
//            if(sea < 0){
//                below = true;
//                if(above){
//                    above = false;
//                }
//            }
//            if(sea == 0 && below){
//                below = false;
//                counter++;
//            }
//        }
//        return counter;
//    }

    // Complete the camelcase function below.
//    static int camelcase(String s) {
//        int numberOfWords = 1;
//        boolean temp;
//        for(int i=1; i<s.length(); i++){
//            temp = Character.isUpperCase(s.charAt(i));
//            if(temp){
//                numberOfWords++;
//            }
//        }
//        return numberOfWords;
//    }

    // Complete the hackerrankInString function below.
//    static String hackerrankInString(String s) {
//        char[] hackerrank = {'h','a','c','k','e','r','r','a','n','k'};
//        int i =0;
//        int j = 0;
//        while(i<hackerrank.length && j< s.length()){
//            if(hackerrank[i]==s.charAt(j)){
//                i++;
//            }
//            j++;
//        }
//        if(i == hackerrank.length) {
//            return "YES";
//        }
//        return "NO";
//    }

    // Complete the marsExploration function below.
//    static int marsExploration(String s) {
//        int sum=0;
//        for(int i = 0; i< s.length()-2;i+=3){
//            sum += errorsOnOneSOS(s.substring(i,i+3));
//        }
//        return sum;
//    }
//
//    static int errorsOnOneSOS(String sos){
//        int temp=0;
//        if(sos.charAt(0)!='S') {
//            temp++;
//        }
//        if(sos.charAt(1)!='O') {
//            temp++;
//        }
//        if(sos.charAt(2)!='S') {
//            temp++;
//        }
//        return temp;
//    }

    // Complete the pangrams function below.
//    static String pangrams(String s) {
//        s = s. replaceAll("\\s","");
//        boolean[] alphabet = new boolean[26];
//        char temp;
//        for(int i=0; i<26; i++){
//            alphabet[i] = false;
//        }
//        for(int i=0; i<s.length(); i++){
//            temp = s.charAt(i);
//            alphabet[((int)Character.toLowerCase(temp))-97] = true;
//        }
//        for(int i=0; i<26; i++){
//            if(!alphabet[i]){
//                return "not pangram";
//            }
//        }
//        return "pangram";
//    }

    //Find and print the maximum number of integers you can select from the array such that the absolute difference between any two of the chosen integers is less than or equal to 1.
//    public static int pickingNumbers(List<Integer> a) {
//        a = sortList(a);
//        int max = 0;
//        int length;
//        for(int i = 0; i < a.size(); i++){
//            length = 0;
//            for(int j = i; j < a.size(); j++){
//                if(a.get(j) - a.get(i) > 1){
//                    break;
//                }else{
//                    length++;
//                }
//            }
//            if(max < length) max = length;
//        }
//        return max;
//    }

//    public static List<Integer> sortList(List<Integer> list){
//        int min =0;
//        for(int i =0; i < list.size()-1; i++){
//            min = list.get(i);
//            for(int j= i+1; j < list.size(); j++){
//                if(min > list.get(j)){
//                    list.set(i, list.get(j));
//                    list.set(j, min);
//                    min = list.get(i);
//                }
//            }
//        }
//        return list;
//    }

}
