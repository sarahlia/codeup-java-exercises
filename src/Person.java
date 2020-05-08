public class Person {
    private String name;

    //constructor
    public Person(String personName) {
        this.name = personName;
        // or: setName(newName);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void sayHello() {
        System.out.println("Hello there, " + this.name + "!");
        System.out.println("Hello there, " + getName() + "!"); //same thing as above
    }

    public static void main(String[] args) {
        Person p1 = new Person("Sarah");
        System.out.println(p1.getName());
        p1.setName("fernando");
        p1.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }

}
