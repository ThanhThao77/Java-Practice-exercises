/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GSach;

import com.sun.jdi.connect.spi.Connection;
import java.util.ArrayList;

/**
 *
 * @author thang
 */
public interface ISach {
    public static Connection getCon(){return null;};
    public ArrayList<Sach> getSA();
    public ArrayList<Sach> getSAbyNXBGB(String NXB,double GB);
    
}
