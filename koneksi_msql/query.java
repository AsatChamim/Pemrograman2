/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi_msql;

import javax.swing.JOptionPane;
import java.sql.*;

public class query {

   

    /*
    public void insert(String NIM, String NAMA, String ALAMAT, String GENDER) {

        String inserQuery = "INSERT INTO identitas (nim, nama, alamat, gender) VALUES (?, ?, ?, ?) ";
        c.jalankanKoneksi();

        try {
            PreparedStatement prepredStatement = c.conn.prepareStatement(inserQuery);
            prepredStatement.setString(1, NIM);
            prepredStatement.setString(2, NAMA);
            prepredStatement.setString(3, ALAMAT);
            prepredStatement.setString(4, GENDER);

            //eksekusi Query
            int rowsInserted = prepredStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("berhasil insert");
            } else {
                System.out.println("gagal insert");
            }
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Tejadi salah " + ex);

        }
    }

    public static void main(String[] args) {
        query Q = new query();
        Q.insert("2355201003", "ASAT", "WATES", "L");
    }
    public void query(int NIM, String NAMA, String ALAMAT, String GENDER) {

        try {
            Statement s = c.con.createStatement();
            String sql = "insert into identitas value ('" + NIM + "'," + NAMA + "'," + ALAMAT + "'," + GENDER + "');";
            s.executeUpdate(sql);
            s.close();
            JOptionPane.showMessageDialog(null, "simpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }*/
    
    private Connection conn;

    // Konstruktor untuk menginisialisasi koneksi
    public query() {
        try {
            // Pastikan JDBC driver sesuai dengan database Anda
            String url = "jdbc:mysql://localhost/mahasiswa"; // Ganti dengan URL database Anda
            String username = "root"; // Ganti dengan username database Anda
            String password = ""; // Ganti dengan password database Anda

            conn = DriverManager.getConnection(url, username, password);
            System.out.println("WES ISO KONEK!!!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
    }
    
    public void insert(String nim, String nama, String alamat, String jk) {
        // Query INSERT
        String insertQuery = "INSERT INTO IDENTITAS (nim, nama, alamat, gender) VALUES (?, ?, ?, ?)";

        try {
            // Memastikan koneksi tidak null
            if (conn != null) {
                // Membuat PreparedStatement
                PreparedStatement prst = conn.prepareStatement(insertQuery);

                // Mengisi parameter pada query
                prst.setString(1, nim); // Untuk nim (string)
                prst.setString(2, nama); // Untuk nama (string)
                prst.setString(3, alamat); // Untuk alamat (string)
                prst.setString(4, jk); // Untuk jenis kelamin (string)

                // Menjalankan query INSERT
                int rowsInserted = prst.executeUpdate();

                // Menampilkan hasil
                if (rowsInserted > 0) {
                    System.out.println("Data berhasil dimasukkan!");
                } else {
                    System.out.println("Data gagal dimasukkan");
                }
            } else {
                System.out.println("Koneksi tidak tersedia");
            }

        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan saat menginsert data: " + e.getMessage());
        }
    }
    
    public void delete(String Nim) {
    try {
        PreparedStatement pst = null;
        String sql = "DELETE FROM mahasiswa.identitas WHERE nim = ?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, Nim);
        pst.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
    
    public void update(String Nim, String nama, String alamat, String gender) {
    try {
        PreparedStatement pst = null;
        String sql = "UPDATE mahasiswa.identitas SET nama = ?, alamat = ?, gender = ? WHERE nim = ?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, nama);
        pst.setString(2, alamat);
        pst.setString(3, gender);
        pst.setString(4, Nim);
        pst.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
    
    public static void main(String[] args) {
        // Membuat objek Query
        query Q = new query();
        
        // Memasukkan data
        Q.insert("2355201033", "Ardhi", "Kediri", "L");
    }
}

