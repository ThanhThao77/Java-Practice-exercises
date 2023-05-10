/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GKH;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
/**
 *
 * @author Thanh Thảo
 */
public interface IKhachhang {
    public Connection getCon();
    public ArrayList<Khachhang> getKH();
    public void insertKH(String SoTK, String Hoten, String GT, String Diachi, double Sodu);
    public void updateKH(String SoTK, String Hoten, String GT, String Diachi, double Sodu);
    public void delKH(String Diachi, String GT);
    public ArrayList<Khachhang> getKHbySTKSodu(String Diachi, double Sodu);
}
