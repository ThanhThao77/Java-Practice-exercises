/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QLCB;

/**
 *
 * @author Thanh Thảo
 */
public class CanBo {

    /**
     * @param args the command line arguments
     */
    private String SoTK, Hoten, GT, Diachi;
    private double Luong;

    public CanBo() {
    }

    public CanBo(String SoTK, String Hoten, String GT, String Diachi, double Luong) {
        this.SoTK = SoTK;
        this.Hoten = Hoten;
        this.GT = GT;
        this.Diachi = Diachi;
        this.Luong = Luong;
    }

    public String getSoTK() {
        return SoTK;
    }

    public void setSoTK(String SoTK) {
        this.SoTK = SoTK;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }
    
    
    
    
}
