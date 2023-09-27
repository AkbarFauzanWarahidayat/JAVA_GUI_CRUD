/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GuiBeliRumah;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class PenjualanRumah extends javax.swing.JInternalFrame {

    /**
     * Creates new form PenjualanRumah
     */
    public PenjualanRumah() {
        initComponents();
    }
    
    private static java.sql.Date getCurrentDate(){
        java.util.Date today = new java.util.Date();
        return new java.sql.Date(today.getTime());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNamaPemesan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldHargaTanahperMeter = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxArea = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldHargaBangunan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jRadioButtonTipe36 = new javax.swing.JRadioButton();
        jRadioButtonTipe45 = new javax.swing.JRadioButton();
        jRadioButtonTipe54 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldLuasTanahAsli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldLuasTanahTersedia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldHarga = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldDp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldLamaCicilan = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldPpn = new javax.swing.JTextField();
        jTextFieldCicilanperBulan = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jCheckBoxSetuju = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldArea = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldTipeRumah = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Nama Pemesan");

        jLabel2.setText("Harga Tanah/m2");

        jTextFieldHargaTanahperMeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHargaTanahperMeterActionPerformed(evt);
            }
        });

        jLabel3.setText("Area");

        jComboBoxArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "===PILIH AREA===", "Bougenville", "Melati", "Flamboyan" }));
        jComboBoxArea.setToolTipText("");

        jLabel4.setText("Harga Bangunan");

        jLabel5.setText("Tipe Rumah");

        buttonGroup1.add(jRadioButtonTipe36);
        jRadioButtonTipe36.setText("Tipe-36");
        jRadioButtonTipe36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTipe36ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonTipe45);
        jRadioButtonTipe45.setText("Tipe-45");

        buttonGroup1.add(jRadioButtonTipe54);
        jRadioButtonTipe54.setText("Tipe-54");
        jRadioButtonTipe54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTipe54ActionPerformed(evt);
            }
        });

        jLabel6.setText("Luas Tanah Asli");

        jLabel7.setText("Luas Tanah Tersedia");

        jLabel8.setText("Harga");

        jLabel9.setText("DP");

        jLabel10.setText("Lama Cicilan");

        jTextFieldLamaCicilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLamaCicilanActionPerformed(evt);
            }
        });

        jLabel11.setText("PPN (10%)");

        jLabel12.setText("Cicilan/bln");

        jTextFieldPpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPpnActionPerformed(evt);
            }
        });

        jLabel13.setText("Bulan");

        jCheckBoxSetuju.setText("Setuju");

        jButton1.setText("PROSES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("SIMPAN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("CLEAR");

        jLabel14.setText("Area ");

        jLabel15.setText("Tipe Rumah");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(jComboBoxArea, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldNamaPemesan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldHargaTanahperMeter))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jTextFieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldTipeRumah))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldHargaBangunan, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldLuasTanahAsli)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextFieldLuasTanahTersedia))
                                .addGap(27, 27, 27))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButtonTipe36)
                            .addComponent(jRadioButtonTipe45)
                            .addComponent(jRadioButtonTipe54)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCicilanperBulan))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(jTextFieldDp)
                                    .addComponent(jTextFieldLamaCicilan)
                                    .addComponent(jTextFieldPpn))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jCheckBoxSetuju)))
                        .addGap(42, 42, 42))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNamaPemesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldHargaBangunan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldHargaTanahperMeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBoxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jRadioButtonTipe36))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jTextFieldLuasTanahAsli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonTipe45)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonTipe54)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLuasTanahTersedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldTipeRumah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldDp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldLamaCicilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldPpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldCicilanperBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxSetuju))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonTipe54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTipe54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonTipe54ActionPerformed

    private void jTextFieldHargaTanahperMeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHargaTanahperMeterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHargaTanahperMeterActionPerformed

    private void jTextFieldLamaCicilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLamaCicilanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLamaCicilanActionPerformed

    private void jTextFieldPpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPpnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPpnActionPerformed

    private void jRadioButtonTipe36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTipe36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonTipe36ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
