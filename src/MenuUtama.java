


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static java.awt.SystemColor.menu;
import javax.swing.JFrame;

public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btn_MenuKaryawan = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        jLabel2.setText("Sistem Informasi Arsip Surat Masuk dan Surat Keluar di PDAM Purwakarta");
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 0, 720, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Data Semester 6\\Project TA\\Hilal\\Image\\IXllfYfW_400x400.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 160, 960, 400);

        jMenu1.setText("Master");
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });

        btn_MenuKaryawan.setText("Master Karyawan");
        btn_MenuKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MenuKaryawanMouseClicked(evt);
            }
        });
        btn_MenuKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MenuKaryawanActionPerformed(evt);
            }
        });
        jMenu1.add(btn_MenuKaryawan);

        jMenuItem2.setText("Master Bidang");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Surat Masuk");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Surat Keluar");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Laporan");

        jMenuItem3.setText("Laporan Surat Masuk");
        jMenu4.add(jMenuItem3);

        jMenuItem4.setText("Laporan Surat Keluar");
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Tentang");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 561, 454);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setExtendedState(this.getExtendedState()|JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
        // TODO add your handling code here:
        //new frm_Karyawan().setVisible(true);
    }//GEN-LAST:event_jMenu1MenuSelected

    private void btn_MenuKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MenuKaryawanActionPerformed
        // TODO add your handling code here:
        MasterKaryawan B = new MasterKaryawan();
             this.add(B);
            B.setVisible(true);
            //new MasterKaryawan().show();
    }//GEN-LAST:event_btn_MenuKaryawanActionPerformed

    private void btn_MenuKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MenuKaryawanMouseClicked
        // TODO add your handling code here:
        new MasterKaryawan().setVisible(true);
        //new MasterKaryawan().show();
    }//GEN-LAST:event_btn_MenuKaryawanMouseClicked

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MenuUtama().setVisible(true);
                MenuUtama mn = new MenuUtama();
                mn.setExtendedState(JFrame.MAXIMIZED_BOTH);
                mn.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btn_MenuKaryawan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}