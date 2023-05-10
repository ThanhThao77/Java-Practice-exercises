package QLCB;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Vector;

public class GuiInsertCB extends JFrame {
    private JTextField text_Sotk;
    private JTextField text_hoten;
    private JTextField text_GT;
    private JTextField text_diachi;
    private JTextField text_luong;
    private JButton insert;
    private JButton Xuat;
    private JLabel Label_SoTK;
    private JLabel Label_Hoten;
    private JLabel Label_GT;
    private JLabel Label_Diachi;
    private JLabel Label_Luong;
    private JPanel Giu_de2;
    private JTable table1;

    public GuiInsertCB() {
        setContentPane(Giu_de2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String get_Sotk = text_Sotk.getText();
                String get_Hoten = text_hoten.getText();
                String get_GT = text_GT.getText();
                String get_Dichi = text_diachi.getText();
                double get_Luong = Double.parseDouble(text_luong.getText());

                Vector a = new Vector();
                a.add(get_Sotk);
                a.add(get_Hoten);
                a.add(get_GT);
                a.add(get_Dichi);
                a.add(get_Luong);

                QLCB qlcb = new QLCB();
                try {
                    qlcb.insertCB(a);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }
        });


        DefaultTableModel defaultTableModel = (DefaultTableModel) table1.getModel();

        defaultTableModel.addColumn("Số TK");
        defaultTableModel.addColumn("Họ tên");
        defaultTableModel.addColumn("Giới tính");
        defaultTableModel.addColumn("Địa chỉ");
        defaultTableModel.addColumn("Lương");

        Xuat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rowCount = defaultTableModel.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--) {
                    defaultTableModel.removeRow(i);
                }
//
                QLCB qlcb = new QLCB();
                try {
                    for (int i = 0; i < qlcb.getCB().size(); i++) {

                        Object[] Row = new Object[]{qlcb.getCB().get(i).getSoTK(), qlcb.getCB().get(i).getHoten(), qlcb.getCB().get(i).getGT(), qlcb.getCB().get(i).getDiachi(), qlcb.getCB().get(i).getLuong()};
                        defaultTableModel.addRow(Row);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }
        });
    }

    public static void main(String[] args) {
        GuiInsertCB guiInsertCB = new GuiInsertCB();
    }
}
