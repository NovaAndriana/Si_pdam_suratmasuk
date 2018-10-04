
import java.awt.HeadlessException;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ITBPFI
 */
public class FrmKartuSuratMasuk extends javax.swing.JFrame {
private String tgl;
    /**
     * Creates new form FrmKartuSuratMasuk
     */
    public FrmKartuSuratMasuk() {
        initComponents();
        NoSuratMasukAuto();
        tampil_combo();
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
        jLabel3 = new javax.swing.JLabel();
        TxtNoSuratMasuk = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtPerihal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TxtLampiran = new javax.swing.JTextField();
        TxtDari = new javax.swing.JTextField();
        TxtStatus = new javax.swing.JTextField();
        TxtNamaKaryawan = new javax.swing.JTextField();
        TxtNamaBidang = new javax.swing.JTextField();
        TxtTanggalDiteruskan = new javax.swing.JTextField();
        TxtFileSurat = new javax.swing.JTextField();
        TxtNamaPenerima = new javax.swing.JTextField();
        TxtCatatan = new javax.swing.JTextField();
        TxtIntruksi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtIsiRingkas = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TxtIdBidang = new javax.swing.JComboBox<>();
        TxtIdKaryawan = new javax.swing.JComboBox<>();
        TxtTanggalMasuk = new com.toedter.calendar.JDateChooser();
        BtnKembali = new javax.swing.JButton();
        BtnSimpan = new javax.swing.JButton();
        BtnBrowse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Status");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));

        TxtNoSuratMasuk.setEditable(false);
        jPanel1.add(TxtNoSuratMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 54, 89, -1));

        jLabel9.setText("Tgl Surat Masuk");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel4.setText("Nama Karyawan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        TxtPerihal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPerihalActionPerformed(evt);
            }
        });
        jPanel1.add(TxtPerihal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 110, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kartu Surat Masuk");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));
        jPanel1.add(TxtLampiran, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 146, -1));
        jPanel1.add(TxtDari, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 89, -1));
        jPanel1.add(TxtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 146, -1));
        jPanel1.add(TxtNamaKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 120, -1));

        TxtNamaBidang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNamaBidangActionPerformed(evt);
            }
        });
        jPanel1.add(TxtNamaBidang, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 146, -1));
        jPanel1.add(TxtTanggalDiteruskan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 130, -1));

        TxtFileSurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFileSuratActionPerformed(evt);
            }
        });
        jPanel1.add(TxtFileSurat, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 146, -1));
        jPanel1.add(TxtNamaPenerima, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 150, -1));
        jPanel1.add(TxtCatatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 146, -1));

        TxtIntruksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIntruksiActionPerformed(evt);
            }
        });
        jPanel1.add(TxtIntruksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 146, -1));

        TxtIsiRingkas.setColumns(20);
        TxtIsiRingkas.setRows(5);
        jScrollPane1.setViewportView(TxtIsiRingkas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 200, 70));

        jLabel5.setText("Perihal");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel6.setText("Isi Ringkas");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel7.setText("Dari");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel8.setText("Lampiran");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel10.setText("ID Karyawan");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jLabel11.setText("No Surat Masuk");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel12.setText("Tanggal Diteruskan");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jLabel13.setText("ID Bidang");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jLabel14.setText("Nama Bidang");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabel15.setText("Nama Penerima");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        jLabel16.setText("Catatan");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        jLabel17.setText("Intruksi Desposisi");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        jLabel18.setText("File Surat");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, -1));

        TxtIdBidang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-pilih-" }));
        jPanel1.add(TxtIdBidang, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 130, -1));

        TxtIdKaryawan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-pilih-" }));
        jPanel1.add(TxtIdKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 130, -1));

        TxtTanggalMasuk.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TxtTanggalMasukPropertyChange(evt);
            }
        });
        jPanel1.add(TxtTanggalMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 170, -1));

        BtnKembali.setText("Kembali");
        BtnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKembaliActionPerformed(evt);
            }
        });
        jPanel1.add(BtnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, -1, -1));

        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, -1, -1));

        BtnBrowse.setText("...");
        BtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBrowseActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 30, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtPerihalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPerihalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPerihalActionPerformed
