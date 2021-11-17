/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12;

/**
 *
 * @author Mano
 */
public class Clothing {
    private int itemID = 0;
    private String desc = "U";
    private char colorCode;
    private double price;
    
    public void display(){
        System.out.println("itemID: " + getItemID());
        System.out.println("description: " + getDesc());
        System.out.println("colorCode: " + getColorCode());
        System.out.println("price: " + getPrice());
    }

    public Clothing(int itemID, String desc, char colorCode, double price) {
        this.itemID = itemID;
        this.desc = desc;
        this.colorCode = colorCode;
        this.price = price;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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
    
    public String toString(){
    return "\nThis shirt is a" + desc + ";"
            + "\nPrice" + getPrice() + "\nColor: " + getColorCode();
    }
}