/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCB;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Thanh Thảo
 */
public class XL_QLCB implements ICanbo{
    public static Connection cn;

    public static Connection getCon() { // static bien tinh phải có body
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlcb", "root", "");
            System.err.println("Oke");
        } catch (SQLException e) {
            System.err.println("Not oke");
        }
        return cn;
    }

    @Override
    public ArrayList<CanBo> getCB() {
        Connection cn = getCon();
        String sql = "Select * from tbcanbo"; //bien SQL
        ArrayList<CanBo> lists = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql); // thuc thi cau lenh truy van duoc tham so hoa;
            ResultSet rs = ps.executeQuery(); //Luu tru cac tap hop sau khi dc truy van tim kiem;
            //DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            while (rs.next()) {
                CanBo k = new CanBo();
                k.setSoTK(rs.getString("SoTK"));
                k.setHoten(rs.getString("Hoten"));
                k.setDiachi(rs.getString("Diachi"));
                k.setGT(rs.getString("GT"));
                k.setLuong(rs.getDouble("Luong"));
                lists.add(k);

            }
            // model.setDataVector(dataVector, columnIdentifiers);
            cn.close();
            //   System.err.println(lists);
        } catch (Exception e) {
            // TODO: handle exception
        }

        return lists;
    }
    
    public void insertCB(String SoTK, String Hoten, String GT, String Diachi, Double Luong){
        Connection cn = getCon();
        String sql = "INSERT INTO `tbcanbo`(`SoTK`, `Hoten`, `GT`, `Diachi`, `Luong`) VALUES (?,?,?,?,?)"; //bien SQL
        try {
            PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
            ps.setString(1, SoTK);
            ps.setString(2, Hoten);
            ps.setString(3, GT);
            ps.setString(4, Diachi);
            ps.setDouble(5, Luong);
            ps.executeUpdate();
            cn.close();
            
            System.err.println("Thanh Cong");
        } catch (Exception e) {
            System.err.println("Khong Thanh Cong");
        }
    }
    
    public void delCB(String Diachi, String GT){
        Connection cn = getCon();
        String sql = "DELETE FROM `tbsach` WHERE Diachi = ? and GT = ?";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, Diachi);
            ps.setString(2, GT);
            ps.executeUpdate();
            cn.close();
            
            System.out.println("Xoa thanh cong");
        } catch (Exception e) {
            System.out.println("Loi khong xoa duoc "+e); 
        }
    }
    
    public void updateCB(String SoTK, String Hoten, String GT, String Diachi, Double Luong){
        
        Connection cn = getCon();
        String sql = "UPDATE `tbcanbo` SET Hoten=?,GT=?,Diachi=?,Luong=? WHERE SoTK =?";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, Hoten);
            ps.setString(2, GT);
            ps.setString(3, Diachi);
            ps.setDouble(4, Luong);
            ps.setString(5, SoTK);
            ps.executeUpdate();
            cn.close();
            
            System.out.println("Sua thanh cong");
        } catch (Exception e) {
            System.out.println("Loi khong sua duoc "+e); 
        }
    }    

    void delCB(String text, String text0, String text1, String text2, double parseDouble) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
