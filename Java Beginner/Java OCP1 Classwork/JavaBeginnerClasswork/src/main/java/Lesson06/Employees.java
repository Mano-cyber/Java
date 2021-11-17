/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson06;

/**
 *
 * @author Mano
 */
public class Employees {
    private String name;
    private String surname;
    private int age;
    private String contactNum;
    private int identityNum;

    public Employees(String name, String surname, int age, String contactNum, int identityNum) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.contactNum = contactNum;
        this.identityNum = identityNum;
    }

    public void displaydetails(){
        System.out.println("Name: " + getName() + "\nSurname: " + getSurname() + "\nAge: " + getAge()
                + "\nContact Number: " + getContactNum() + "\nID Number: " + getIdentityNum());
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public int getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(int identityNum) {
        this.identityNum = identityNum;
    }
    
    
}
