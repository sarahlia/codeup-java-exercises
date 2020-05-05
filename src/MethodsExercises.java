public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("add(3, 5) = " + add(3, 5));
        System.out.println("subtract(10, 7) = " + subtract(10, 7));
        System.out.println("multiply(4, 8) = " + multiply(4, 8));
        System.out.println("divide(69, 23) = " + divide(69, 23));
        System.out.println("modulus(13, 4) = " + modulus(13, 4));
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }
}
