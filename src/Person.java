public class Person {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void sayHello() {
        System.out.println("Hello there, " + name + "!");
    }

    public Person(String personName) {
        this.name = personName;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Sarah");
        System.out.println(p1.getName());
        p1.setName("fernando");
        p1.sayHello();

    }

}
