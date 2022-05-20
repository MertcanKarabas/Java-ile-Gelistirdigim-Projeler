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
public class AkademisyenGiris extends javax.swing.JFrame {

    /**
     * Creates new form AkademisyenGiris
     */
    public AkademisyenGiris() {
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
        txt_akademisyenKullaniciAdi = new javax.swing.JTextField();
        pswd_akademisyenSifre = new javax.swing.JPasswordField();
        btn_girisYap = new javax.swing.JButton();
        btn_kayitOl = new javax.swing.JButton();
        lbl_sifremiUnuttum = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_geri = new javax.swing.JButton();
        chbx_sifreyiGoster = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        txt_akademisyenKullaniciAdi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_akademisyenKullaniciAdi.setText("Kullanıcı Adı");
        txt_akademisyenKullaniciAdi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_akademisyenKullaniciAdiMouseClicked(evt);
            }
        });
        txt_akademisyenKullaniciAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_akademisyenKullaniciAdiActionPerformed(evt);
            }
        });

        btn_girisYap.setText("Giriş Yap");
        btn_girisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_girisYapActionPerformed(evt);
            }
        });

        btn_kayitOl.setText("Kayıt Ol");
        btn_kayitOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kayitOlActionPerformed(evt);
            }
        });

        lbl_sifremiUnuttum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_sifremiUnuttum.setText("Şifremi Unuttum");
        lbl_sifremiUnuttum.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_sifremiUnuttum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_sifremiUnuttumMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("AKADEMİSYEN GİRİŞ EKRANI");

        btn_geri.setText("Öğrenci Giriş Ekranına Git");
        btn_geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geriActionPerformed(evt);
            }
        });

        chbx_sifreyiGoster.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chbx_sifreyiGoster.setText("Şifreyi Göster");
        chbx_sifreyiGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbx_sifreyiGosterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbl_sifremiUnuttum)
                                    .addComponent(txt_akademisyenKullaniciAdi, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pswd_akademisyenSifre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_kayitOl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_girisYap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chbx_sifreyiGoster, javax.swing.GroupLayout.Alignment.LEADING)))))
                    .addComponent(btn_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(600, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(txt_akademisyenKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pswd_akademisyenSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(chbx_sifreyiGoster)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_girisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_sifremiUnuttum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_kayitOl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btn_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_akademisyenKullaniciAdiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_akademisyenKullaniciAdiMouseClicked
        // TODO add your handling code here:
        if (txt_akademisyenKullaniciAdi.getText().equals("Kullanıcı Adı")) {
            txt_akademisyenKullaniciAdi.setText("");
        } 
    }//GEN-LAST:event_txt_akademisyenKullaniciAdiMouseClicked

    private void lbl_sifremiUnuttumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_sifremiUnuttumMouseClicked
        // TODO add your handling code here:
        aSifremiUnuttum frame = new aSifremiUnuttum();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_sifremiUnuttumMouseClicked

    private void btn_kayitOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kayitOlActionPerformed
        // TODO add your handling code here:
        aKayitSayfasi frame = new aKayitSayfasi();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_kayitOlActionPerformed

    private void btn_geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geriActionPerformed
        // TODO add your handling code here:
        OgrenciGiris frame = new OgrenciGiris();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_geriActionPerformed

    private void btn_girisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_girisYapActionPerformed
        // TODO add your handling code here:
        String username = txt_akademisyenKullaniciAdi.getText();
        String password = new String(pswd_akademisyenSifre.getPassword());
        String url = "jdbc:derby://localhost:1527/Ogrenci_Takip";
        
        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM AKADEMISYEN WHERE KULLANICIADI = '" + username + "' AND SIFRE = '" + password + "'";
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                AkademisyenSayfasi frame = new AkademisyenSayfasi();
                frame.setVisible(true);
                this.dispose();
            
            } else {
                JOptionPane.showMessageDialog(this, "Kullanıcı adını veya Şifrenizi yanlış girdiniz. Tekrar deneyiniz.");
                txt_akademisyenKullaniciAdi.setText("");
                pswd_akademisyenSifre.setText("");
            }
       
        } catch (Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_btn_girisYapActionPerformed

    private void chbx_sifreyiGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbx_sifreyiGosterActionPerformed
        // TODO add your handling code here:
        if (chbx_sifreyiGoster.isSelected()) 
            pswd_akademisyenSifre.setEchoChar((char)0);
        else
            pswd_akademisyenSifre.setEchoChar('*');
    }//GEN-LAST:event_chbx_sifreyiGosterActionPerformed

    private void txt_akademisyenKullaniciAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_akademisyenKullaniciAdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_akademisyenKullaniciAdiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_geri;
    private javax.swing.JButton btn_girisYap;
    private javax.swing.JButton btn_kayitOl;
    private javax.swing.JCheckBox chbx_sifreyiGoster;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_sifremiUnuttum;
    private javax.swing.JPasswordField pswd_akademisyenSifre;
    private javax.swing.JTextField txt_akademisyenKullaniciAdi;
    // End of variables declaration//GEN-END:variables
}
