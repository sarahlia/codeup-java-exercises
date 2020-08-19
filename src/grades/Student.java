package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance = new HashMap<>();

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getGradeAverage() {

        double totalGrade = 0;
        for (double grade : this.grades) {
            totalGrade = totalGrade + grade;
        }
        return totalGrade / this.grades.size();

//        For-loop method:
//        double totalGrade = 0;
//        for(int i = 0; i < grades.size(); i++) {
//            totalGrade = totalGrade + grades.get(i);
//        }
//        return totalGrade / grades.size();
    }

    public HashMap<String, String> getAttendance() {
        return this.attendance;
    }

    public void recordAttendance(String date, String value) {
        this.attendance.putIfAbsent(date, value);
    }

    public static void main(String[] args) {
        Student joanne = new Student("joanne");
        joanne.addGrade(95);
        joanne.addGrade(90);
        joanne.addGrade(100);

//        System.out.println("joanne.grades = " + joanne.grades);
//        System.out.println("joanne.getGradeAverage() = " + joanne.getGradeAverage());
//        System.out.println(joanne.getGradeAverage() == 95); //to check against expected value

        joanne.recordAttendance("2020-08-14", "P");
        joanne.recordAttendance("2020-08-07", "A");
        joanne.recordAttendance("2020-07-31", "P");
        System.out.println("joanne.attendance = " + joanne.attendance);
    }

}
