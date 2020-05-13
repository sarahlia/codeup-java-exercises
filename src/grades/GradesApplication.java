package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    static HashMap<String, Student> students = new HashMap<>();

    public static void main(String[] args) {

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

        showUsernames();
    }
        //Exercise 3

        public static void showUsernames() {

            System.out.println("Welcome!");
            System.out.println("Here are the GitHub usernames of our students:");
            for (String username : students.keySet()) {
                System.out.printf("|%s| ", username);

            }
            System.out.println("\nWhat student would you like to see more information on?");

            while(true) {
                Input input = new Input();
                String resp = input.getString();


                for (String username : students.keySet()) {
                    String actualName = students.get(username).getName();
                    double avgGrade = students.get(username).getGradeAverage();

                    if (resp.equalsIgnoreCase(username)) {
                        System.out.println(username + "'s actual name is " + actualName + " and his/her average grade is: " + avgGrade);
                        break;
                    } else {
                        System.out.println("Sorry, no student found with the GitHub username of " + resp);
                        continue;
                    }
                }
//                continue;
            }
        }




}
