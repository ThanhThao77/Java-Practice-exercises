/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GKH;

import java.util.Vector;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Thanh Thảo
 */
public class GUI_KH extends javax.swing.JFrame {

    /**
     * Creates new form GUI_KH
     */
    DefaultTableModel model = new DefaultTableModel();
    Vector header = new Vector();
    Vector datas = new Vector();
    
    public GUI_KH() {
        initComponents();
        getLoadData();
    }

    public void getLoadData(){
        header.add("Số TK");
        header.add("Họ tên");
        header.add("Giới tính");
        header.add("Địa chỉ");
        header.add("Số dư");
        
        XLKH xl = new XLKH();
        ArrayList<Khachhang> kh = xl.getKH();
        for (int i = 0; i < kh.size(); i++) {
            Khachhang cb = (Khachhang) kh.get(i);
            Vector tbVector = new Vector();
            tbVector.add(cb.getSoTK());
            tbVector.add(cb.getHoten());
            tbVector.add(cb.getGT());
            tbVector.add(cb.getDiachi());
            tbVector.add(cb.getSodu());
            datas.add(tbVector);
        }
        tbKH.setModel(new DefaultTableModel(datas, header));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbKH = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSoTK = new javax.swing.JTextField();
        txtHoten = new javax.swing.JTextField();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        cbDiachi = new javax.swing.JComboBox<>();
        txtSodu = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbKH);

        jLabel1.setText("Số tài khoản");

        jLabel2.setText("Họ tên");

        jLabel3.setText("Giới tính");

        jLabel4.setText("Địa chỉ");

        jLabel5.setText("Số dư");

        buttonGroup2.add(rdNam);
        rdNam.setText("Nam");

        buttonGroup2.add(rdNu);
        rdNu.setText("Nữ");

        cbDiachi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hà Nội", "Hải Phòng", "Hồ Chí Minh", " " }));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSoTK))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(rdNam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdNu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(cbDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(txtSodu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnThem)
                                .addComponent(btnSua)
                                .addComponent(btnXoa))
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txtSoTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdNam)
                    .addComponent(rdNu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSodu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiem)
                        .addGap(103, 103, 103))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//THÊM
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        Khachhang kh = new Khachhang();
        
        kh.setSoTK(txtSoTK.getText());
        kh.setHoten(txtHoten.getText());
        kh.setSodu(Double.parseDouble(txtSodu.getText()));
        
        String GT;
        if(rdNam.isSelected() == true) GT = "Nam";
        else GT = "Nữ";
        kh.setGT(GT);
        
        String Diachi = cbDiachi.getSelectedItem().toString(); //tra ve vtri dc chon
        kh.setDiachi(Diachi);
        
        XLKH xl = new XLKH();
        xl.insertKH(txtSoTK.getText(), txtHoten.getText(), rdNam.getText(), cbDiachi.getSelectedItem().toString(), Double.parseDouble(txtSodu.getText()));
        xl.insertKH(txtSoTK.getText(), txtHoten.getText(), rdNu.getText(), cbDiachi.getSelectedItem().toString(), Double.parseDouble(txtSodu.getText()));

        
    }//GEN-LAST:event_btnThemActionPerformed

    void click(int selectedRow){
        Vector vtSelected = (Vector)datas.get(selectedRow);
        String SoTK = vtSelected.get(0).toString();
        String Hoten = vtSelected.get(1).toString();
        String GT = vtSelected.get(2).toString();
        String Diachi = vtSelected.get(3).toString();
        String Sodu = vtSelected.get(4).toString();
        
        txtSoTK.setText(SoTK);
        txtHoten.setText(Hoten);
        if(GT.equals("Nam")) rdNam.setSelected(true);
        else rdNu.setSelected(true);
        cbDiachi.setSelectedItem(Diachi);
        txtSodu.setText(Sodu);
    }
    private void tbKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKHMouseClicked
        // TODO add your handling code here:
        int selectedRow = tbKH.getSelectedRow();
        click(selectedRow);
    }//GEN-LAST:event_tbKHMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        Khachhang kh = new Khachhang();
        
        kh.setSoTK(txtSoTK.getText());
        kh.setHoten(txtHoten.getText());
        kh.setSodu(Double.parseDouble(txtSodu.getText()));
        
        String GT;
        if(rdNam.isSelected() == true) GT = "Nam";
        else GT = "Nữ";
        kh.setGT(GT);
        
        String Diachi = cbDiachi.getSelectedItem().toString(); //tra ve vtri dc chon
        kh.setDiachi(Diachi);
        
        XLKH xl = new XLKH();
        xl.updateKH(txtSoTK.getText(), txtHoten.getText(), rdNam.getText(), cbDiachi.getSelectedItem().toString(), Double.parseDouble(txtSodu.getText()));
        xl.updateKH(txtSoTK.getText(), txtHoten.getText(), rdNu.getText(), cbDiachi.getSelectedItem().toString(), Double.parseDouble(txtSodu.getText()));

        
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        String GT;
        if(rdNam.isSelected() == true) GT = "Nam";
        else GT = "Nữ";
        String Diachi = cbDiachi.getSelectedItem().toString();
        
        XLKH xl = new XLKH();
        xl.delKH(Diachi, GT);
