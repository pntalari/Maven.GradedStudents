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
        String str = "";
        //  Student[] studArr = new Student[students.size() + 1];
        ArrayList<String> list = new ArrayList<>();
        Map<Integer, String> map = new TreeMap();
        //  studArr = Arrays.copyOf(students.toArray(studArr), students.size() + 1);
        Integer i = 0;
        for (Student stud : students) {
            map.put(stud.getAverageExamScore(), stud.getLastName());
        }
        Integer count = map.size() - 1;

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (((count/ (map.size())) * 100) > 10) {
                str += entry.getValue() + " " + "Graded: A" + "\n";
            }
            else if (((count / (map.size())) * 100) > 11 || ((((map.size() - 1) / (map.size())) * 100) < 29)) {
                str += entry.getValue() + " " + "Graded: B" + "\n";
            }
            else if (((count / (map.size())) * 100) > 30 || ((((map.size() - 1) / (map.size())) * 100) < 50)) {
                str += entry.getValue() + " " + "Graded: C" + "\n";
            }
            else if (((count / (map.size())) * 100) > 51 || ((((map.size() - 1) / (map.size())) * 100) < 89)) {
                str += entry.getValue() + " " + "Graded: D" + "\n";
            }
            else if (((count / (map.size())) * 100) < 11) {
                str += entry.getValue() + " " + "Graded: F" + "\n";
            }
            count--;
        }
        System.out.println(str);
    }
}

//        An A is awarded to students whose class average is in the upper 10th percentile.
//        A B is awarded to students whose class average falls between the 11th and 29th percentile.
//        A C is awarded to students whose class average falls between the 30th and 50th percentile.
//        A D is awarded to students whose class average falls between the 51st and 89th percentile.
//        An F is awarded to students whose class average is in the lower 11th percentile.
    //   Percentile = (number of people behind you/total number of people) x 100


