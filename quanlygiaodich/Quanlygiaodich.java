
package quanlygiaodich;

import java.util.ArrayList;
import java.util.Scanner;

public class Quanlygiaodich {
    ArrayList<Giaodich> Giaodichlist;
    Scanner sc;
    Giaodich cs;
    int chon;
    public Quanlygiaodich(){
        super();
        Giaodichlist= new ArrayList<Giaodich>();
        sc=new Scanner(System.in);
    }
    public void nhap(int n){
        for(int i=0;i<n;i++){
            System.out.println("1.giao dich vang");
            System.out.println("2.giao dich tien");
            System.out.println("0.END");
            chon= sc.nextInt();sc.nextLine();
            switch(chon){
                case 1:{
                    String Magiaodich;
                    int Ngaygiaodich;
                    int Dongia;
                    int Soluong;
                    String Loaivang;
                    System.out.println("Nhap ma giao dich:");sc.nextLine();
                    System.out.println("nhap ngay giao dich:");sc.nextInt();sc.nextLine();
                    System.out.println("nhap don gia:");sc.nextInt();
                    System.out.println("Nhap so luong:");sc.nextInt();
                    System.out.println("Nhap loai vang:");sc.nextLine();
                    //cs = new Giaodichvang(Loaivang, Magiaodich, Ngaygiaodich, Dongia, Soluong);
                    Giaodichlist.add(cs);
                    System.out.println("them thanh cong giao dich vang!");
                }
                break;
                case 2:{
                    String Magiaodich;
                    int Ngaygiaodich;
                    int Dongia;
                    int Soluong;
                    String Loaitien;
                    float Tigia;
                    System.out.println("nhap ma giao dich:");sc.nextLine();
                    System.out.println("nhap ngay giao dich:");sc.nextInt();sc.nextLine();
                    System.out.println("nhap don gia:");sc.nextInt();
                    System.out.println("Nhap so luong:");sc.nextInt();
                    System.out.println("Nhap Loai tien:");sc.nextLine();
                    System.out.println("nhap ti gia:");sc.nextFloat();
                    // cs=new public Giaodichtien( Loaitiente, Tigia, Magiaodich,Ngaygiaodich,Dongia, Soluong);
                   Giaodichlist.add(cs);
                    System.out.println("them thanh cong giao dich tien!");
                }
                break;
                default:
                    break;
            }
        }
    }
    public void xuat(){
        for(Giaodich cs:Giaodichlist){
            System.out.println(cs.toString());
        }
    }
    public void tongsoluongtungloai(){
        int Soluonggiaodichvang=0,Soluonggiaodichtien=0;
        for(Giaodich cs:Giaodichlist){
            if(cs instancef Giaodichvang){
                Soluonggiaodichvang += cs.getSoluong();
            }
            if(cs instancef Giaodichtien){
                Soluonggiaodichtien += cs.getSoluong();
            }
        }
        System.out.println("so luong giao dich vang"+Soluonggiaodichvang);
        System.out.println("so luong giao dich tien"+Soluonggiaodichtien);
    }
}
