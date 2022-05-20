/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ogrencitakip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author mertc
 */
public class oSifremiUnuttum extends javax.swing.JFrame {

    /**
     * Creates new form oSifreYenileme
     */
    public oSifremiUnuttum() {
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
        lbl_kullaniciAdi = new javax.swing.JLabel();
        txt_kullaniciAdi = new javax.swing.JTextField();
        txt_isimSoyisim = new javax.swing.JTextField();
        lbl_sifreYenileme = new javax.swing.JLabel();
        lbl_aciklama = new javax.swing.JLabel();
        lbl_isimSoyisim = new javax.swing.JLabel();
        btn_devam = new javax.swing.JButton();
        btn_geri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));

        lbl_kullaniciAdi.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_kullaniciAdi.setText("Kullanıcı Adı");

        lbl_sifreYenileme.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        lbl_sifreYenileme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sifreYenileme.setText("Şifre Yenileme");

        lbl_aciklama.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_aciklama.setText("Lütfen aşağıdaki bilgileri doldurunuz. Yanlış bilgi girmeniz dahilinde şifre yenileyemezsiniz.");

        lbl_isimSoyisim.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_isimSoyisim.setText("İsim-Soyisim");

        btn_devam.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_devam.setText("Devam");
        btn_devam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_devamActionPerformed(evt);
            }
        });

        btn_geri.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_geri.setText("Geri");
        btn_geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(lbl_aciklama)
                .addGap(0, 267, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btn_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_devam, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_sifreYenileme)
                        .addGap(694, 694, 694))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_isimSoyisim)
                            .addComponent(lbl_kullaniciAdi))
                        .addGap(250, 250, 250)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_isimSoyisim)
                            .addComponent(txt_kullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(372, 372, 372))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(lbl_sifreYenileme)
                .addGap(54, 54, 54)
                .addComponent(lbl_aciklama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_isimSoyisim, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_isimSoyisim))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_kullaniciAdi)
                    .addComponent(lbl_kullaniciAdi))
                .addGap(198, 198, 198)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_devam, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_devamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_devamActionPerformed
        // TODO add your handling code here:
        String isimSoyisim = txt_isimSoyisim.getText();
        String kullaniciAdi = txt_kullaniciAdi.getText();
        Ogrenci ogrenci = null;
        if (!OgrenciTakipDB.ogrenciKullaniciAdiKontrol(kullaniciAdi)) {
            JOptionPane.showMessageDialog(this, "Böyle bir kullanıcı adı bulunamadı. Kontrol ediniz.");
        } else {
            ogrenci = OgrenciTakipDB.kullaniciAdiİleOgrenciBilgileriAlma(kullaniciAdi);
            if (ogrenci.nameSurname.equals(isimSoyisim)) {
                oSifremiUnuttumDevam frame = new oSifremiUnuttumDevam(ogrenci);
                frame.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "İsminiz ile girilen kullanıcı adı eşleşmedi tekrar deneyiniz.");
            }
        }
    }//GEN-LAST:event_btn_devamActionPerformed

    private void btn_geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geriActionPerformed
        // TODO add your handling code here:
        AkademisyenGiris frame = new AkademisyenGiris();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_geriActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_devam;
    private javax.swing.JButton btn_geri;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_aciklama;
    private javax.swing.JLabel lbl_isimSoyisim;
    private javax.swing.JLabel lbl_kullaniciAdi;
    private javax.swing.JLabel lbl_sifreYenileme;
    private javax.swing.JTextField txt_isimSoyisim;
    private javax.swing.JTextField txt_kullaniciAdi;
    // End of variables declaration//GEN-END:variables
}
