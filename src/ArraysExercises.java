import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person sarah = new Person("Sarah");
        Person laura = new Person("Laura");
        Person michael = new Person("Michael");
        Person joanne = new Person("Joanne");

        Person[] people = new Person[3];

        people[0] = sarah;
        people[1] = laura;
        people[2] = michael;

        for (Person person : people) {
            String name = person.getName();
            System.out.println(name);
        }

//        people = Arrays.copyOf(people, people.length + 1);
//        System.out.println(people);
//        System.out.println(Arrays.toString(people));

//Example of adding joanne to the 'people' array:
//        people[3] = joanne;
//        for (Person person : people) {
//            String name = person.getName();
//            System.out.println(name);
//        }
//
//        Person who = people[people.length - 1];
//        System.out.println(who.toString());


        System.out.println(Arrays.toString(people));
        System.out.println( addPerson(people, sarah) );
    }

    public static Person[] addPerson(Person[] arr, Person obj) {
        Person[] result = Arrays.copyOf(arr, arr.length + 1);
        result[result.length - 1] = obj;
        return result;
    }

}