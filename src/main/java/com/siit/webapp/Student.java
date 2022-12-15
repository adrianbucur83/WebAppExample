package com.siit.webapp;

public class Student {
    private final String firstName;
    private final String lastName;
    private final Integer mathGrade;
    private final Integer sportGrade;
    private final Integer historyGrade;
    private double average;

    public Student(String firstName, String lastName, Integer mathGrade, Integer sportGrade, Integer historyGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mathGrade = mathGrade;
        this.sportGrade = sportGrade;
        this.historyGrade = historyGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAverage() {
        double sum = mathGrade + sportGrade + historyGrade;
        average =  sum / 3.0;
        return average;
    }

    @Override
    public String toString() {
        return "Student -> " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mathGrade=" + mathGrade +
                ", sportGrade=" + sportGrade +
                ", historyGrade=" + historyGrade +
                ", average=" + average;

    }
}
