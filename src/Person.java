public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
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
    }

}
