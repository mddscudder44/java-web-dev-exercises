package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!

        Student newStudent = new Student("Erin Scudder", 12345, 1, 4.0);
        System.out.println("Student Name: " + newStudent.getName());
        System.out.println("Student ID: " + newStudent.getStudentId());
        System.out.println("Student Credits: " + newStudent.getNumberOfCredits());
        System.out.println("Student GPA: " + newStudent.getGpa());

    }
}
