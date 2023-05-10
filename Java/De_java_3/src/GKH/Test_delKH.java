package GKH;

import java.sql.SQLException;
import java.util.Scanner;

public class Test_delKH {
    public static void doDelKH(String diachi, String GT) throws SQLException {
        XLKH kh = new XLKH();
        try{
            kh.delKH(diachi, GT);
            System.out.println("Xoa thanh cong");
        }catch (SQLException e){
            System.out.println("Xoa không thanh cong");
        }
    }

    public static void main(String[] args) throws SQLException {
        Scanner a = new Scanner(System.in);
        System.out.println("Nhap Dia Chi va Gioi Tinh:");
        doDelKH(a.nextLine(), a.nextLine());
    }
}
