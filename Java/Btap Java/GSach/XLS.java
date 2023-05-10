/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GSach;

import java.sql.*;
import java.util.Vector;

/**
 *
 * @author APC
 */
public class XLS implements ISach{
    Connection cn=null;
    @Override
    public Connection getCon() {
        try {
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dlsach","root","");
            System.out.println("Ket noi SQL thanh cong");
        } catch (Exception e) {
            System.out.println("Loi ket noi SQL: "+e);
        }
        return cn;
    }

    @Override
    public Vector<Sach> getSA() {
        cn=getCon();
        Vector<Sach> vs=new Vector<>();
        Statement stm=null;
        try {
            String query="select * from tbsach";
            stm=cn.createStatement();
            ResultSet rs=stm.executeQuery(query);
            while(rs.next()){
                Sach s=new Sach();
                s.setMaS(rs.getInt("MaS"));
                s.setTenS(rs.getString("TenS"));
                s.setNhaXB(rs.getString("NhaXB"));
                s.setNamXB(rs.getInt("NamXB"));
                s.setGiaB(rs.getInt("GiaB"));
                vs.add(s);
            }
            System.out.println("Lay du lieu thanh cong");
            cn.close();
        } catch (Exception e) {
            System.out.println("Lay du lieu that bai: "+e);
        }
        return vs;
    }

    @Override
    public Vector<Sach> getSAbyNXBGB(String NhaXB, int GiaB) {
        Vector<Sach> vSach=new Vector();
        cn=getCon();
        Statement smt=null;
        try {
            String query="select * from tbsach where NhaXB='"+NhaXB+"'and GiaB="+GiaB;
            smt=cn.createStatement();
            ResultSet rs=smt.executeQuery(query);
            while(rs.next()){
                Sach s=new Sach();
                s.setMaS(rs.getInt("MaS"));
                s.setTenS(rs.getString("TenS"));
                s.setNhaXB(rs.getString("NhaXB"));
                s.setNamXB(rs.getInt("NamXB"));
                s.setGiaB(rs.getInt("GiaB"));
                vSach.add(s);
            }
            cn.close(); 
        } catch (Exception e) {
            System.out.println("Loi khong tim kiem duoc: "+e);
        }
        
        return vSach;
    }

    
    
}
