package GLuong;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class XLLuong {
    public Connection getCon() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/QLCB2";
        String user = "root";
        String pass = "0353712221";
        Connection connection = DriverManager.getConnection(url, user, pass);
        return connection;
    }

    public void updateVN(String Manv, String hoten, String diachi, double luong) throws SQLException {
        Connection connection = getCon();
        Statement statement = connection.createStatement();
//        String sql = "update tbNhanVien set hoten =" + +hoten+ ",Diachi ="+diachi+",Luong = "+luong+" where MaNv ="+Manv+ ""
    }
}
