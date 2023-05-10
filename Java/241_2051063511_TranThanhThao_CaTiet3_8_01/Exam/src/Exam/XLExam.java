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
public class XLExam {
    Connection cn = null;

    public Connection getCon() {
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/examtest", "root", "");
            System.out.println("Ket noi thanh cong");
        } catch (Exception e) {
            System.out.println("Loi ket noi: " + e);
        }
        return cn;
    }
    
    public ArrayList<Cylinder> getTT() {
        Connection cn = getCon();
        String sql = "Select * from tbcylinder"; //bien SQL
        ArrayList<Cylinder> lists = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql); // thuc thi cau lenh truy van duoc tham so hoa;
            ResultSet rs = ps.executeQuery(); //Luu tru cac tap hop sau khi dc truy van tim kiem;
            while (rs.next()) {
                Cylinder k = new Cylinder();
                k.setHeight(rs.getDouble("Height"));
                k.setRadius(rs.getDouble("Radius"));
                k.setColor(rs.getString("Color"));
                lists.add(k);

            }
            // model.setDataVector(dataVector, columnIdentifiers);
            cn.close();
            //   System.err.println(lists);
        } catch (Exception e) {
            System.out.println("Loi khong lay duoc thong tin: " + e);
        }

        return lists;
    }
    
    
    
}
