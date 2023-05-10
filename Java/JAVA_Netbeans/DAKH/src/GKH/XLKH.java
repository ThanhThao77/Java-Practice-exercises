/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GKH;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
/**
 *
 * @author Thanh Thảo
 */
public class XLKH implements IKhachhang{

    Connection cn = null;
            
    @Override
    public Connection getCon() {
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dlkh", "root", "");
            System.out.println("Ket noi thanh cong");
        } catch (Exception e) {
            System.out.println("Loi ket noi: "+e);
        }
        return cn;
    }

    //lay du do len table su dung Statement
    // them, sua, xoa su dung PrepareStatement
    @Override
    public  ArrayList<Khachhang> getKH() {
        Connection cn = getCon();
        String sql = "Select * from tbKhachhang"; //bien SQL
        ArrayList<Khachhang> lists = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql); // thuc thi cau lenh truy van duoc tham so hoa;
            ResultSet rs = ps.executeQuery(); //Luu tru cac tap hop sau khi dc truy van tim kiem;
            while (rs.next()) {
                Khachhang k = new Khachhang();
                k.setSoTK(rs.getString("SoTK"));
                k.setHoten(rs.getString("Hoten"));
                k.setDiachi(rs.getString("Diachi"));
                k.setGT(rs.getString("GT"));
                k.setSodu(rs.getDouble("Sodu"));
                lists.add(k);

            }
            // model.setDataVector(dataVector, columnIdentifiers);
            cn.close();
            //   System.err.println(lists);
        } catch (Exception e) {
            System.out.println("Loi khong lay duoc khach hang: "+e);
        }

        return lists;
    }

    @Override
    public void insertKH(String SoTK, String Hoten, String GT, String Diachi, double Sodu) {
        PreparedStatement ps = null;
        cn=getCon();
        try {
            String sql = "INSERT INTO `tbkhachhang`(`SoTK`, `Hoten`, `GT`, `Diachi`, `Sodu`) VALUES (?,?,?,?,?)"; //bien SQL
            ps=cn.prepareStatement(sql);
            ps.setString(1, SoTK);
            ps.setString(2, Hoten);
            ps.setString(3, GT);
            ps.setString(4, Diachi);
            ps.setDouble(5, Sodu);
            ps.executeUpdate();
            cn.close();
            
            System.out.println("Them thanh Cong");
        } catch (Exception e) {
            System.out.println("Loi khong them duoc "+e);
        }
    }

    @Override
    public void updateKH(String SoTK, String Hoten, String GT, String Diachi, double Sodu) {
        PreparedStatement ps = null;
        cn=getCon();
        try {
            String sql = "UPDATE `tbkhachhang` SET Hoten=?,GT=?,Diachi=?,Sodu=? WHERE SoTK =?"; //bien SQL
            ps=cn.prepareStatement(sql);
            ps.setString(1, Hoten);
            ps.setString(2, GT);
            ps.setString(3, Diachi);
            ps.setDouble(4, Sodu);
            ps.setString(5, SoTK);
            int row = ps.executeUpdate();
            cn.close();
            
            if(row != 0) System.out.println("Sua thanh Cong");
        } catch (Exception e) {
            System.out.println("Loi khong sua duoc "+e);
        }
    }

    @Override
    public void delKH(String Diachi, String GT) {
        PreparedStatement ps = null;
        cn=getCon();
        try {
            String sql = "DELETE FROM `tbkhachhang` WHERE Diachi = ? and GT = ?";
            ps=cn.prepareStatement(sql);
            ps.setString(1, Diachi);
            ps.setString(2, GT);
            int row = ps.executeUpdate();
//            cn.close();
            
            if(row != 0) System.out.println("Xoa thanh cong");

        } catch (Exception e) {
            System.out.println("Loi khong xoa duoc "+e);
        }
    }

    @Override
    public ArrayList<Khachhang> getKHbySTKSodu(String Diachi, double Sodu) {
//        ArrayList<Khachhang> lists = new ArrayList<>();
//        cn=getCon();
//        Statement smt=null;
//        
//        try {
//            String sql = "Select * from tbKhachhang WHERE SoTK= '"+Diachi+"' AND Sodu="+Sodu; //bien SQL
//            //bien SQL
//            smt=cn.createStatement();
//            ResultSet rs=smt.executeQuery(sql);
//            while (rs.next()) {
//                Khachhang k = new Khachhang();
//                k.setSoTK(rs.getString("SoTK"));
//                k.setHoten(rs.getString("Hoten"));
//                k.setDiachi(rs.getString("Diachi"));
//                k.setGT(rs.getString("GT"));
//                k.setSodu(rs.getDouble("Sodu"));
//                lists.add(k);
//
//            }
//            cn.close();
//        } catch (Exception e) {
//            System.out.println("Loi khong tim kiem duoc: "+e);
//        }
//        return lists;

         Connection cn = getCon();
        String sql = "Select * from tbkhachhang WHERE Diachi=? AND Sodu=?"; //bien SQL
        ArrayList<Khachhang> lists = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql); // thuc thi cau lenh truy van duoc tham so hoa;
            ps.setString(1, Diachi);
            ps.setDouble(2, Sodu);
            ResultSet rs = ps.executeQuery(); //Luu tru cac tap hop sau khi dc truy van tim kiem;
            //DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            while (rs.next()) {
                Khachhang k = new Khachhang();
                k.setSoTK(rs.getString("SoTK"));
                k.setHoten(rs.getString("Hoten"));
                k.setDiachi(rs.getString("Diachi"));
                k.setGT(rs.getString("GT"));
                k.setSodu(rs.getDouble("Sodu"));
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
    
}
