/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GSach_TH;

import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Thanh Thảo
 */
public interface ISach {
    public static Connection getCon(){return null;};
    public ArrayList<Sach> getSA();
    public ArrayList<Sach> getSAbyNXBGB(String NXB,double GB);
}
