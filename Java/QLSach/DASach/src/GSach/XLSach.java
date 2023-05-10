package GSach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nqhkt
 */
public class  XLSach {

    /**
     *
     * @param dbURL
     * @param userName
     * @param password
     * @return
     * @throws ClassNotFoundException
     */
    public static Connection getCon(String dbURL, String userName,String password) throws ClassNotFoundException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (SQLException ex) {
            System.out.println("connect failure!");
        }
        return conn;
    }
     public static ResultSet getSA() throws SQLException, ClassNotFoundException{
          Connection conn = getCon("jdbc:mysql://localhost:3306/dlsach", "root", "");
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery("select * from tbsach");
          return rs;
     }
     public static void deleteSA(String namxb) throws SQLException, ClassNotFoundException{
          
          Connection conn = getCon("jdbc:mysql://localhost:3306/dlsach", "root", "");
          Statement stmt = conn.createStatement();
          String sql="delete from tbsach where NamXB = "+ namxb;
          stmt.executeUpdate(sql); 
     }
      public static void insertSA(String tens,String namxb,String giab) throws SQLException, ClassNotFoundException{
          
          Connection conn = getCon("jdbc:mysql://localhost:3306/dlsach", "root", "");
          Statement stmt = conn.createStatement();
          var sql="insert into tbsach(TenS,NamXB,GiaB) values ('"+tens+"','"+namxb+"','"+giab+"')";
          stmt.executeUpdate(sql); 
     }
    public static void UpDateSA(String mas, String tens,String namxb,String giab) throws SQLException, ClassNotFoundException{
          
          Connection conn = getCon("jdbc:mysql://localhost:3306/dlsach", "root", "");
          Statement stmt = conn.createStatement();
          var sql="update tbsach set TenS = '"+tens+"',NamXB='"+namxb+"',GiaB='"+giab+"'where MaS='"+mas+"'";
          stmt.executeUpdate(sql); 
     }
}
