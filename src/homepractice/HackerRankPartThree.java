package homepractice;

public class HackerRankPartThree {

    public static void main(String[] args) {
        long [] arr = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
//        plusMinus(arr);
        System.out.println("aVeryBigSum(arr) = " + aVeryBigSum(arr));
        staircase(7);
    }

    //simple array sum
    static int simpleArraySum(int[] ar) {
        int sum = 0;
        for(int i=0; i<ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int countPositive = 0;
        int countZero = 0;
        int countNegative = 0;

        for (int n : arr) {
            if (n > 0) {
                countPositive++;
            } else if (n < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        }

        System.out.printf("%.6f\n%.6f\n%.6f\n",
                (double) countPositive / arr.length,
                (double) countNegative / arr.length,
                (double) countZero     / arr.length);

    }

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long sum = 0L;
        for(int i=0; i<ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    // Complete the staircase function below.
    static void staircase(int n) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < n; i++) {
            string.append("#");
            System.out.printf("%" + n + "s\n", string);
        }
    }

    //diagonal difference
    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftToRightSum = 0;
        int rightToLeftSum = 0;

        int topRight = arr.size() - 1;
        for(int i = 0; i < arr.size(); i++) {
            leftToRightSum += arr.get(i).get(i);
            rightToLeftSum += arr.get(i).get(topRight - i);
        }

        return Math.abs(leftToRightSum - rightToLeftSum);
    }

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;

        for (int n : arr) {
            sum += n;
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }

        long minSum = sum - max;
        long maxSum = sum - min;
        System.out.println(minSum + " " + maxSum);
    }

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int max = Integer.MIN_VALUE;
        int maxOccurences = 0;

        for (int n : ar) {
            if (n > max) {
                max = n;
                maxOccurences = 1;
            } else if (n == max) {
                maxOccurences++;
            }
        }
        return maxOccurences;
    }

    //convert the time to 24-hr/military time
    static String timeConversion(String s) {
        String[] split = s.split(":");
        String hh = split[0];
        String mm = split[1];
        String ss = split[2].substring(0, 2);
        boolean isAM = split[2].substring(2).equals("AM");

        int hour = Integer.parseInt(hh);
        if (isAM && hour == 12) {
            hour = 0;
        } else if (!isAM && hour != 12) {
            hour += 12;
        }
        hh = String.format("%02d", hour);

        return String.format("%s:%s:%s", hh, mm, ss);
    }

    //complete gradingStudents method
    public static List<Integer> gradingStudents(List<Integer> grades) {
        int sisaMod;

        for (int i=0; i<grades.size(); i++){
            if (grades.get(i) % 5 != 0) {
                sisaMod = grades.get(i) % 5;
                if (5-sisaMod <3 && grades.get(i) > 37)
                    grades.set(i, grades.get(i) + (5-sisaMod));
            }
        }
        return grades;
    }

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int sum = 0,ways=0;
        for (int i=0;i<m;i++){
            sum += s.get(i);
        }
        for (int i=0;i<s.size()-m+1;i++) {
            if (sum==d) {
                ways++;
            }
            if (i+m <s.size()){
                sum =sum-s.get(i)+s.get(i+m);
            }
        }
        return ways;
    }



}
