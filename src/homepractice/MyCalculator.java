package homepractice;

public class MyCalculator  {
//    implements AdvancedArithmetic
//    public int divisor_sum(int n) {
//        int result = 0;
//        for(int i=1; i <= n; i++) {
//            if(n % i == 0) {
//                result = result + i;
//            }
//        }
//        return result;
//    }

    long power(int n, int p) throws Exception{
        if(n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }

        if(n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }

        return (long) Math.pow(n, p);
    }

}
