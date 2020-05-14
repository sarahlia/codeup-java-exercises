package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    static Input input = new Input();
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student michael = new Student("michael");
        michael.addGrade(80);
        michael.addGrade(78);
        michael.addGrade(70);

        Student maureen = new Student("maureen");
        maureen.addGrade(85);
        maureen.addGrade(80);
        maureen.addGrade(83);

        Student laura = new Student("laura");
        laura.addGrade(95);
        laura.addGrade(97);
        laura.addGrade(90);

        Student luis = new Student("luis");
        luis.addGrade(98);
        luis.addGrade(100);
        luis.addGrade(96);

        students.put("mjackson", michael);
        students.put("moken23", maureen);
        students.put("lauraingallswild", laura);
        students.put("luisfonsi", luis);

        //print the actual name and average grade
//        System.out.println("The name of the student with the github username mjackson is " + students.get("mjackson").getName() + " and his/her average grade is: " + students.get("mjackson").getGradeAverage());
        for(String username : students.keySet() ) {
            String actualName = students.get(username).getName();
//            System.out.println(actualName);
            double avgGrade = students.get(username).getGradeAverage();
//            System.out.println(avgGrade);
            System.out.printf("The name of the student with the github username %s is %s and his/her average grade is %.1f%n", username, actualName, avgGrade);
        }

        cli(students);
    }
        //Exercise 3
        public static void cli(HashMap<String, Student> students) {
            System.out.println("Welcome!");
            System.out.println("Here are the GitHub usernames of our students:");
            for (String username : students.keySet()) {
                System.out.printf("|%s| ", username);
            }

            do{
                for (String username : students.keySet()) {
                    String actualName = students.get(username).getName();
//                    double avgGrade = students.get(username).getGradeAverage();
//                    System.out.println(username + "'s actual name is " + actualName + " and his/her average grade is: ");
//                    System.out.printf("|%s| ", username);
                }
                System.out.println("\nWhat student would you like to see more information on?");

                String resp = input.getString();
                if(students.containsKey(resp)) {
                    System.out.printf("Name: %s - Github username: %s and average grade: %.2f", students.get(resp).getName(), resp, students.get(resp).getGradeAverage() );
                } else {
                    System.out.println("Sorry, no student found.");
                }
                System.out.println("\nWould you like to see another student?");

            } while(input.yesNo());
        }


}
