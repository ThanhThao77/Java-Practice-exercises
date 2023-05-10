/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Thanh Thảo
 */
public class XLTT {

    Connection cn = null;

    public Connection getCon() {
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam", "root", "");
            System.out.println("Ket noi thanh cong");
        } catch (Exception e) {
            System.out.println("Loi ket noi: " + e);
        }
        return cn;
    }

    public ArrayList<Rectangle> getTT() {
        Connection cn = getCon();
        String sql = "Select * from tbrectangle"; //bien SQL
        ArrayList<Rectangle> lists = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql); // thuc thi cau lenh truy van duoc tham so hoa;
            ResultSet rs = ps.executeQuery(); //Luu tru cac tap hop sau khi dc truy van tim kiem;
            while (rs.next()) {
                Rectangle k = new Rectangle();
                k.setColor(rs.getString("Color"));
                k.setFilled(rs.getBoolean("Filled"));
                k.setWidth(rs.getDouble("Width"));
                k.setLength(rs.getDouble("Length"));

                lists.add(k);

            }
            // model.setDataVector(dataVector, columnIdentifiers);
            cn.close();
            //   System.err.println(lists);
        } catch (Exception e) {
            System.out.println("Loi khong lay duoc khach hang: " + e);
        }

        return lists;
    }

    public void insertKH(double width, double length, String color, boolean filled) {
        PreparedStatement ps = null;
        cn = getCon();
        try {
            String sql = "INSERT INTO `tbrectangle`(`color`, `filled`, `width`, `length`) VALUES (?,?,?,?)"; //bien SQL
            ps = cn.prepareStatement(sql);
            ps.setString(1, color);
            ps.setBoolean(2,filled);
            ps.setDouble(3,width);
            ps.setDouble(4,length);

            ps.executeUpdate();
            cn.close();

            System.out.println("Them thanh Cong");
        } catch (Exception e) {
            System.out.println("Loi khong them duoc " + e);
        }
    }

}
