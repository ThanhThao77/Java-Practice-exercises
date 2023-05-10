package GLuong;

public class NhanVien extends Person{
    private String Diachi;
    private double Luong;

    public  NhanVien(){}
    public NhanVien(String Diachi, double Luong){
        this.Luong = Luong;
        this.Diachi = Diachi;
    }
    public NhanVien(String MaVN, String Hoten, String Diachi, double Luong){
        super(MaVN, Hoten);
        this.Luong = Luong;
        this.Diachi = Diachi;
    }

    public void setLuong(double luong) {
        Luong = luong;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public String getDiachi() {
        return Diachi;
    }

    public double getLuong() {
        return Luong;
    }
}
