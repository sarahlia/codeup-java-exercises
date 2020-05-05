public class MethodsLec {

        public static void main(String[] args) {
            System.out.println(sayHello("Sarah"));
            System.out.println(sum(5, 12));
        }

        public static String sayHello(String name) {
            System.out.println("sum(1,2) = " + sum(1, 2)); //we can print the result of when the sum method is called within this other method, sayHello.
            return "Hi " + name + "!";
        }

        public static int sum(int num1, int num2) {
            return num1 + num2;
        }




}
