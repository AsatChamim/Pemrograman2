/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi_msql;

 import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;
// bisa juga diimpor sekaligus seperti ini:
//import java.sql.*

/**
 *
 * @author ASUS
 */
public class koneksi {

    /*
    // Menyiapkan parameter JDBC untuk koneksi ke database
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/mahasiswa";
    static final String USER = "root";
    static final String PASS = "";

    // Menyiapkan objek yang diperlukan untuk mengelola database
    static Connection conn;
    static Statement stmt;
    String statuskoneksi = "";

    
    public static void main(String[] args) {
        try {
            // register driver yang akan dipakai
            Class.forName(JDBC_DRIVER);

            // buat koneksi ke database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // buat objek statement
            stmt = conn.createStatement();

            JOptionPane.showMessageDialog(null, "Berhasil Koneksi");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Koneksi Karena " + e);
        }
    }
}
  
    
    public String jalankanKoneksi() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            statuskoneksi = "konksi JDBC berhasil";
        } catch (Exception e) {
            statuskoneksi = "gagal terkoneksi karena " + e;
        }
        return statuskoneksi;
    }*/

    public static void main(String[] args) {
        
        
        koneksi c = new koneksi();
        c.koneksi();
        
    }
    
    Connection conn = null;
    
    String statuskoneksi; 
    public void koneksi() {
       
        try {
             String DB_URL = "jdbc:mysql://localhost/mahasiswa";
             String USER = "root";
             String PASS = "";
              Class.forName ("com.mysql.cj.jdbc.Driver");
             conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
             statuskoneksi = "Berhasil Koneksi";
        } catch (Exception e) {
             statuskoneksi = "Koneksi Gagal";
        }
    }

}
