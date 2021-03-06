/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ogrencitakip;

/**
 *
 * @author mertc
 */
public class IlkSayfa extends javax.swing.JFrame {

    /**
     * Creates new form IlkSayfa
     */
    
    public IlkSayfa() {
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

        jPanel1 = new javax.swing.JPanel();
        lbl_ogrenciTakipSistemi = new javax.swing.JLabel();
        btn_ogrenciGiris = new javax.swing.JButton();
        btn_akademisyenGiris = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        lbl_ogrenciTakipSistemi.setFont(new java.awt.Font("Tahoma", 0, 76)); // NOI18N
        lbl_ogrenciTakipSistemi.setText("Öğrenci Takip Sistemi");

        btn_ogrenciGiris.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_ogrenciGiris.setText("Öğrenci Giriş");
        btn_ogrenciGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ogrenciGirisActionPerformed(evt);
            }
        });

        btn_akademisyenGiris.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_akademisyenGiris.setText("Akademisyen Giriş");
        btn_akademisyenGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_akademisyenGirisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_ogrenciTakipSistemi)
                        .addGap(851, 851, 851))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 966, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_akademisyenGiris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_ogrenciGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(btn_ogrenciGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_ogrenciTakipSistemi)
                .addGap(18, 18, 18)
                .addComponent(btn_akademisyenGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(388, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ogrenciGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ogrenciGirisActionPerformed
        // TODO add your handling code here:
        OgrenciGiris frame = new OgrenciGiris();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ogrenciGirisActionPerformed

    private void btn_akademisyenGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_akademisyenGirisActionPerformed
        // TODO add your handling code here:
        AkademisyenGiris frame = new AkademisyenGiris();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_akademisyenGirisActionPerformed
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_akademisyenGiris;
    private javax.swing.JButton btn_ogrenciGiris;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_ogrenciTakipSistemi;
    // End of variables declaration//GEN-END:variables
}
