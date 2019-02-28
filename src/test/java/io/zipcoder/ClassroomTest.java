package io.zipcoder;

import org.junit.Test;

import java.util.ArrayList;

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
    public void addStudentTest(){
        // Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double> examScores1 = new ArrayList<>();
        examScores1.add(100.0);
        examScores1.add(150.0);
        examScores1.add(225.0);

        Student student = new Student("Leon", "Hunter", examScores1);

        // When
        ArrayList<Student> preEnrollment = classroom.getStudents();
        classroom.addStudent(s1);
        String[] postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }


}
