
package quanlygiaodich;

public class Giaodich {
    private String Magiaodich;
    private int Ngaygiaodich;
    private int Dongia;
    private int Soluong;

    public Giaodich(int Magiaodich, int Ngaygiaodich, int Dongia, int Soluong) {
        this.Magiaodich = Magiaodich;
        this.Ngaygiaodich = Ngaygiaodich;
        this.Dongia = Dongia;
        this.Soluong = Soluong;
    }

    public String getMagiaodich() {
        return Magiaodich;
    }

    public void setMagiaodich(String Magiaodich) {
        this.Magiaodich = Magiaodich;
    }

    public int getNgaygiaodich() {
        return Ngaygiaodich;
    }

    public void setNgaygiaodich(int Ngaygiaodich) {
        this.Ngaygiaodich = Ngaygiaodich;
    }

    public int getDongia() {
        return Dongia;
    }

    public void setDongia(int Dongia) {
        this.Dongia = Dongia;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }
    @Override
    public String toString(){
        return "Giaodich[magiaodich=" + Magiaodich + ",Ngaygiaodich="+Ngaygiaodich+",Ngaygiaodich=" + Ngaygiaodich+",Dongia="+Dongia+",Soluong="
                +Soluong+"]";
        
    }
    
   
}