//        xl.delKH(rdNu.getText(), cbDiachi.getSelectedItem().toString());

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
      //model.getDataVector().removeAllElements();
       // model.fireTableDataChanged();
       model.setRowCount(0);
        getKHbySTKSodu(cbDiachi.getSelectedItem().toString(), Double.parseDouble(txtSodu.getText()));
        System.err.println(cbDiachi.getSelectedItem().toString()+" "+Double.parseDouble(txtSodu.getText()) );
    }//GEN-LAST:event_btnTimKiemActionPerformed

//    public void searchTable(){
//        String Diachi = cbDiachi.getSelectedItem().toString();
//        double Sodu = Double.parseDouble(txtSodu.getText());
//        
//        Vector header = new Vector();
//        Vector datas = new Vector();
//        
//        header.add("Số TK");
//        header.add("Họ tên");
//        header.add("Giới tính");
//        header.add("Địa chỉ");
//        header.add("Số dư");
//        
//        XLKH xl = new XLKH();
//        ArrayList<Khachhang> kh = xl.getKHbySTKSodu(Diachi, Sodu);
//        for (int i = 0; i < kh.size(); i++) {
//            Khachhang cb = (Khachhang) kh.get(i);
//            Vector tbVector = new Vector();
//            tbVector.add(cb.getSoTK());
//            tbVector.add(cb.getHoten());
//            tbVector.add(cb.getGT());
//            tbVector.add(cb.getDiachi());
//            tbVector.add(cb.getSodu());
//            datas.add(tbVector);
//        }
//        tbKH.setModel(new DefaultTableModel(datas, header));
//    }
    
    public void getKHbySTKSodu(String Diachi, double Sodu){
        XLKH xl = new XLKH();
        ArrayList<Khachhang> kh = xl.getKHbySTKSodu(Diachi, Sodu);
        for (int i = 0; i < kh.size(); i++) {
            Khachhang cb = (Khachhang) kh.get(i);
            Vector tbVector = new Vector();
            tbVector.add(cb.getSoTK());
            tbVector.add(cb.getHoten());
            tbVector.add(cb.getGT());
            tbVector.add(cb.getDiachi());
            tbVector.add(cb.getSodu());
            datas.add(tbVector);
        }
//        tbKH.setModel(new DefaultTableModel(datas, header));
        model.setDataVector(datas, header);
        tbKH.setModel(model);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_KH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_KH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_KH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_KH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_KH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbDiachi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tbKH;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtSoTK;
    private javax.swing.JTextField txtSodu;
    // End of variables declaration//GEN-END:variables
}