private void NoSuratMasukAuto()
    {
       try {
            java.sql.Connection conn =(java.sql.Connection)delta.KoneksiDatabase.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from t_surat_masuk order by no_surat_masuk desc");
            if (sql.next()) {
                String IdBidang = sql.getString("no_surat_masuk").substring(2);
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

               TxtNoSuratMasuk.setText("SM" + Nol + AN);
            } else {
               TxtNoSuratMasuk.setText("SM0001");
            }

           }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           }
     }
public void tampil_combo()
    {
        try {
        java.sql.Connection conn =(java.sql.Connection)delta.KoneksiDatabase.getKoneksi();
        java.sql.Statement stm = conn.createStatement();
        stm = conn.createStatement();
        java.sql.ResultSet sql = stm.executeQuery("select id_bidang from t_bidang order by id_bidang asc");
        while(sql.next()){
            Object[] ob = new Object[3];
            ob[0] = sql.getString(1);
            
            TxtIdBidang.addItem((String) ob[0]);                                      // fungsi ini bertugas menampung isi dari database
        }
        sql.close(); stm.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
    private void TxtNamaBidangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNamaBidangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNamaBidangActionPerformed

    private void TxtFileSuratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFileSuratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFileSuratActionPerformed

    private void TxtIntruksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIntruksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIntruksiActionPerformed

    private void TxtTanggalMasukPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TxtTanggalMasukPropertyChange
        // TODO add your handling code here:
        if(TxtTanggalMasuk.getDate()!= null){ 
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd"); 
            tgl=format.format(TxtTanggalMasuk.getDate()); 
        }
    }//GEN-LAST:event_TxtTanggalMasukPropertyChange

    private void BtnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKembaliActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BtnKembaliActionPerformed

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:
        try {
                String sql = "insert into t_surat_masuk values('"+TxtNoSuratMasuk.getText()+"','"+tgl+"','"+TxtPerihal.getText()+"','"+TxtIsiRingkas.getText()+"','"+TxtDari.getText()+"','"+TxtLampiran.getText()+"','"+TxtIdKaryawan.getSelectedIndex()+"','"+TxtNamaKaryawan.getText()+"','"+TxtTanggalDiteruskan.getText()+"','"+TxtIdBidang.getSelectedIndex()+"','"+TxtNamaBidang.getText()+"','"+TxtNamaPenerima.getText()+"','"+TxtCatatan.getText()+"','"+TxtIntruksi.getText()+"','"+TxtFileSurat.getText()+"','"+TxtStatus.getText()+"')";
                java.sql.Connection conn = (java.sql.Connection)delta.KoneksiDatabase.getKoneksi();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "berhasil disimpan");
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(null);

        File file = jfc.getSelectedFile();
        String dir = file.getAbsolutePath();

        TxtFileSurat.setText(dir);
    }//GEN-LAST:event_BtnBrowseActionPerformed

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
            java.util.logging.Logger.getLogger(FrmKartuSuratMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmKartuSuratMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmKartuSuratMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmKartuSuratMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmKartuSuratMasuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBrowse;
    private javax.swing.JButton BtnKembali;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JTextField TxtCatatan;
    private javax.swing.JTextField TxtDari;
    private javax.swing.JTextField TxtFileSurat;
    private javax.swing.JComboBox<String> TxtIdBidang;
    private javax.swing.JComboBox<String> TxtIdKaryawan;
    private javax.swing.JTextField TxtIntruksi;
    private javax.swing.JTextArea TxtIsiRingkas;
    private javax.swing.JTextField TxtLampiran;
    private javax.swing.JTextField TxtNamaBidang;
    private javax.swing.JTextField TxtNamaKaryawan;
    private javax.swing.JTextField TxtNamaPenerima;
    private javax.swing.JTextField TxtNoSuratMasuk;
    private javax.swing.JTextField TxtPerihal;
    private javax.swing.JTextField TxtStatus;
    private javax.swing.JTextField TxtTanggalDiteruskan;
    private com.toedter.calendar.JDateChooser TxtTanggalMasuk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
