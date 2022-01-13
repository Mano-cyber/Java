/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson3;

/**
 *
 * @author Mano
 */
public class GroupB extends Students {

    private int numStudents = 12;
    private String course;
    private boolean attendance = false;
    private double annualFees;

    public GroupB(String firstName, String lastName, int age, String email, String repositoryURL) {
        super(firstName, lastName, age, email, repositoryURL);
        this.course = course;
        this.attendance = attendance;
        this.annualFees = annualFees;
    }

    public GroupB(String course, double annualFees, String firstName, String lastName, int age, String email, String repositoryURL) {
        super(firstName, lastName, age, email, repositoryURL);
        this.course = course;
        this.annualFees = annualFees;
    }

    public GroupB(String course, double annualFees, String firstName, String lastName, int age, String repositoryURL) {
        super(firstName, lastName, age, repositoryURL);
        this.course = course;
        this.annualFees = annualFees;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public boolean isAttendance() {
        return attendance;
    }

    public void setAttendance(boolean attendance) {
        this.attendance = attendance;
    }

    public double getAnnualFees() {
        return annualFees;
    }

    public void setAnnualFees(double annualFees) {
        this.annualFees = annualFees;
    }
    

}
