package GLuong;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GUI_updateNV extends JFrame{
    private JTextField Luong;
    private JTextField Hoten;
    private JComboBox DiachiCombo;
    private JButton update;
    private JButton search;
    private JLabel ip_MaNV;
    private JLabel ip_Hoten;
    private JLabel ip_Luong;
    private JTextField MaNV;
    private JPanel main_Panel;

    public GUI_updateNV(){
        setContentPane(main_Panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                XLLuong nv = new XLLuong();
                String get_manv = MaNV.getText();

                try {
                    String b [] = nv.getNVbyMa(get_manv);
                    Hoten.setText(b[1]);
                    Luong.setText(b[3]);
                    int item = DiachiCombo.getItemCount();
                    for (int i = 0; i < item; i++){
                        if(DiachiCombo.getItemAt(i).equals(b[2])){
                            DiachiCombo.setSelectedIndex(i);
                            break;
                        }
                    }

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                XLLuong nv = new XLLuong();
                String get_manv = MaNV.getText();
                String get_hoten = Hoten.getText();
                double get_luong = Double.parseDouble(Luong.getText());
                String item = (String) DiachiCombo.getItemAt(DiachiCombo.getSelectedIndex());

                try {
                    nv.updateNV(get_manv,get_hoten,item,get_luong);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    public static void main(String[] args) {
        GUI_updateNV gui_updateNV = new GUI_updateNV();
    }
}
