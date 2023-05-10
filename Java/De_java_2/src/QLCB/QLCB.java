package QLCB;

import java.sql.*;
import java.util.Vector;

public class QLCB implements ICanbo{
    @Override
    public Connection getCon() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/QLCB2";
        String user = "root";
        String pass = "0353712221";
        Connection connection = DriverManager.getConnection(url, user, pass);
        return connection;
    }

    public Vector<Canbo> getCB() throws SQLException {
        ResultSet resultSet = null;

        Connection connection = getCon();
        Statement statement = connection.createStatement();
        String sql = "select * from tbCanBo";

        resultSet = statement.executeQuery(sql);
        Vector<Canbo> a = new Vector<>();

        while (resultSet.next()) {
            a.add(new Canbo(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),resultSet.getString(4), resultSet.getDouble(5)));
        }

        return a;
    }

    @Override
    public void insertCB(Vector valuse) throws SQLException {
        Connection connection = getCon();
        String sql = "insert into tbCanBo values(?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, (String) valuse.elementAt(0));
        preparedStatement.setString(2, (String) valuse.elementAt(1));
        preparedStatement.setString(3, (String) valuse.elementAt(2));
        preparedStatement.setString(4, (String) valuse.elementAt(3));
        preparedStatement.setDouble(5, (double) valuse.elementAt(4));

        preparedStatement.execute();
    }

}
