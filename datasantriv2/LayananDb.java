package datasantriv2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;

/**
 *
 * @author MisonoMika
 */
public class LayananDb {
    
    public static Connection dbcon(){
        try
        {
             String DB_URL = "jdbc:mysql://localhost/dbsantri";
             String USER = "root";
             String PASS = "";
             Class.forName ("com.mysql.cj.jdbc.Driver");
             return DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
             System.out.println("Koneksi Gagal" + e.getMessage());
             return null;
        }
    }
    
}
