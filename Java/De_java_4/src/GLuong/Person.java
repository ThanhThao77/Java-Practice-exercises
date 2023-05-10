package GLuong;

public class Person {
    private String MaVN;
    private String Hoten;

    public Person(){}
    public Person(String MaVN, String Hoten){
        this.Hoten = Hoten;
        this.MaVN = MaVN;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public void setMaVN(String maVN) {
        MaVN = maVN;
    }

    public String getHoten() {
        return Hoten;
    }

    public String getMaVN() {
        return MaVN;
    }
}
