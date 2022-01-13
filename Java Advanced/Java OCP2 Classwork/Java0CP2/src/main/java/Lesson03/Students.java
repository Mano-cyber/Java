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
public class Students {

    private String firstName;
    private String lastName;
    private int age;
    private String email = null;
    private String repositoryURL = null;

    public Students(String firstName, String lastName, int age, String email, String repositoryURL) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.repositoryURL = repositoryURL;
    }

    public Students(String firstName, String lastName, int age, String repositoryURL) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.repositoryURL = repositoryURL;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRepositoryUrl() {
        return repositoryURL;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryURL = repositoryUrl;
    }

}
