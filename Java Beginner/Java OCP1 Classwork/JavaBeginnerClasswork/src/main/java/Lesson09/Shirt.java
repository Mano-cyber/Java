/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson09;

/**
 *
 * @author Mano
 */
public class Shirt {
    private int shirtID = 0;
    private String description = "description required-";
    private char colorCode = 'U';
    private double price = 0.0;

    public Shirt(int shirtID, char colorCode, String desc, double price) {
        this.shirtID = shirtID;
        this.description = description;
        this.colorCode = colorCode;
        this.price = price;
    }

    
    
    public Shirt(char colorCode, String desc, double price) {
        setColorCode(colorCode);
        setDescription(desc);
        setPrice(price);
    }    

    public Shirt(String desc, double price) {
        setDescription(desc);
        setPrice(price);
    }
    
    public Shirt(double price) {
        setPrice(price);
    }

    public void display(){
        System.out.println("Shirt ID: " + getShirtID());
        System.out.println("Color Code: " + getColorCode());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: " + getPrice() + "\n");
    }
    
    public int getShirtID() {
        return shirtID;
    }

    public void setShirtID(int shirtID) {
        this.shirtID = shirtID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }       
}
