/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hinh;

/**
 *
 * @author MINHNHAT
 */
public class HinhChuNhat extends hinh{
    private float cd;
    private float cr;

    public HinhChuNhat(float cd, float cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public float getCd() {
        return cd;
    }

    public void setCd(float cd) {
        this.cd = cd;
    }

    public float getCr() {
        return cr;
    }

    public void setCr(float cr) {
        this.cr = cr;
    }
    @Override
    public double dientich(){
        System.out.println("dien tich la"+getCd()*getCr());
        //return dientich();
    }  
}

