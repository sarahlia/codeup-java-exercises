package grades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    public HashMap<String, String> attendance = new HashMap<>();

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

    //BONUS: Create an instance method on your Student class to calculate a student's attendance percentage
    public double attendancePercentage() {
        int present = Collections.frequency(new ArrayList<String>(attendance.values()), "P");
        return (double) present / attendance.size() * 100;
    }

    //BONUS: Create an instance method on Student that finds the specific days a student was absent. This method should return a List of Strings, where each string is the date of the absence.
    public List<String> daysAbsent() {
        List<String> newList = new ArrayList<>();

        for(String day: attendance.keySet()) {
//            System.out.println(day);
//            System.out.println("attendance.get(day) = " + attendance.get(day));
            if(attendance.get(day).equals("A")) {
                newList.add(day);
            } else {
                newList.remove(day);
            }
        }
        return newList;
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
        joanne.recordAttendance("2020-07-01", "P");
        joanne.recordAttendance("2020-07-02", "A");
        joanne.recordAttendance("2020-07-05", "P");
        joanne.recordAttendance("2020-07-12", "P");
        System.out.println("joanne.attendance = " + joanne.attendance);
        System.out.println("joanne.attendancePercentage() = " + joanne.attendancePercentage());
        System.out.println("joanne.daysAbsent() = " + joanne.daysAbsent());

    }


}
