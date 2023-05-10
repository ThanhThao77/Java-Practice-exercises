package GLuong;

public class NhanVien extends Person {
    private String Diachi;
    private double Luong;

    public NhanVien(){}

    public NhanVien(String Diachi, double Luong){
        this.Diachi = Diachi;
        this.Luong = Luong;
    }
    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public void setLuong(double luong) {
        Luong = luong;
    }

    public String getDiachi() {
        return Diachi;
    }

    public double getLuong() {
        return Luong;
    }
}
