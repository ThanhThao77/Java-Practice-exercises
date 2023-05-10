/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GSach_TH;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thanh Thảo
 */
public class GUI_findSA_TH extends javax.swing.JFrame {

    /**
     * Creates new form GUI_findSA
     */
    public GUI_findSA_TH() {
        initComponents();
        col.add("Mã Sách");
        col.add("Tên Sách");
        col.add("Nhà Xuất Bản");
        col.add("Năm Xuất Bản");
        col.add("Giá Bán");
        col.add("Khuến Mãi");
        getLoadData();
    }

    DefaultTableModel model = new DefaultTableModel();
    Vector col = new Vector();
    Vector row = new Vector();
    XLSach_TH xl = new XLSach_TH();
    
    public void getLoadData() {
        ArrayList<Sach> sach = xl.getSA();
        for (int i = 0; i < sach.size(); i++) {
            Sach sa = (Sach) sach.get(i);
            Vector tbVector = new Vector();
            tbVector.add(sa.getMaS());
            tbVector.add(sa.getTenS());
            tbVector.add(sa.getNhaXB());
            tbVector.add(sa.getNamXB());
            tbVector.add(sa.getGiaB());
            tbVector.add(sa.Khuyenmai());
            row.add(tbVector);

        }
        model.setDataVector(row, col);
        jTable1.setModel(model);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbNhaXB = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        txtGiaB = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbNhaXB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kim Đồng", "Giáo dục", "Thanh niên", "Tuổi trẻ", " " }));
        cbNhaXB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNhaXBActionPerformed(evt);
            }
        });

        jButton1.setText("Tìm kiếm");

        txtGiaB.setName(""); // NOI18N
        txtGiaB.setOpaque(true);

        jLabel1.setText("Nhà Xuất Bản");

        jLabel2.setText("Giá bán");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tên sách", "Nhà xuất bản", "Năm xuất bản", "Giá bán", "Khuyến mại"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbNhaXB, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGiaB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(129, 129, 129)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbNhaXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtGiaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void cbNhaXBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNhaXBActionPerformed
        // TODO add your handling code here:
//        model.getDataVector().removeAllElements();
//        model.fireTableDataChanged();
//        xl.getSAbyNXBGB(jComboBox1.getSelectedItem().toString(), Double.parseDouble(txtGiaB.getText()));
//        System.out.println(jComboBox1.getSelectedItem().toString()+" "+Double.parseDouble(txtGiaB.getText()) );
//        getLoadData();
          searchTable();
    }//GEN-LAST:event_cbNhaXBActionPerformed

    public void searchTable(){
        String NhaXB=cbNhaXB.getSelectedItem().toString();
        int GiaB=Integer.parseInt(txtGiaB.getText());
        
        Vector col = new Vector();
        Vector row = new Vector();
        
        col.add("Mã Sách");
        col.add("Tên Sách");
        col.add("Nhà Xuất Bản");
        col.add("Năm Xuất Bản");
        col.add("Giá Bán");
        col.add("Khuến Mãi");
        
        ArrayList<Sach> sach = xl.getSAbyNXBGB(NhaXB, GiaB);
        for (int i = 0; i < sach.size(); i++) {
            Sach sa = (Sach) sach.get(i);
            Vector tbVector = new Vector();
            tbVector.add(sa.getMaS());
            tbVector.add(sa.getTenS());
            tbVector.add(sa.getNhaXB());
            tbVector.add(sa.getNamXB());
            tbVector.add(sa.getGiaB());
            tbVector.add(sa.Khuyenmai());
            row.add(tbVector);

        }
        jTable1.setModel(new DefaultTableModel(row,col));
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
            java.util.logging.Logger.getLogger(GUI_findSA_TH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_findSA_TH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_findSA_TH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_findSA_TH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_findSA_TH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbNhaXB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtGiaB;
    // End of variables declaration//GEN-END:variables

    private void getSAbyNXBGB(String toString, double parseDouble) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}