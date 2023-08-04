package org.example;

public class main {
    public static void main(String[] args) {
        // Create students and professors
        Student student1 = new Student(1, "John", "owino", "1999-01-01");
        Student student2 = new Student(2, "Jane", "anyango", "2000-03-15");
        Student student3 = new Student(3, "Alice", "opiyo", "1998-07-20");
        Student student4 = new Student(4, "otile", "Brown", "2001-11-05");

        Professor professor1 = new Professor(101, "Professor", "kosewe", "Math");
        Professor professor2 = new Professor(102, "Professor", "elena", "Physics");

        // Assign grades to students
        professor1.assignGrade(student1, 20);
        professor1.assignGrade(student2, 15);
        professor2.assignGrade(student3, 18);
        professor2.assignGrade(student4, 22);

        // Put students and professors in arrays
        Student[] students = {student1, student2, student3, student4};
        Professor[] professors = {professor1, professor2};

        // Print excellent students
        System.out.println("Excellent students:");
        for (Student student : students) {
            if (student.isExcellent()) {
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }
        }

        // Find student with the highest grade average
        Student highestAverageStudent = null;
        double highestAverage = 0.0;
        for (Student student : students) {
            double average = student.calculateGradeAverage();
            if (average > highestAverage) {
                highestAverage = average;
                highestAverageStudent = student;
            }
        }

        if (highestAverageStudent != null) {
            System.out.println("Student with the highest grade average: " +
                    highestAverageStudent.getFirstName() + " " + highestAverageStudent.getLastName());
        }
    }
}
