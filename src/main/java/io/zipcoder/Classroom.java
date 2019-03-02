package io.zipcoder;

import java.util.*;

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
        // return this.students;
        return (ArrayList<Student>) students.clone();
    }

    public double getAverageExamScore() {
        Double examSum = 0.0;
        Double avgSum = 0.0;
        for (Student s : students) {
            examSum += s.getAverageExamScore();
        }
        avgSum = (examSum / students.size());

        return avgSum;
    }

    public void addStudent(Student student) {
        this.students.add(student);

    }

    public void removeStudent(String firstName, String lastName) {
        for (Student s : students) {
            if (s.getLastName().equals(lastName) && s.getFirstName().equals(firstName)) {
                students.remove(s);
                break;
            }
        }

    }

    public Student[] getStudentsByScore(Comparator<Student> comparator) {
        Student[] studentArr = new Student[students.size()];
        studentArr = students.toArray(studentArr);
        Arrays.sort(studentArr, comparator);
        //Collections.sort(students, comparator);
        return studentArr;
    }

    public void getGradeBook() {
        Map<ArrayList<Student>, Integer> studMap = new TreeMap<>();
        Integer count = 1;
        for (int i = 0; i < students.size(); i++) {
            studMap.put(this.students,students.get(i).getAverageExamScore());
        }
//        An A is awarded to students whose class average is in the upper 10th percentile.
//        A B is awarded to students whose class average falls between the 11th and 29th percentile.
//        A C is awarded to students whose class average falls between the 30th and 50th percentile.
//        A D is awarded to students whose class average falls between the 51st and 89th percentile.
//        An F is awarded to students whose class average is in the lower 11th percentile.

    }

}