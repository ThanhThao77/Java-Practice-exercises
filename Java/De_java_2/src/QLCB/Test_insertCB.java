package QLCB;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;


public class Test_insertCB {
    public static void doInsertCB(Vector CB) {
        QLCB qlcb = new QLCB();
        try {
            qlcb.insertCB(CB);
            System.out.println("Insert thành công");
        } catch (SQLException e) {
            System.out.println("Insert không thành công");
        }
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Test_insertCB CB = new Test_insertCB();
        Vector data = new Vector();
        System.out.println("Nhap lan luot SoTK > Hoten > GT > Diachi > Luong");
        data.add(a.nextLine());
        data.add(a.nextLine());
        data.add(a.nextLine());
        data.add(a.nextLine());
        data.add(a.nextDouble());

        CB.doInsertCB(data);

    }
}
