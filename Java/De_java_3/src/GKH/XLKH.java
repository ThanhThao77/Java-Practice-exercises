package GKH;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class XLKH implements IKhachang {
    @Override
    public Connection getCon() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/DLKH2";
        String user = "root";
        String pass = "0353712221";
        Connection connection = DriverManager.getConnection(url, user, pass);
        return connection;
    }

    @Override
    public void delKH(String diachi, String GT) throws SQLException {
        Connection connection = getCon();
        Statement statement = connection.createStatement();
        String sql = "delete from tbKhachhang where Diachi = " + "'" + diachi + "'" + "and GT = " + "'" + GT + "'" ;
        System.out.println(sql);
        statement.executeUpdate(sql);
    }

}
