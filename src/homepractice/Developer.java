package homepractice;

public class Developer extends Employee {

    public static void main(String[] args) {
        Employee bob = new Developer();
        System.out.println("bob.work() = " + bob.work());

        Developer susan = new Developer();
        System.out.println("susan.work() = " + susan.work());

        //WON'T WORK! ERROR b/c Employee is abstract and can't be instantiated
//        Employee alice = new Employee();
//        System.out.println("alice.work() = " + alice.work());
    }

    @Override
    public String work() {
        return "writing code.";
    }
}
