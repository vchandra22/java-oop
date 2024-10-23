package com.enigma.gosling.encapsulation;

public class Student {
    private String name;
    private double totalScore;
    private int totalExams;

    public Student(String name) {
        this.name = name;
        this.totalScore = 0;
        this.totalExams = 0;
    }

    public void addExamScore(double score) {
        this.totalScore += score;
        this.totalExams++;
    }

    private double getAverageScore() {
        if (totalExams == 0) {
            return 0;
        }
        return totalScore / totalExams;
    }

    public String getStudentInfo() {
        return "Nama: " + getName() + ", Rata-rata: " + getAverageScore();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
