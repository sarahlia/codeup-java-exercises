import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        //        Person[] people = {new Person ("Laura"), new Person ("Maureen"), new Person ("Michael") };

        people[0] = new Person("Maureen");
        people[1] = new Person("Laura");
        people[2] = new Person("Michael");


        for (Person person : people) {
            System.out.println(person.getName());
        }

//Adding joanne to the array:

        Person[] morePeople = addPerson(people, new Person("Joanne"));

        for (Person person : morePeople) {
            System.out.println(person.getName());
        }

    }

    public static Person[] addPerson(Person[] arr, Person obj) {
        Person[] result = Arrays.copyOf(arr, arr.length + 1);
        result[result.length - 1] = obj;
        return result;
    }

//    Douglas' way (see his lecture notes)
//        public static Person[] addPerson(Person[] people, Person obj) {
//            Person[] newPeopleArray = new Person[people.length + 1];
//
//            for (int i = 0; i < people.length; i++) {
//                newPeopleArray[i] = people[i];
//            }
//            newPeopleArray[newPeopleArray.length - 1] = obj;
//            return newPeopleArray;
//        }

}