//        AREA NICH
        if(jComboBoxArea.getSelectedIndex() == 1){
            jTextFieldArea.setText("Bougenville");
            jTextFieldHargaTanahperMeter.setText("500000");
            jTextFieldHargaBangunan.setText("90000000");
        }
        else if(jComboBoxArea.getSelectedIndex() == 2){
            jTextFieldArea.setText("Melati");
            jTextFieldHargaTanahperMeter.setText("600000");
            jTextFieldHargaBangunan.setText("120000000");
        }
        else if(jComboBoxArea.getSelectedIndex() == 3){
            jTextFieldArea.setText("Flamboyan");
            jTextFieldHargaTanahperMeter.setText("700000");
            jTextFieldHargaBangunan.setText("150000000");
        }
//        AREA END
        
//       TIPE RUMAH
        if(jRadioButtonTipe36.isSelected()){
            jTextFieldLuasTanahAsli.setText("90");
            jTextFieldTipeRumah.setText("36");
        }
        else if(jRadioButtonTipe45.isSelected()){
            jTextFieldLuasTanahAsli.setText("120");
            jTextFieldTipeRumah.setText("45");
        }
        else if(jRadioButtonTipe54.isSelected()){
            jTextFieldLuasTanahAsli.setText("140");
            jTextFieldTipeRumah.setText("54");
        }
//      TIPE RUMAH END



        jTextFieldNamaPemesan.getText();
        
        int rumusharga,rumusppn,rumuscicilanperbln;
        
        rumusharga = Integer.parseInt(jTextFieldLuasTanahTersedia.getText()) * Integer.parseInt(jTextFieldHargaTanahperMeter.getText()) + Integer.parseInt(jTextFieldHargaBangunan.getText());
        jTextFieldHarga.setText(rumusharga+"");
        
        rumusppn = (int) (0.1 * rumusharga);
        jTextFieldPpn.setText(rumusppn+"");
        
        rumuscicilanperbln = (rumusharga+rumusppn-Integer.parseInt(jTextFieldDp.getText())) / Integer.parseInt(jTextFieldLamaCicilan.getText());
        jTextFieldCicilanperBulan.setText(rumuscicilanperbln+"");
        
        JOptionPane.showMessageDialog(rootPane, "PELANGGAN KONFIRM/SETUJU");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // INSERT
        
        int luastanahasli = Integer.parseInt(jTextFieldLuasTanahAsli.getText());
        int harga = Integer.parseInt(jTextFieldHarga.getText());
        int lamacicilan = Integer.parseInt(jTextFieldLamaCicilan.getText());
        int cicilanperbulan = Integer.parseInt(jTextFieldCicilanperBulan.getText());
                
        String url = "jdbc:mysql://localhost:3306/netbeanscoba";
        String user ="root";
        String password="";
        
        Connection koneksi;
        PreparedStatement pst;
        
        try {
            koneksi = DriverManager.getConnection(url,user,password);
            pst = koneksi.prepareStatement("INSERT INTO penjualan_rumah (Nama_Pemesan,Area,Tipe_Rumah,Luas_Tanah,Harga,Lama_Cicilan,Cicilan_Per_Bulan,Waktu_Pembelian) VALUES (?,?,?,?,?,?,?,?)");
            pst.setString(1,jTextFieldNamaPemesan.getText());
            pst.setString(2, jTextFieldArea.getText());
            pst.setString(3,jTextFieldTipeRumah.getText());
            pst.setInt(4, luastanahasli);
            pst.setInt(5,harga);
            pst.setInt(6, lamacicilan);
            pst.setInt(7, cicilanperbulan);
            pst.setDate(8, getCurrentDate());
            pst.execute();
            
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Disimpan");
            
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
               
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBoxSetuju;
    private javax.swing.JComboBox<String> jComboBoxArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButtonTipe36;
    private javax.swing.JRadioButton jRadioButtonTipe45;
    private javax.swing.JRadioButton jRadioButtonTipe54;
    private javax.swing.JTextField jTextFieldArea;
    private javax.swing.JTextField jTextFieldCicilanperBulan;
    private javax.swing.JTextField jTextFieldDp;
    private javax.swing.JTextField jTextFieldHarga;
    private javax.swing.JTextField jTextFieldHargaBangunan;
    private javax.swing.JTextField jTextFieldHargaTanahperMeter;
    private javax.swing.JTextField jTextFieldLamaCicilan;
    private javax.swing.JTextField jTextFieldLuasTanahAsli;
    private javax.swing.JTextField jTextFieldLuasTanahTersedia;
    private javax.swing.JTextField jTextFieldNamaPemesan;
    private javax.swing.JTextField jTextFieldPpn;
    private javax.swing.JTextField jTextFieldTipeRumah;
    // End of variables declaration//GEN-END:variables
}