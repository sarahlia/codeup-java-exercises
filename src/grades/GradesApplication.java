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
        michael.addGrade(70); // average = 76

        Student maureen = new Student("maureen");
        maureen.addGrade(85);
        maureen.addGrade(80);
        maureen.addGrade(83); // average = 82.76

        Student laura = new Student("laura");
        laura.addGrade(95);
        laura.addGrade(97);
        laura.addGrade(90); // average = 94

        Student luis = new Student("luis");
        luis.addGrade(98);
        luis.addGrade(100);
        luis.addGrade(96);

        students.put("mjackson", michael);
        students.put("moken23", maureen);
        students.put("lauraingallswild", laura);
        students.put("luisfonsi", luis);

        //print the actual name and average grade
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
            System.out.println("classAverage(students) = " + classAverage(students));
            System.out.println("Here are the GitHub usernames of our students:");

            do{
                for (String username : students.keySet()) {
                    System.out.printf("|%s| ", username);
                }
                System.out.print("|0 - View all grades for all of the students|");
                System.out.println("\nWhat student would you like to see more information on?");

                String resp = input.getString();
                if(students.containsKey(resp)) {
                    System.out.printf("Name: %s - Github username: %s and average grade: %.2f\n", students.get(resp).getName(), resp, students.get(resp).getGradeAverage());
                    //BONUS: display all of the student's grades in addition to the grade average
                    System.out.printf("%s's grades are: \n", resp);
                    System.out.println(students.get(resp).getGrades().get(0));
                    System.out.println(students.get(resp).getGrades().get(1));
                    System.out.println(students.get(resp).getGrades().get(2));
                //BONUS: allow the user to view all of the grades for all of the students (option "0").
                } else if(resp.equals("0")) {
                        for (String username: students.keySet()) {
                            System.out.printf("%s's grades: \n", username);
                            System.out.println(students.get(username).getGrades().get(0));
                            System.out.println(students.get(username).getGrades().get(1));
                            System.out.println(students.get(username).getGrades().get(2));
                        }
                } else {
                    System.out.printf("Sorry, no student found with the GitHub username of %s ", resp);
                }
                System.out.println("\nWould you like to see another student?");

            } while(input.yesNo());
            System.out.println("Goodbye, and have a wonderful day!");
        }

        //BONUS: provide an option to view the overall class average
        public static double classAverage(HashMap<String, Student> students) {
            double totalClassGrade = 0;

            for(Student student:students.values()) {
                totalClassGrade += student.getGradeAverage();
            }
            return totalClassGrade / students.size();
        }



}
