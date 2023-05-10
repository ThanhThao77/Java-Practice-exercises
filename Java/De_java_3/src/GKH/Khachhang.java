package GKH;

public class Khachhang {
    private String SoTK;
    private String Hoten;
    private String GT;
    private String Diachi;
    private double Sodu;

    public Khachhang() {
    }

    public Khachhang(String SoTK, String Hoten, String GT, String Diachi, double Sodu) {
        this.Diachi = Diachi;
        this.GT = GT;
        this.Hoten = Hoten;
        this.Sodu = Sodu;
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

    public void setSodu(double sodu) {
        Sodu = sodu;
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

    public Double getSodu() {
        return Sodu;
    }
}
