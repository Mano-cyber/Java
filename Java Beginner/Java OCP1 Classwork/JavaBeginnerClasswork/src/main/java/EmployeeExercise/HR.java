/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeExercise;

/**
 *
 * @author Mano
 */
public class HR extends Employees {

    private String role;
    private double salary;

    public HR (String firstName, String lastName, char gender, int age, int idNumber, String role, double salary){
        super(firstName, lastName, gender, age);
        this.role = role;
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("role: " + getRole());
        System.out.println("salary: " + getSalary());
    }

    public String getRole() {
        return role;
    }

    public void setRole() {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary = salary;
    }

}
