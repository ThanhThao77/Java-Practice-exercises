/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

import java.sql.*;
import java.util.Vector;

public class XLDL {
    Connection conn=null;
    
    public Connection getCon(){
        try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","");
        } catch (Exception e) {
            System.out.println("Ket noi SQL that bai: "+e);
        }
        return conn;
    }
    
    public Vector getCylinder(){
        Vector datas=new Vector();
        conn=getCon();
        Statement smt=null;
        try {
            String query="select * from tbcylinder";
            smt=conn.createStatement();
            ResultSet rs=smt.executeQuery(query);
            while(rs.next()){
                Vector v=new Vector();
                int id=rs.getInt("ID");
                Cylinder c=new Cylinder();
                c.setRadius(rs.getDouble("radius"));
                c.setColor(rs.getString("color"));
                c.setHeight(rs.getDouble("height"));
                v.add(id);
                v.add(c);
                datas.add(v);
            }
        } catch (Exception e) {
            System.out.println("Loi khong lay duoc Cylinder: "+e);
        }
        return datas;
    }
    
    public void update(int ID,Cylinder c){
        conn=getCon();
        PreparedStatement psmt=null;
        try {
            String query="update tbcylinder set radius=?, color=?,height=? where id=?";
            psmt=conn.prepareStatement(query);
            psmt.setDouble(1, c.getRadius());
            psmt.setString(2, c.getColor());
            psmt.setDouble(3, c.getHeight());
            psmt.setInt(4, ID);
            
            int row=psmt.executeUpdate();
            if(row!=0) System.out.println("Cap nhat thanh cong");
        } catch (Exception e) {
            System.out.println("Loi cap nhat: "+e);
        }
    }
}
