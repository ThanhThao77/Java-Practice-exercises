/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GSach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author thang
 */
public class XLSach implements ISach {

    public static Connection cn;

    public static Connection getCon() { // static bien tinh phải có body
        try {
            cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo", "root", "");
            System.err.println("Oke");
        } catch (SQLException e) {
            System.err.println("Not oke");
        }
        return cn;
    }

    @Override
    public ArrayList<Sach> getSA() {
        Connection cn = getCon();
        String sql = "Select * from tbsach"; //bien SQL
        ArrayList<Sach> lists = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql); // thuc thi cau lenh truy van duoc tham so hoa;
            ResultSet rs = ps.executeQuery(); //Luu tru cac tap hop sau khi dc truy van tim kiem;
            //DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            while (rs.next()) {
                Sach k = new Sach();
                k.setMa(rs.getString("MaS"));
                k.setTenS(rs.getString("TenS"));
                k.setNhaXB(rs.getString("NhaXB"));
                k.setNamXB(rs.getInt("NamXB"));
                k.setGiaB(rs.getDouble("GiaB"));
                k.Khuyenmai();
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

    @Override
    public ArrayList<Sach> getSAbyNXBGB(String NXB, double GB) {
        Connection cn = getCon();
        String sql = "Select * from tbsach WHERE NhaXB=? AND GiaB=?"; //bien SQL
        ArrayList<Sach> lists = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql); // thuc thi cau lenh truy van duoc tham so hoa;
            ps.setString(1, NXB);
            ps.setDouble(2, GB);
            ResultSet rs = ps.executeQuery(); //Luu tru cac tap hop sau khi dc truy van tim kiem;
            //DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            while (rs.next()) {
                Sach k = new Sach();
                k.setMa(rs.getString("MaS"));
                k.setTenS(rs.getString("TenS"));
                k.setNhaXB(rs.getString("NhaXB"));
                k.setNamXB(rs.getInt("NamXB"));
                k.setGiaB(rs.getDouble("GiaB"));
                k.Khuyenmai();
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
//    public static void main(String[] args) {
//        getCon();
//    }
    
}
