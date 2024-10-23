package com.enigma.gosling.encapsulation;

public class StudentApp {
    public static void main(String[] args) {
        Student student = new Student("King");
        student.addExamScore(40);
        student.addExamScore(60);
        student.addExamScore(80);

        System.out.println(student.getStudentInfo());
    }
}
