/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13;

/**
 *
 * @author Mano
 */
public abstract class Material {
    private String materialType01 = "cotton";
    private String materialType02 = "wool";
    private String materialType03 = "silk";

    public String getMaterialType01() {
        return materialType01;
    }

    public void setMaterialType01(String materialType01) {
        this.materialType01 = materialType01;
    }

    public String getMaterialType02() {
        return materialType02;
    }

    public void setMaterialType02(String materialType02) {
        this.materialType02 = materialType02;
    }

    public String getMaterialType03() {
        return materialType03;
    }

    public void setMaterialType03(String materialType03) {
        this.materialType03 = materialType03;
    }
    
    
}
