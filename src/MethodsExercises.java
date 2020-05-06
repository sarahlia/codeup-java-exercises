public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("add(3, 5) = " + add(3, 5));
        System.out.println("subtract(10, 7) = " + subtract(10, 7));
        System.out.println("multiply(6, 4) = " + multiply(6, 4));
        System.out.println("multiply(4, -3) = " + multiply(4, -3));
        System.out.println("divide(69, 23) = " + divide(69, 23));
        System.out.println("modulus(13, 4) = " + modulus(13, 4));
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

//    public static int multiply(int num1, int num2) {
//        return num1 * num2;
//    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    //exercise 1 bonus using for loop
//    public static int multiply(int num1, int num2) {
//        int result = 1;
//        for(int i = 1; i <= num2; i++) {
//            result = result + num1;
//        }
//        return result - 1;
//    }

    //exercise 1 bonus using recursion
    public static int multiply(int num1, int num2) {
        if (num1 == 0 || num2 ==0 ) {
            return 0;
        } else if (num2 > 0) {
            return num1 + multiply(num1, num2 - 1);
//        }
        } else {
            return -num1 + multiply(num1, num2 + 1);
        }
    }



}
