

package quanlygiaodich;


public class Giaodichvang extends Giaodich{
    String Loaivang;

    public Giaodichvang(String Loaivang, int Magiaodich, int Ngaygiaodich, int Dongia, int Soluong) {
        super(Magiaodich, Ngaygiaodich, Dongia, Soluong);
        this.Loaivang = Loaivang;
    }
    

    public String getLoaivang() {
        return Loaivang;
    }

    public void setLoaivang(String Loaivang) {
        this.Loaivang = Loaivang;
    }
    @Override
    public String toString(){
        return super.toString()+"Giaodichvang[ Loaivang"+Loaivang+"]";
    }
    
}
