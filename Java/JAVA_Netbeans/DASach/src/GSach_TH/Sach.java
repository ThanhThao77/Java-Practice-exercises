/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GSach_TH;

/**
 *
 * @author Thanh Thảo
 */
public class Sach {

    /**
     * @param args the command line arguments
     */
    private int MaS;
    private String TenS, NhaXB;
    private int NamXB;
    private double GiaB;

    public Sach() {
    }

    public Sach(int MaS, String TenS, String NhaXB, int NamXB, double GiaB) {
        this.MaS = MaS;
        this.TenS = TenS;
        this.NhaXB = NhaXB;
        this.NamXB = NamXB;
        this.GiaB = GiaB;
    }

    public int getMaS() {
        return MaS;
    }

    public void setMaS(int MaS) {
        this.MaS = MaS;
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
    
    public double Khuyenmai(){
        if(NamXB < 2019){
            return this.GiaB * 25/100;
        }
        return 0;
    }
    
    
    
   
    
}
