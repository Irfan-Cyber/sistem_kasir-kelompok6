/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_kasir;

import sistem_kasir.data.model.PenghapusModel;

/**
 *
 * @author IRPAI
 */
public class Penghapus extends javax.swing.JFrame {

    /**
     * Creates new form Penghapus
     */
    
    PenghapusModel penghapusModel;
    public Penghapus() {
        initComponents();
    }

    public javax.swing.JFrame setPenghapusModel(PenghapusModel penghapusModel) {
        this.penghapusModel = penghapusModel;
        return this;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Lpenghapus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Lmerek = new javax.swing.JLabel();
        TF_merek = new javax.swing.JTextField();
        Lwarna = new javax.swing.JLabel();
        TF_warna = new javax.swing.JTextField();
        btn_kembali = new javax.swing.JButton();
        btn_selesai = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lpenghapus.setText("Penghapus");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(Lpenghapus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lpenghapus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lmerek.setText("Merek");

        TF_merek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_merekActionPerformed(evt);
            }
        });

        Lwarna.setText("Warna");

        TF_warna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_warnaActionPerformed(evt);
            }
        });

        btn_kembali.setText("Kembali");
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });

        btn_selesai.setText("Selesai");
        btn_selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selesaiActionPerformed(evt);
            }
        });

        btn_hapus.setText("Hapus");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_merek)
                    .addComponent(TF_warna)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_kembali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(btn_hapus)
                        .addGap(75, 75, 75)
                        .addComponent(btn_selesai))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lmerek)
                            .addComponent(Lwarna))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Lmerek)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_merek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lwarna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_warna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_kembali)
                    .addComponent(btn_selesai)
                    .addComponent(btn_hapus))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_merekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_merekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_merekActionPerformed

    private void TF_warnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_warnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_warnaActionPerformed

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_kembaliActionPerformed

    private void btn_selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selesaiActionPerformed
        penghapusModel.setMerek(TF_merek.getText());
        penghapusModel.setWarna(TF_warna.getText());
        
        new Produk().setProduk(penghapusModel).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_selesaiActionPerformed

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
            java.util.logging.Logger.getLogger(Penghapus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Penghapus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Penghapus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Penghapus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penghapus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lmerek;
    private javax.swing.JLabel Lpenghapus;
    private javax.swing.JLabel Lwarna;
    private javax.swing.JTextField TF_merek;
    private javax.swing.JTextField TF_warna;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_selesai;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
