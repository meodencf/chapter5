/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hinh;

public class hinhtron extends hinh{
    private float r;
    public hinhtron(float r) {
        this.r = r;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
    @Override
    public double dientich(){
        System.out.println("dien tich hinh tron la:"+getR()*getR()*3.14);
        return dientich();
    }
}
