/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis;

/**
 *
 * @author User
 */
public class Kuis2 extends javax.swing.JFrame {

    /**
     * Creates new form Kuis2
     */
    public Kuis2() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Diskon = new javax.swing.JTextField();
        HB1 = new javax.swing.JTextField();
        HB2 = new javax.swing.JTextField();
        HB3 = new javax.swing.JTextField();
        Keluar = new javax.swing.JButton();
        Proses = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        HB4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Pembayaran");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 0, 90, 30);

        jLabel2.setText("Diskon");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 200, 90, 30);

        jLabel3.setText("Harga Barang 1");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 40, 90, 30);

        jLabel4.setText("Harga Barang 2");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 80, 90, 30);

        jLabel5.setText("Harga Barang 3");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 120, 90, 30);
        jPanel1.add(Diskon);
        Diskon.setBounds(160, 200, 140, 30);
        jPanel1.add(HB1);
        HB1.setBounds(160, 40, 140, 30);
        jPanel1.add(HB2);
        HB2.setBounds(160, 80, 140, 30);
        jPanel1.add(HB3);
        HB3.setBounds(160, 120, 140, 30);

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        jPanel1.add(Keluar);
        Keluar.setBounds(280, 240, 73, 23);

        Proses.setText("Proses");
        Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesActionPerformed(evt);
            }
        });
        jPanel1.add(Proses);
        Proses.setBounds(60, 240, 90, 23);

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        jPanel1.add(Hapus);
        Hapus.setBounds(180, 240, 73, 23);

        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 290, 310, 120);

        jLabel6.setText("Harga Barang 4");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 160, 90, 30);
        jPanel1.add(HB4);
        HB4.setBounds(160, 160, 140, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 430);

        setBounds(0, 0, 416, 477);
    }// </editor-fold>//GEN-END:initComponents

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesActionPerformed
        int hb1 = Integer.parseInt(HB1.getText());
        int hb2 = Integer.parseInt(HB2.getText());
        int hb3 = Integer.parseInt(HB3.getText());
        int hb4 = Integer.parseInt(HB4.getText());
        int diskon =  Integer.parseInt(Diskon.getText());
        
        int totalharga = hb1+hb2+hb3+hb4;
        int Diskon = totalharga * diskon / 100;
        int totalbayar = totalharga - Diskon;
        
        TA.setText("Harga Barang 1 : "+hb1+"\nHarga Barang 2 : "+hb2
        +"\nHarga Barang 3 : "+hb3+"\nHarga Barang 4 : "+hb4+"\nDiskon : "+diskon+
                "\nTotal Harga : "+totalharga+"\nTotal Bayar : "+totalbayar);
        
        
        
        
    }//GEN-LAST:event_ProsesActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        TA.setText("");
        HB1.setText("");
        HB2.setText("");
        HB3.setText("");
        HB4.setText("");
        Diskon.setText("");
        buttonGroup1.clearSelection();
        
    }//GEN-LAST:event_HapusActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        dispose();
    }//GEN-LAST:event_KeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kuis2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Diskon;
    private javax.swing.JTextField HB1;
    private javax.swing.JTextField HB2;
    private javax.swing.JTextField HB3;
    private javax.swing.JTextField HB4;
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Keluar;
    private javax.swing.JButton Proses;
    private javax.swing.JTextArea TA;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
