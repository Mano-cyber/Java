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
public class Employees {
    private String firstName;
    private String lastName;
    private char gender;
    private double age;

    public Employees(String firstName, String lastName, char gender, double age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }
    
        public void display() {
        System.out.println("firtsName: " + getFirstName());
        System.out.println("lastName: " + getLastName());
        System.out.println("gender: " + getGender());
        System.out.println("age: " + getAge());
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
//    private String getFirstName() {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
    public String Employees(){
        return "\nfirtsName: " + getFirstName()
                + "\nlastName: " + getLastName() 
                + "\ngender: " + getGender()
                + "\nage: " + getAge();
    }
    
}