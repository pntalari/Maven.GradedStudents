package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Classroom {

    ArrayList<Student> students = new ArrayList<>();
    Integer maxNumberOfStudents;
    Student studObj = new Student();

    public Classroom()  {

    }

    public Classroom(ArrayList<Student> students) {
        this.students = students;
    }

    public Classroom(Integer maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public ArrayList<Student> getStudents() {
        return (ArrayList<Student>)students.clone();
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

    public void removeStudent(String firstName, String lastName)
    {
        for(Student s:students)
        {
            if(s.getLastName().equals(lastName) && s.getFirstName().equals(firstName))
            {
                students.remove(s);
                break;
            }
        }

    }

    public ArrayList<Student> getStudentsByScore(Comparator<Student> comparator){
        ArrayList<Student> sortedArr = new ArrayList<>();
        Collections.sort(this.students,comparator);
        return sortedArr;
    }

//    @Override
//    public int compare(Student o1, Student o2) {
//        return this.students.compareTo(this.students);
//    }


}

