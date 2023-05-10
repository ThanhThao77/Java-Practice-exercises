/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GSach;
import java.sql.*;
import java.util.Vector;

/**
 *
 * @author APC
 */
public interface ISach {
    Connection getCon();
    Vector<Sach> getSA();
    Vector<Sach> getSAbyNXBGB(String NhaXB,int GiaB);
}
