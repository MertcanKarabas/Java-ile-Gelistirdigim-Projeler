/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ogrencitakip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mertc
 */
public class OgrenciTakipDB {

    private static final String url = "jdbc:derby://localhost:1527/Ogrenci_Takip";

    public static void kullaniciEkleme(boolean akademisyen, String eMail, String nameSurname, String username, String sifre, String guvenlikSorusu, String gSorusuCevap, char cinsiyet) {

        try {

            String query;
            Connection conn = DriverManager.getConnection(url, null, null);
            Statement stmt = conn.createStatement();
            if (akademisyen) {

                query = "SELECT COUNT (*) FROM AKADEMISYEN";
                ResultSet rs = stmt.executeQuery(query);
                rs.next();
                int id = rs.getInt(1) + 1;

                query = "INSERT INTO AKADEMISYEN VALUES('" + eMail + "','" + nameSurname
                        + "','" + username + "','" + sifre + "','" + guvenlikSorusu
                        + "','" + gSorusuCevap + "','" + cinsiyet + "'," + id + ")";
                stmt.executeUpdate(query);
            } else {
                query = "SELECT COUNT (*) FROM OGRENCI";
                ResultSet rs = stmt.executeQuery(query);
                rs.next();
                int id = rs.getInt(1) + 1;

                query = "INSERT INTO OGRENCI VALUES('" + eMail + "','" + nameSurname
                        + "','" + username + "','" + sifre + "','" + guvenlikSorusu
                        + "','" + gSorusuCevap + "','" + cinsiyet + "'," + id + ")";
                stmt.executeUpdate(query);
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static ResultSet isimIleArama(String nameSurname, DefaultTableModel tbl_table_model) {

        ResultSet rs = null;
        tbl_table_model.setRowCount(0);
        try {

            String query;
            Connection conn = DriverManager.getConnection(url, null, null);
            Statement stmt = conn.createStatement();

            query = "SELECT * FROM OGRENCI WHERE namesurname like '%" + nameSurname + "%'";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                String isimSoyisim = rs.getString("NAMESURNAME");
                String email = rs.getString("EMAIL");
                String username = rs.getString("KULLANICIADI");
                String cinsiyet = rs.getString("CINSIYET");
                tbl_table_model.addRow(new Object[]{isimSoyisim, email, username, cinsiyet});
            }
            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public static ResultSet kullaniciAdiIleArama(String kullaniciAdi, DefaultTableModel tbl_table_model) {

        ResultSet rs = null;
        tbl_table_model.setRowCount(0);
        try {

            String query;
            Connection conn = DriverManager.getConnection(url, null, null);
            Statement stmt = conn.createStatement();

            query = "SELECT * FROM OGRENCI WHERE KULLANICIADI like '%" + kullaniciAdi + "%'";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                String isimSoyisim = rs.getString("NAMESURNAME");
                String email = rs.getString("EMAIL");
                String username = rs.getString("KULLANICIADI");
                String cinsiyet = rs.getString("CINSIYET");
                tbl_table_model.addRow(new Object[]{isimSoyisim, email, username, cinsiyet});
            }
            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public static ResultSet emailIleArama(String email, DefaultTableModel tbl_table_model) {

        ResultSet rs = null;
        tbl_table_model.setRowCount(0);
        try {

            String query;
            Connection conn = DriverManager.getConnection(url, null, null);
            Statement stmt = conn.createStatement();

            query = "SELECT * FROM OGRENCI WHERE EMAIL LIKE '%" + email + "%'";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                String isimSoyisim = rs.getString("NAMESURNAME");
                String emails = rs.getString("EMAIL");
                String username = rs.getString("KULLANICIADI");
                String cinsiyet = rs.getString("CINSIYET");
                tbl_table_model.addRow(new Object[]{isimSoyisim, emails, username, cinsiyet});
            }
            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public static Ogrenci kullaniciAdiİleOgrenciBilgileriAlma(String username) {

        ResultSet rs = null;
        Ogrenci secilenOgrenci = null;

        try {

            String query;
            Connection conn = DriverManager.getConnection(url, null, null);
            Statement stmt = conn.createStatement();

            query = "SELECT * FROM OGRENCI WHERE KULLANICIADI=" + username;
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                secilenOgrenci = new Ogrenci();
                secilenOgrenci.nameSurname = rs.getString("NAMESURNAME");
                secilenOgrenci.email = rs.getString("EMAIL");
                secilenOgrenci.guvenlikSorusu = rs.getString("GUVENLIKSORUSU");
                secilenOgrenci.cinsiyet = rs.getString("CINSIYET");
                secilenOgrenci.gSorusuCevap = rs.getString("GUVENLIKSORUSUCEVAP");
                secilenOgrenci.sifre = rs.getString("SIFRE");
            }
            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return secilenOgrenci;
    }
    
    public static Akademisyen kullaniciAdiİleAkademisyenBilgileriAlma(String username) {

        ResultSet rs = null;
        Akademisyen secilenAkademisyen = null;

        try {

            String query;
            Connection conn = DriverManager.getConnection(url, null, null);
            Statement stmt = conn.createStatement();

            query = "SELECT * FROM OGRENCI WHERE KULLANICIADI=" + username;
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                secilenAkademisyen = new Akademisyen();
                secilenAkademisyen.nameSurname = rs.getString("NAMESURNAME");
                secilenAkademisyen.email = rs.getString("EMAIL");
                secilenAkademisyen.guvenlikSorusu = rs.getString("GUVENLIKSORUSU");
                secilenAkademisyen.cinsiyet = rs.getString("CINSIYET");
                secilenAkademisyen.gSorusuCevap = rs.getString("GUVENLIKSORUSUCEVAP");
                secilenAkademisyen.sifre = rs.getString("SIFRE");
            }
            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return secilenAkademisyen;
    }
    
    public static Akademisyen emailİleAkademisyenBilgileriAlma(String email) {
        ResultSet rs = null;
        Akademisyen secilenAkademisyen = null;

        try {

            String query;
            Connection conn = DriverManager.getConnection(url, null, null);
            Statement stmt = conn.createStatement();

            query = "SELECT * FROM AKADEMISYEN WHERE EMAIL=" + email;
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                secilenAkademisyen = new Akademisyen();
                secilenAkademisyen.nameSurname = rs.getString("NAMESURNAME");
                secilenAkademisyen.email = rs.getString("EMAIL");
                secilenAkademisyen.guvenlikSorusu = rs.getString("GUVENLIKSORUSU");
                secilenAkademisyen.cinsiyet = rs.getString("CINSIYET");
                secilenAkademisyen.gSorusuCevap = rs.getString("GUVENLIKSORUSUCEVAP");
                secilenAkademisyen.sifre = rs.getString("SIFRE");
            }
            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return secilenAkademisyen;
   
    }
    
    public static Ogrenci emailİleOgrenciBilgileriAlma(String email) {
        ResultSet rs = null;
        Ogrenci secilenOgrenci = null;

        try {

            String query;
            Connection conn = DriverManager.getConnection(url, null, null);
            Statement stmt = conn.createStatement();

            query = "SELECT * FROM OGRENCI WHERE EMAIL=" + email;
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                secilenOgrenci = new Ogrenci();
                secilenOgrenci.nameSurname = rs.getString("NAMESURNAME");
                secilenOgrenci.email = rs.getString("EMAIL");
                secilenOgrenci.guvenlikSorusu = rs.getString("GUVENLIKSORUSU");
                secilenOgrenci.cinsiyet = rs.getString("CINSIYET");
                secilenOgrenci.gSorusuCevap = rs.getString("GUVENLIKSORUSUCEVAP");
                secilenOgrenci.sifre = rs.getString("SIFRE");
            }
            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return secilenOgrenci;
   
    }
    
    public static Connection getConnections() {

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, null, null);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return conn;
    }

    public static boolean emailIleSilme(String email) {

        boolean rValue = false;
        try {

            String query;
            Connection conn = DriverManager.getConnection(url, null, null);
            Statement stmt = conn.createStatement();

            query = "DELETE FROM OGRENCI WHERE EMAIL ='" + email + "'";
            int rowEffected = stmt.executeUpdate(query);

            if (rowEffected > 0) {
                rValue = true;
            }
            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rValue;
    }

    public static boolean ogrenciKullaniciAdiKontrol(String kullaniciAdi) {

        String query;
        ResultSet rs = null;
        boolean kullaniciAdiKontrol = false;
        try {
            
            Connection conn = DriverManager.getConnection(url, null, null);
            Statement stmt = conn.createStatement();

            query = "SELECT * FROM OGRENCI WHERE KULLANICIADI = '" + kullaniciAdi+"'";

            rs = stmt.executeQuery(query);

            if (rs.next()) {
                kullaniciAdiKontrol = true;
            }
            conn.close();
            
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return kullaniciAdiKontrol;
    }
    
     public static boolean akademisyenKullaniciAdiKontrol(String kullaniciAdi) {

        String query;
        ResultSet rs = null;
        boolean kullaniciAdiKontrol = false;
        try {
            
            Connection conn = DriverManager.getConnection(url, null, null);
            Statement stmt = conn.createStatement();

            query = "SELECT * FROM AKADEMISYEN WHERE KULLANICIADI = '" + kullaniciAdi+"'";

            rs = stmt.executeQuery(query);

            if (rs.next()) {
                kullaniciAdiKontrol = true;
            }
            conn.close();
            
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return kullaniciAdiKontrol;
    }
     
    public static boolean ogrenciEmailKontrol(String email) {

        String query;
        ResultSet rs = null;
        boolean emailKontrol = false;
        try {
            
            Connection conn = DriverManager.getConnection(url, null, null);
            Statement stmt = conn.createStatement();

            query = "SELECT * FROM OGRENCI WHERE EMAIL = '" + email+"'";

            rs = stmt.executeQuery(query);

            if (rs.next()) {
                emailKontrol = true;
            }
            conn.close();
            
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return emailKontrol;
    }
    
    public static boolean akademisyenEmailKontrol(String email) {

        String query;
        ResultSet rs = null;
        boolean emailKontrol = false;
        try {
            
            Connection conn = DriverManager.getConnection(url, null, null);
            Statement stmt = conn.createStatement();

            query = "SELECT * FROM AKADEMISYEN WHERE EMAIL = '" + email+"'";

            rs = stmt.executeQuery(query);

            if (rs.next()) {
                emailKontrol = true;
            }
            conn.close();
            
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return emailKontrol;
    }
   
    public static void akademisyenSifreGuncelleme(Akademisyen akademisyen) {
        
        try{
            
            String password = akademisyen.sifre;
            String email = akademisyen.email;
            String nameSurname = akademisyen.nameSurname;
            String username = akademisyen.kullaniciAdi;
            String guvenlikSorusu = akademisyen.guvenlikSorusu;
            String gSorusuCevap = akademisyen.gSorusuCevap;
            String cinsiyet = akademisyen.cinsiyet;
            int id = akademisyen.id;
            Connection conn = DriverManager.getConnection(url, null, null);
            Statement stmt = conn.createStatement();
            
            String query = "UPDATE AKADEMISYEN SET EMAIL = '" + email + "', NAMESURNAME = '" + nameSurname + "', KULLANICIADI = '" + username
                    + "', SIFRE = '" + password + "', GUVENLIKSORUSU = '" + guvenlikSorusu + "', GUVENLIKSORUSUCEVAP = '" + gSorusuCevap
                    + "', CINSIYET = '" + cinsiyet + "' WHERE ID = " + id;
            stmt.executeUpdate(query);
            conn.close();
            
        }catch(Exception ex) {
            System.out.println(ex);
        }
    }
    
    public static void ogrenciSifreGuncelleme(Ogrenci ogrenci) {
        
        try{
            
            String password = ogrenci.sifre;
            String email = ogrenci.email;
            String nameSurname = ogrenci.nameSurname;
            String username = ogrenci.kullaniciAdi;
            String guvenlikSorusu = ogrenci.guvenlikSorusu;
            String gSorusuCevap = ogrenci.gSorusuCevap;
            String cinsiyet = ogrenci.cinsiyet;
            int id = ogrenci.id;
            Connection conn = DriverManager.getConnection(url, null, null);
            Statement stmt = conn.createStatement();
            
            String query = "UPDATE OGRENCI SET EMAIL = '" + email + "', NAMESURNAME = '" + nameSurname + "', KULLANICIADI = '" + username
                    + "', SIFRE = '" + password + "', GUVENLIKSORUSU = '" + guvenlikSorusu + "', GUVENLIKSORUSUCEVAP = '" + gSorusuCevap
                    + "', CINSIYET = '" + cinsiyet + "' WHERE ID = " + id;
            stmt.executeUpdate(query);
            conn.close();
            
        }catch(Exception ex) {
            System.out.println(ex);
        }
    }
}


