package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentID;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private List<Integer> grades;

    // Constructor with all attributes
    public Student(int studentID, String firstName, String lastName, String dateOfBirth, List<Integer> grades) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.grades = grades;
    }

    // Constructor with empty grades list
    public Student(int studentID, String firstName, String lastName, String dateOfBirth) {
        this(studentID, firstName, lastName, dateOfBirth, new ArrayList<>());
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }



    public double calculateGradeAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public boolean isExcellent() {
        return calculateGradeAverage() >= 18.0;
    }

}
