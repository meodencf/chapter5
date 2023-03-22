/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hinh;
import java.util.ArrayList;
import java.util.Scanner;

public class danhsachhinh {
   
    ArrayList<hinh>listhinh;
    Scanner sc;
    hinh cx;
    int chon;
    public  danhsachhinh(){
        super();
        listhinh = new ArrayList<hinh>();
        sc = new Scanner(System.in);
    }
    public void nhap(int n){
        for(int i = 0; i < n ; i++){
            System.out.println("1:hinh tron");
            System.out.println("2:hinh chu nhat");
            System.out.println("!");
            chon= sc.nextInt();
            sc.nextLine();
            switch(chon){
                case 1:{
                    float r;
                    System.out.println("nhap ban kinh hinh tron:");r = sc.nextFloat();
                    System.out.println("ban da them hinh tron");
                }
                break;
                case 2:{
                    float cd;
                    float cr;
                    System.out.println("nhap chieu dai hinh chu nhat:");cd=sc.nextFloat();
                    System.out.println("nhap chieu rong hinh chu nhat:");cr=sc.nextFloat();
                    System.out.println("ban da them hinh chu nhat");
                }
                break;
                default:
                break;
            }
        }
        
    }
    public void xuat(){
        for(hinh cx:listhinh){
            System.out.println(cx.toString());
        }
    }
    public void dientichhinh(){
        float dientichhinhtron =0; float dientichhinhchunhat=0;
        for(hinh cx: listhinh){
            if(cx instanceof hinhtron){
                dientichhinhtron+=cx.dientich();
            }
            if(cx instanceof HinhChuNhat){
                dientichhinhchunhat+=cx.dientich();
            }
        }
        System.out.println("\n\nDien tich hinh tron la:"+dientichhinhtron);
        System.out.println("\n\nDien tich hinh chu nhat la:"+dientichhinhchunhat);
    }
}

