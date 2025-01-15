/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datasantriv2;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author MisonoMika
 */
public class Query {
    
    Connection conn = LayananDb.dbcon();
    
    public void insert(String nama, String alamat, String kelas, String gender) {
        // Query INSERT
        String insertQuery = "INSERT INTO santri_baru (nama, kelas, alamat, gender) VALUES (?, ?, ?, ?)";

        try {
            // Memastikan koneksi tidak null
            if (conn != null) {
                // Membuat PreparedStatement
                PreparedStatement prst = conn.prepareStatement(insertQuery);

                // Mengisi parameter pada query
                prst.setString(1, nama); // Untuk nama (string)
                prst.setString(2, alamat); // Untuk alamt (string)
                prst.setString(3, kelas); // Untuk kelas (string)
                prst.setString(4, gender); // Untuk jenis kelamin (string)

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
    
    public void delete(String Nama) {
    try {
        PreparedStatement pst = null;
        String sql = "DELETE FROM santri_baru WHERE nama = ?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, Nama);
        pst.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
    
    public void update(String nama, String kelas, String alamat, String gender) {
    try {
        PreparedStatement pst = null;
        String sql = "UPDATE santri_baru SET kelas = ?, alamat = ?, gender = ? WHERE nama = ?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, alamat);
        pst.setString(2, kelas);
        pst.setString(3, gender);
        pst.setString(4, nama);
        pst.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
    
}
