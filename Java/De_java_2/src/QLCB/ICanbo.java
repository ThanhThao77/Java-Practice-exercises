package QLCB;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

public interface ICanbo {
    public Connection getCon() throws SQLException;
    public void insertCB(Vector valuse) throws SQLException;
}
