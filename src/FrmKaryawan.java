/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
public class FrmKaryawan extends javax.swing.JFrame {
public boolean databaru;
    /**
     * Creates new form FrmKaryawan
     */
    public FrmKaryawan() {
        initComponents();
       GetData(); // tampilkan ke grid
       KdKaryawanAuto();
    databaru=true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNama = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdBidang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtJabatan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnSimpan = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        TxtCari = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 146, -1));

        jLabel8.setText("Password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 114, -1, -1));

        jLabel3.setText("ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 57, -1, -1));

        txtIdBidang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBidangActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdBidang, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 111, 146, -1));

        jLabel4.setText("ID Bidang");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 114, -1, -1));

        jLabel5.setText("Jabatan");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 57, -1, -1));

        txtUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 80, 146, -1));

        jLabel6.setText("Username");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 83, -1, -1));
        jPanel1.add(txtJabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 54, 146, -1));

        jLabel9.setText("Nama");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 83, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Karyawan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 11, -1, -1));

        txtID.setEditable(false);
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 54, 89, -1));

        jLabel2.setText("Cari");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 147, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "ID Bidang", "Bidang", "Jabatan"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 172, 483, 92));

        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        jButton4.setText("Batal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 270, -1, -1));

        jButton5.setText("Hapus");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 270, -1, -1));

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        jPanel1.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 143, -1, -1));

        TxtCari.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TxtCariInputMethodTextChanged(evt);
            }
        });
        TxtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCariActionPerformed(evt);
            }
        });
        jPanel1.add(TxtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 144, 146, -1));

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 111, 146, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdBidangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBidangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdBidangActionPerformed

    private void txtUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnameActionPerformed
private void KdKaryawanAuto()
    {
       try {
            java.sql.Connection conn =(java.sql.Connection)delta.KoneksiDatabase.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from t_karyawan order by id_karyawan desc");
            if (sql.next()) {
                String IdBidang = sql.getString("id_karyawan").substring(2);
                String AN = "" + (Integer.parseInt(IdBidang) + 1);
                String Nol = "";

                if(AN.length()==1)
                {Nol = "000";}
                else if(AN.length()==2)
                {Nol = "00";}
                else if(AN.length()==3)
                {Nol = "0";}
                else if(AN.length()==4)
                {Nol = "";}

               txtID.setText("KR" + Nol + AN);
            } else {
               txtID.setText("KR0001");
            }

           }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           }
     }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        databaru = false; // menampilkan data ke textboxt
        try {
            int row =jTable1.getSelectedRow();
            String tabel_klik=(jTable1.getModel().getValueAt(row, 0).toString());
            java.sql.Connection conn =(java.sql.Connection)delta.KoneksiDatabase.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from t_karyawan where id_karyawan='"+tabel_klik+"'");
            if(sql.next()){
                String id = sql.getString("id_karyawan");
                txtID.setText(id);
                String nama = sql.getString("nm_karyawan");
                txtNama.setText(nama);
                String idbidang = sql.getString("id_bidang");
                txtIdBidang.setText(idbidang);
                String jabatan = sql.getString("jabatan");
                txtJabatan.setText(jabatan);
                String uname = sql.getString("username");
                txtUname.setText(uname);
                String pass = sql.getString("password");
                txtPass.setText(pass);
            }
        } catch (Exception e) {}
    }//GEN-LAST:event_jTable1MouseClicked

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:

        if (databaru == true) { // prosess simpan atau edit
            try {
                String hak ="-";
                String stats ="-";
                String sql = "insert into t_karyawan values('"+txtID.getText()+"','"+txtNama.getText()+"','"+txtIdBidang.getText()+"','"+txtJabatan.getText()+"','"+txtUname.getText()+"','"+txtPass.getText()+"','"+hak+"','"+stats+"')";
                java.sql.Connection conn = (java.sql.Connection)delta.KoneksiDatabase.getKoneksi();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "berhasil disimpan");
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            try {
                String hak2 ="-";
                String stats2 ="-";
                String sql = "update t_karyawan SET nm_karyawan='"+txtNama.getText()+"',id_bidang='"+txtIdBidang.getText()+"',jabatan='"+txtJabatan.getText()+"',Username='"+txtUname.getText()+"',Password='"+txtPass.getText()+"',hak_akses='"+hak2+"',status='"+stats2+"' where id_karyawan='"+txtID.getText()+"'";
                java.sql.Connection conn = (java.sql.Connection)delta.KoneksiDatabase.getKoneksi();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "berhasil dirubah");
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        GetData();
        KdKaryawanAuto();
    }//GEN-LAST:event_BtnSimpanActionPerformed
private void GetData(){ // menampilkan data dari database
    try {
        Connection conn =(Connection)delta.KoneksiDatabase.getKoneksi();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet sql = stm.executeQuery("select * from t_karyawan");
        jTable1.setModel(DbUtils.resultSetToTableModel(sql));
    }
    catch (SQLException | HeadlessException e) {
    }
}
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try { // hapus data
            String sql ="delete from t_karyawan where id_karyawan='"+txtID.getText()+"'";
            java.sql.Connection conn = (java.sql.Connection)delta.KoneksiDatabase.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data akan dihapus?");
            databaru=true;
            txtID.setText("");
            txtNama.setText("");
            txtIdBidang.setText("");
            txtJabatan.setText("");
            txtUname.setText("");
            txtPass.setText("");
        } catch (SQLException | HeadlessException e) {}

        GetData();
        KdKaryawanAuto();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        databaru=true;
        // mengosongkan textbox
        txtID.setText("");
        txtJabatan.setText("");
        txtNama.setText("");
        txtIdBidang.setText("");
        txtUname.setText("");
        txtPass.setText("");
        KdKaryawanAuto();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void TxtCariInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TxtCariInputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TxtCariInputMethodTextChanged

    private void TxtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCariActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TxtCariActionPerformed

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
            java.util.logging.Logger.getLogger(FrmKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JTextField TxtCari;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIdBidang;
    private javax.swing.JTextField txtJabatan;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables
}