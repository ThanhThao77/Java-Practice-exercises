package QLCB;

public class Canbo {
    private String SoTK;
    private String Hoten;
    private String GT;
    private String Diachi;
    private double Luong;

    public Canbo() {
    }

    public Canbo(String SoTK, String Hoten, String GT, String Diachi, double Luong) {
        this.Diachi = Diachi;
        this.GT = GT;
        this.Hoten = Hoten;
        this.Luong = Luong;
        this.SoTK = SoTK;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public void setSoTK(String soTK) {
        SoTK = soTK;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public void setLuong(double luong) {
        Luong = luong;
    }

    public String getHoten() {
        return Hoten;
    }

    public String getSoTK() {
        return SoTK;
    }

    public String getGT() {
        return GT;
    }

    public String getDiachi() {
        return Diachi;
    }

    public double getLuong() {
        return Luong;
    }

    @Override
    public String toString() {
        return "Canbo{" +
                "SoTK='" + SoTK + '\'' +
                ", Hoten='" + Hoten + '\'' +
                ", GT='" + GT + '\'' +
                ", Diachi='" + Diachi + '\'' +
                ", Luong=" + Luong +
                '}';
    }
}
