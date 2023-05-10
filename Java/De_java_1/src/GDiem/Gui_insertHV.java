package GDiem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Vector;

public class Gui_insertHV extends JFrame {
    private JTextField ip_MaHV;
    private JTextField ip_Hoten;
    private JTextField ip_Diem;
    private JComboBox CB_Lop;
    private JButton btn_HienThi;
    private JButton insertButton;
    private JLabel tieu_de_MaHV;
    private JLabel tieu_de_Hoten;
    private JLabel tieu_de_Diem;
    private JLabel tieu_de_lop;
    private JPanel Gui_insert;
    private JTable table1;

    public Gui_insertHV() {
        setContentPane(Gui_insert);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        DefaultTableModel defaultTableModel = (DefaultTableModel) table1.getModel();

        defaultTableModel.addColumn("MaHV");
        defaultTableModel.addColumn("Ho ten");
        defaultTableModel.addColumn("Lop");
        defaultTableModel.addColumn("Diem");


//        jTable.setBounds(30, 40, 200, 300);
        // adding it to JScrollPane
//        JScrollPane sp = new JScrollPane(jTable);
//        add(sp);
//        // Frame Size
//        setSize(500, 200);
//        setLocationRelativeTo(null);
//        setVisible(true);

        btn_HienThi.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                int rowCount = defaultTableModel.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--) {
                    defaultTableModel.removeRow(i);
                }
                XLDiem HV1 = new XLDiem();
                try {
                    for (int i = 0; i < HV1.getHV().size(); i++) {
                        Object[]Row = new Object[]{HV1.getHV().get(i).getMaHV(), HV1.getHV().get(i).getHoten(), HV1.getHV().get(i).getLop(), HV1.getHV().get(i).getDiem()};
                        defaultTableModel.addRow(Row);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String get_mahv = ip_MaHV.getText();
                String get_hoten = ip_Hoten.getText();
                String combo_lop = (String) CB_Lop.getItemAt(CB_Lop.getSelectedIndex());
                double get_diem = Double.parseDouble(ip_Diem.getText());

                Vector a = new Vector();
                a.add(get_mahv);
                a.add(get_hoten);
                a.add(combo_lop);
                a.add(get_diem);

                XLDiem diem = new XLDiem();
                try {
                    diem.insertHV(a);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        Gui_insertHV gui_insertHV = new Gui_insertHV();
    }

}
