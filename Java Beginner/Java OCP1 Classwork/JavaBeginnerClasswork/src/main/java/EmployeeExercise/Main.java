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
public class Main {
    public static void main(String[] args) {
        Employees emp1 = new Employees ("Mano", "Mambane", 'M', 23);
        HR emp2 = new HR ("Miyi", "Mambane", 'M', 16, 985522, "Assistant", 32000);
        Engineering emp3 = new Engineering ("Eve", "Jacobs", 'F', 27, 970423, "Mechanic", 45000);
        Employees emp4 = new Employees ("Michell", "Jones", 'F', 24);
        
        emp1.display();
        System.out.println("-------------------------------------");
        emp2.display();
        System.out.println("-------------------------------------");
        emp3.display();
        System.out.println("-------------------------------------");
        emp4.display();
    }
}
