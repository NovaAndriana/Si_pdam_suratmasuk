
import java.awt.HeadlessException;
import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ITBPFI
 */
public class FrmSuratKeluar extends javax.swing.JFrame {
private String tgl;
    /**
     * Creates new form FrmSuratKeluar
     */
    public FrmSuratKeluar() {
        initComponents();
        NoSuratKeluarAuto();
        tampil_combo2();
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
        jLabel1 = new javax.swing.JLabel();
        TxtNoSuratKeluar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtPerihal = new javax.swing.JTextField();
        TxtIsiRingkas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtKepada = new javax.swing.JTextField();
        TxtNamaKaryawan = new javax.swing.JTextField();
        TxtLampiran = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BtnSimpan = new javax.swing.JButton();
        BtnFileSurat = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        TxtTanggalKeluar = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        TxtFile = new javax.swing.JTextField();
        TxtIdKaryawan = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Surat Keluar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        TxtNoSuratKeluar.setEditable(false);
        jPanel1.add(TxtNoSuratKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 89, -1));

        jLabel3.setText("No Surat Keluar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel9.setText("Tgl Surat Keluar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        jPanel1.add(TxtPerihal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 146, -1));

        TxtIsiRingkas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIsiRingkasActionPerformed(evt);
            }
        });
        jPanel1.add(TxtIsiRingkas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 190, 90));

        jLabel4.setText("Perihal");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel8.setText("Lampiran");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jLabel6.setText("Kepada");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jLabel5.setText("Isi Ringkas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        jPanel1.add(TxtKepada, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 146, -1));

        TxtNamaKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNamaKaryawanActionPerformed(evt);
            }
        });
        jPanel1.add(TxtNamaKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 130, -1));

        TxtLampiran.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TxtLampiranInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        TxtLampiran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtLampiranActionPerformed(evt);
            }
        });
        jPanel1.add(TxtLampiran, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 190, -1));

        jLabel2.setText("File Surat");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 80, -1));

        BtnFileSurat.setText("File Surat");
        BtnFileSurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFileSuratActionPerformed(evt);
            }
        });
        jPanel1.add(BtnFileSurat, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 80, -1));

        jButton4.setText("Batal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 70, -1));

        TxtTanggalKeluar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TxtTanggalKeluarPropertyChange(evt);
            }
        });
        jPanel1.add(TxtTanggalKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 150, -1));

        jLabel7.setText("Pengolah");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        TxtFile.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TxtFileInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        TxtFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFileActionPerformed(evt);
            }
        });
        jPanel1.add(TxtFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 130, -1));

        TxtIdKaryawan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-pilih-" }));
        jPanel1.add(TxtIdKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void NoSuratKeluarAuto()
    {
       try {
            java.sql.Connection conn =(java.sql.Connection)delta.KoneksiDatabase.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from t_surat_keluar order by no_surat_keluar desc");
            if (sql.next()) {
                String IdBidang = sql.getString("no_surat_keluar").substring(2);
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

               TxtNoSuratKeluar.setText("SK" + Nol + AN);
            } else {
               TxtNoSuratKeluar.setText("SK0001");
            }

           }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           }
     }
public void tampil_combo2()
    {
        try {
        java.sql.Connection conn =(java.sql.Connection)delta.KoneksiDatabase.getKoneksi();
        java.sql.Statement stm = conn.createStatement();
        stm = conn.createStatement();
        java.sql.ResultSet sql = stm.executeQuery("select id_karyawan from t_karyawan order by id_karyawan asc");
        while(sql.next()){
            Object[] ob = new Object[3];
            ob[0] = sql.getString(1);
            
            TxtIdKaryawan.addItem((String) ob[0]);                                      // fungsi ini bertugas menampung isi dari database
        }
        sql.close(); stm.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private void TxtIsiRingkasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIsiRingkasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIsiRingkasActionPerformed

    private void TxtNamaKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNamaKaryawanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNamaKaryawanActionPerformed

    private void TxtLampiranInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TxtLampiranInputMethodTextChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_TxtLampiranInputMethodTextChanged

    private void TxtLampiranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLampiranActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TxtLampiranActionPerformed

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:

       try {
                String sql = "insert into t_surat_keluar values('"+TxtNoSuratKeluar.getText()+"','"+tgl+"','"+TxtPerihal.getText()+"','"+TxtIsiRingkas.getText()+"','"+TxtKepada.getText()+"','"+TxtIdKaryawan.getSelectedIndex()+"','"+TxtNamaKaryawan.getText()+"','"+TxtLampiran.getText()+"','"+TxtFile.getText()+"')";
                java.sql.Connection conn = (java.sql.Connection)delta.KoneksiDatabase.getKoneksi();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "berhasil disimpan");
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnFileSuratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFileSuratActionPerformed
        // TODO add your handling code here:
                JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(null);

        File file = jfc.getSelectedFile();
        String dir = file.getAbsolutePath();

        TxtFile.setText(dir);
    }//GEN-LAST:event_BtnFileSuratActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TxtTanggalKeluarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TxtTanggalKeluarPropertyChange
        // TODO add your handling code here:
        if(TxtTanggalKeluar.getDate()!= null){
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            tgl=format.format(TxtTanggalKeluar.getDate());
        }
    }//GEN-LAST:event_TxtTanggalKeluarPropertyChange

    private void TxtFileInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TxtFileInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFileInputMethodTextChanged

    private void TxtFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFileActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSuratKeluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSuratKeluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSuratKeluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSuratKeluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSuratKeluar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnFileSurat;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JTextField TxtFile;
    private javax.swing.JComboBox<String> TxtIdKaryawan;
    private javax.swing.JTextField TxtIsiRingkas;
    private javax.swing.JTextField TxtKepada;
    private javax.swing.JTextField TxtLampiran;
    private javax.swing.JTextField TxtNamaKaryawan;
    private javax.swing.JTextField TxtNoSuratKeluar;
    private javax.swing.JTextField TxtPerihal;
    private com.toedter.calendar.JDateChooser TxtTanggalKeluar;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}