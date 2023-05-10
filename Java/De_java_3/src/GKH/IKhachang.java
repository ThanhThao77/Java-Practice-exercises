package GKH;

import java.sql.Connection;
import java.sql.SQLException;

public interface IKhachang {
    public Connection getCon()  throws SQLException;
    public void delKH (String diachi, String GT) throws SQLException;
}
