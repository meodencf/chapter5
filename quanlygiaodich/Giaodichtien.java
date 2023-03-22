
package quanlygiaodich;

public class Giaodichtien extends Giaodich{
    private String Loaitiente;
    private float Tigia;

    public Giaodichtien(String Loaitiente, float Tigia, int Magiaodich, int Ngaygiaodich, int Dongia, int Soluong) {
        super(Magiaodich, Ngaygiaodich, Dongia, Soluong);
        this.Loaitiente = Loaitiente;
        this.Tigia = Tigia;
    }

    public String getLoaitiente() {
        return Loaitiente;
    }

    public void setLoaitiente(String Loaitiente) {
        this.Loaitiente = Loaitiente;
    }

    public float getTigia() {
        return Tigia;
    }

    public void setTigia(float Tigia) {
        this.Tigia = Tigia;
    }
    @Override
    public String toString(){
        return super.toString()+"Giaodichtien[ Loaitiente="+Loaitiente+",Tigia="+Tigia +" ]";
    }

    
}
