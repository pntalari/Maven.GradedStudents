package io.zipcoder;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;

public class Student {

    public String firstName;

    public Student() {
    }

    public String lastName;
    public ArrayList<Double> examScores;
    Integer numberOfExams;

    //  Console console = new Console(System.in, System.out);

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setExamScore(int examNumber, Double examScore) {
        this.examScores.set(examNumber - 1, examScore);
    }

    public void addExamScore(Double examScore) {
        this.examScores.add(examScore);
    }

    public Integer getNumberOfExamsTaken() {
        return numberOfExams;
    }

    public String getExamScores() {
        String str = "";
        Integer j = 1;
        for (int i = 0; i < examScores.size(); i++) {
            str += "Exam " + j + " -> " + this.examScores.get(i).intValue() + "\n";
            j++;
        }
        return str;
    }

    public Integer getAverageExamScore() {
        Integer avg;
        Double sum = 0.0;
        for (int i = 0; i < examScores.size(); i++) {
            sum += examScores.get(i);
        }
        avg = (int) (sum / examScores.size());
        return avg;
    }

    @Override
    public String toString() {

        String str1 = "";
        String str = "";
        int j = 1;
        str = "Student Name: " + this.getFirstName() + " " + this.getLastName() + "\n" + "Average Score: " + this.getAverageExamScore() + "\n";

        for (int i = 0; i < examScores.size(); i++) {
            str1 += "Exam " + j + " -> " + this.examScores.get(i).intValue() + "\n";
            j++;
        }
        str = str + str1;

        return str;
    }


}
