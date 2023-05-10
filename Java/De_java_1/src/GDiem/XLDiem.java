package GDiem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;
import java.util.Scanner;

public class XLDiem {
    public Connection getCon() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/DLDiem";
        String user = "root";
        String pass = "0353712221";
        Connection connection = DriverManager.getConnection(url, user, pass);
        return connection;
    }

    public Vector<HocVien> getHV() throws SQLException {
        ResultSet resultSet = null;

        Connection connection = getCon();
        Statement statement = connection.createStatement();
        String sql = "select * from tbHocvien";

        resultSet = statement.executeQuery(sql);
        Vector<HocVien> a = new Vector<>();

        while (resultSet.next()) {
            a.add(new HocVien(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDouble(4)));
        }

        return a;
    }

    public void insertHV(Vector valuse) throws Exception {
        Connection connection = getCon();
        String sql = "insert into tbhocvien values(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, (String) valuse.elementAt(0));
        preparedStatement.setString(2, (String) valuse.elementAt(1));
        preparedStatement.setString(3, (String) valuse.elementAt(2));
        preparedStatement.setDouble(4, (double) valuse.elementAt(3));
        // execute the preparedstatement
        preparedStatement.execute();
    }


}
