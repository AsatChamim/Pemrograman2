/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author ASUS
 */
public class PP_Statik {

    public static void Luas(int p, int l) {
        int L = p * l;
        System.out.println(L);
    }

    public static int Keliling(int p, int l) {
        int K = 2 * (p + l);
        return K;
    }

    public static void main(String[] args) {
        //PP_Parameter lll = new PP_Parameter();
        Luas(10, 7);
        System.out.println(" keliling = " + Keliling(7, 7));
    }
}
