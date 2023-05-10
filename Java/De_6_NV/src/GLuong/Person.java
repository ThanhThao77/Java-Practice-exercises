package GLuong;
public class Person {
    private String MaNV;
    private String Hoten;

    public Person(){}
    public Person(String MaNV, String Hoten){
        this.Hoten = Hoten;
        this.MaNV = MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getMaNV() {
        return MaNV;
    }

    public String getHoten() {
        return Hoten;
    }
}
