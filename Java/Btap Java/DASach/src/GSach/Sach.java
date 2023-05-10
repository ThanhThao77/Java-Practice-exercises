/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GSach;

/**
 *
 * @author thang
 */
public class Sach {
    private String Ma , TenS , NhaXB ;int NamXB;
    private double GiaB;

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTenS() {
        return TenS;
    }

    public void setTenS(String TenS) {
        this.TenS = TenS;
    }

    public String getNhaXB() {
        return NhaXB;
    }

    public void setNhaXB(String NhaXB) {
        this.NhaXB = NhaXB;
    }

    public int getNamXB() {
        return NamXB;
    }

    public void setNamXB(int NamXB) {
        this.NamXB = NamXB;
    }

    public double getGiaB() {
        return GiaB;
    }

    public void setGiaB(double GiaB) {
        this.GiaB = GiaB;
    }

    public Sach(String Ma, String TenS, String NhaXB, int NamXB, double GiaB) {
        this.Ma = Ma;
        this.TenS = TenS;
        this.NhaXB = NhaXB;
        this.NamXB = NamXB;
        this.GiaB = GiaB;
    }

    public Sach() {
    }
    public String Khuyenmai(){
        if(NamXB<=2019) return "Được giảm 25%";
        return "";
    }
}
