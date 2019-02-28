package io.zipcoder;

import java.util.ArrayList;

public class Classroom {

    ArrayList<Student> students = new ArrayList<>();
    Integer maxNumberOfStudents;
    Student studObj = new Student();

    public Classroom() {

    }

    public Classroom(ArrayList<Student> students) {
        this.students = students;
    }

    public Classroom(Integer maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public double getAverageExamScore() {
        Integer examSum=0;
        Integer avgSum=0.0;
        for (Student s : students) {
            examSum += s.getAverageExamScore();
        }
        avgSum = (int)(examSum/students.size());

        return 0.0;
    }

    public void addStudent(Student student) {

    }

}

