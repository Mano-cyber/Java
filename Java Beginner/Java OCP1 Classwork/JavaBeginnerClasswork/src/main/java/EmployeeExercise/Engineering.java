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
public class Engineering extends Employees{
    
    private String occupation;
    private double salary;
    
    public Engineering( String firtsName, String lastName, char gender, int age, int idNumber, String occupation, double salary) {
        super(firtsName, lastName, gender, age);
        this.occupation = occupation;
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Time: " + getOccupation());
        System.out.println("Salary: " + getSalary());
        System.out.println("\n");
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}