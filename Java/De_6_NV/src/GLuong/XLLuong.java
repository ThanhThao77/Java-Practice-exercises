package GLuong;

import java.sql.*;

public class XLLuong {
    public Connection getCon() throws SQLException {
//        return DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=test_SQL;user=sa;password=1234");
        String url = "jdbc:mysql://localhost:3306/DLLuong";
        String user = "root";
        String pass = "0353712221";
        Connection connection = DriverManager.getConnection(url, user, pass);
        return connection;
    }

    public String[] getNVbyMa(String MaNV) throws SQLException {
        ResultSet resultSet = null;

        Connection connection = getCon();
        Statement statement = connection.createStatement();
        String sql = "select * from tbnhanvien where MaNV = " + MaNV;

        resultSet = statement.executeQuery(sql);
        String[] a = new String[4];
        while (resultSet.next()) {
            a[0] = resultSet.getString(1);
            a[1] = resultSet.getString(2);
            a[2] = resultSet.getString(3);
            a[3] = resultSet.getString(4);
        }
        return a;
    }

    public void updateNV(String Manv, String hoten, String diachi, double luong) throws SQLException {
        Connection cn = getCon();
        String query = "update tbNhanVien set hoten = ?,Diachi = ?,Luong = ? where MaNv = ?";
        PreparedStatement preparedStmt = cn.prepareStatement(query);
        preparedStmt.setString(1, hoten);
        preparedStmt.setString(2, diachi);
        preparedStmt.setDouble(3, luong);
        preparedStmt.setString(4, Manv);
        // execute the java preparedstatement
        preparedStmt.executeUpdate();
    }
}

