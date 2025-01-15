/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enkapsulasi;

/**
 *
 * @author ASUS
 */
public class Main {

     public static void main(String[] args) {
        User user = new User();
        
        user.SetUsername("ADMIN");
        user.SetPassword("admin123");
        
        System.out.println("User anda = " + user.GetUsername());
        System.out.println("Pssword anda = " + user.GetPassword());
    }
    
}
