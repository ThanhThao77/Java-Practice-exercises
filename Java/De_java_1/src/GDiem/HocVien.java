package GDiem;

public class HocVien {
    private String MaHV;
    private String Hoten;
    private String Lop;
    private double Diem;

    public HocVien() {
    }

    public HocVien(String MaHV, String Hoten, String Lop, double Diem) {
        this.MaHV = MaHV;
        this.Hoten = Hoten;
        this.Lop = Lop;
        this.Diem = Diem;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public void setDiem(double diem) {
        Diem = diem;
    }

    public void setLop(String lop) {
        Lop = lop;
    }

    public void setMaHV(String maHV) {
        MaHV = maHV;
    }

    public String getHoten() {
        return Hoten;
    }

    public String getLop() {
        return Lop;
    }

    public String getMaHV() {
        return MaHV;
    }

    public double getDiem() {
        return Diem;
    }

    public String Ketqua (){
        return Diem > 25 ? "Dat":"";
    }

    @Override
    public String toString() {
        return "HocVien{" +
                "MaHV='" + MaHV + '\'' +
                ", Hoten='" + Hoten + '\'' +
                ", Lop='" + Lop + '\'' +
                ", Diem=" + Diem +
                '}';
    }
}
