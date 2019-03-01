package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;

public class ClassroomTest {

    @Test
    public void getAverageExamScoreTest() {
        // Given
        ArrayList<Double> examScores1 = new ArrayList<>();
        ArrayList<Double> examScores2 = new ArrayList<>();
        examScores1.add(100.0);
        examScores1.add(150.0);
        examScores2.add(225.0);
        examScores2.add(25.0);

        Student student1 = new Student("student", "one", examScores1);
        Student student2 = new Student("student", "two", examScores2);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        Classroom classroom = new Classroom(students);

        // When
        double output = classroom.getAverageExamScore();

        // Then
        System.out.println(output);
    }

    @Test
    public void addStudentTest() {
        // Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        //    Classroom classroom2 = new Classroom(maxNumberOfStudents);
        ArrayList<Double> examScores1 = new ArrayList<>();
        examScores1.add(100.0);
        examScores1.add(150.0);
        examScores1.add(225.0);

        // When
        ArrayList<Student> preEnrollment = classroom.getStudents();
        Student student = new Student("Leon", "Hunter", examScores1);
        classroom.addStudent(student);
        ArrayList<Student> postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = preEnrollment.toString();
        String postEnrollmentAsString = postEnrollment.toString();

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }

    @Test
    public void removeStudentTest() {
        // Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        //Classroom classroom2 = new Classroom(maxNumberOfStudents);
        ArrayList<Double> examScores1 = new ArrayList<>();
        examScores1.add(100.0);
        examScores1.add(150.0);
        examScores1.add(225.0);

        // When
        Student student = new Student("Leon", "Hunter", examScores1);
        classroom.addStudent(student);
        ArrayList<Student> preEnrollment = classroom.getStudents();
        classroom.removeStudent(student.firstName, student.lastName);
        ArrayList<Student> postEnrollment = classroom.getStudents();
        // Then
        String preEnrollmentAsString = preEnrollment.toString();
        String postEnrollmentAsString = postEnrollment.toString();

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }

    @Test
    public void getStudentsByScoreTest() {
        // Given
        ArrayList<Double> examScores1 = new ArrayList<>();
        ArrayList<Double> examScores2 = new ArrayList<>();
        ArrayList<Double> examScores3 = new ArrayList<>();
        examScores1.add(100.0);
        examScores1.add(150.0);
        examScores2.add(225.0);
        examScores2.add(25.0);
        examScores3.add(100.0);
        examScores3.add(50.0);
        examScores3.add(60.0);

        Student student1 = new Student("student", "one", examScores1);
        Student student2 = new Student("student", "two", examScores2);
        Student student3 = new Student("student", "three", examScores3);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Classroom classroom = new Classroom(students);

        // When
       // Classroom output = classroom.getStudentsByScore(students);
        Comparator<Student> comparator = (Comparator<Student>) new Classroom(students);
        ArrayList<Student> actual = classroom.getStudentsByScore(comparator);

        // Then
        //Assert.assertTrue();
        System.out.println(actual);
    }



}
