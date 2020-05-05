public class MethodsLec {

        public static void main(String[] args) {
            System.out.println(sayHello("Sarah"));
            System.out.println(sum(5, 12));
            System.out.println(sum(2.5, 8.5));
            System.out.println(sayHello("Sarah", "Nainggolan"));
        }

        public static String sayHello(String name) {
            System.out.println("sum(1,2) = " + sum(1, 2)); //we can print the result of when the sum method is called within this other method, sayHello.
            return "Hi " + name + "!";
        }

        public static int sum(int num1, int num2) {
            return num1 + num2;
        }

        public static double sum(double num1, double num2) {
            return num1 + num2;
        }

        public static String sayHello(String firstName, String lastName) {
            return "Hello, " + firstName + lastName;
        }




}
