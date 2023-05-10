/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package QLCB;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Thanh Thảo
 */
public interface ICanbo {
    public static Connection getCon(){return null;};
    public ArrayList<CanBo> getCB();
    public void insertCB(String SoTK, String Hoten, String GT, String Diachi, Double Luong);
    public void delCB(String Diachi,String GT);
    public void updateCB(String SoTK, String Hoten, String GT, String Diachi, Double Luong);
}
