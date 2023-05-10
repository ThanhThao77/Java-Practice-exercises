/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author thang
 */
public class XLTT {

    public static Connection cn;

    public static Connection getCon() {
        try {
            cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo", "root", "");
            System.err.println("Oke");
        } catch (SQLException e) {
            System.err.println("Not oke");
        }
        return cn;
    }

    public ArrayList getdata() {
        Connection cn = getCon(); // bien ket noi
        String sql = "Select * from tbrectangle"; //bien SQL
        ArrayList lists = new ArrayList();
        try {
            PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql); // thuc thi cau lenh truy van duoc tham so hoa;
            ResultSet rs = ps.executeQuery(); //Luu tru cac tap hop sau khi dc truy van tim kiem;
            //DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            while (rs.next()) {
                //Rectangle k = new Rectangle();
//                k.setWidlth(rs.getDouble("width"));
//                k.setLength(rs.getDouble("length"));
//                k.setColor(rs.getString("color"));
//                k.setFilled(rs.getBoolean("filled"));
                  Rectangle k = new Rectangle(rs.getDouble("width"),rs.getDouble("length"),rs.getString("color"),rs.getBoolean("filled"));
                lists.add(k);
            }
            // model.setDataVector(dataVector, columnIdentifiers);

        } catch (Exception e) {
        }
        return lists;
    }

    public boolean InsertRE(double widlth, double length, String color, boolean filled) {
        Connection cn = getCon(); // bien ket noi
        String sql = "INSERT INTO `tbrectangle`(`width`, `length`, `color`, `filled`) VALUES (?,?,?,?)"; //bien SQL
        try {
            PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql); // thuc thi cau lenh truy van duoc tham so hoa;
            //DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            ps.setDouble(1, widlth);
            ps.setDouble(2, length);
            ps.setString(3, color);
            ps.setBoolean(4, filled);
            //ps.setDouble(5, TongD);
            ps.executeUpdate(); // truy van cau lenh
            cn.close();
            return true;

            // model.setDataVector(dataVector, columnIdentifiers);
        } catch (Exception e) {
            return false;
        }
    }
}
