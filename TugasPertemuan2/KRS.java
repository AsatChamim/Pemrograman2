/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2;

/**
 *
 * @author ASUS
 */
public class KRS {

    public static void main(String[] args) {
        MDay Day = new MDay();
        Mmatkul mk = new Mmatkul();
        Mdosen dm = new Mdosen();
        Mkls kls = new Mkls();

        System.out.println("=================================================================================================================");
        System.out.println("|" + "HARI" + "\t\t" + "|" + "MATA KULIAH" + "\t\t\t\t" + "|" + "DOSEN PENGAMPU" + "\t\t\t\t\t" + "|" + "KELAS" + "\t" + "|");
        System.out.println("=================================================================================================================");
        System.out.println("|" + Day.H1 + "\t\t" + "|" + mk.MK1 + "\t\t\t" + "|" + dm.DM1 + "\t\t\t\t" + "|" + kls.kls1 + "\t" + "|");
        System.out.println("|" + "\t\t" + "|" + mk.MK2 + "\t\t" + "|" + dm.DM2 + "\t\t" + "|" + kls.kls3 + "\t" + "|");
        System.out.println("|---------------------------------------------------------------------------------------------------------------|");
        System.out.println("|" + Day.H2 + "\t\t" + "       |" + mk.MK3 + "\t\t\t" + "|" + dm.DM3 + "\t\t" + "|" + kls.kls1 + "\t" + "|");
        System.out.println("|" + "\t\t" + "|" + mk.MK4 + "\t" + "|" + dm.DM4 + "\t\t\t" + "|" + kls.kls1 + "\t" + "|");
        System.out.println("|---------------------------------------------------------------------------------------------------------------|");
        System.out.println("|" + Day.H3 + "\t\t" + "|" + mk.MK5 + "\t\t\t" + "|" + dm.DM5 + "\t\t" + "|" + kls.kls1 + "\t" + "|");
        System.out.println("|" + "\t\t" + "|" + mk.MK6 + "\t\t\t" + "|" + dm.DM6 + "\t\t" + "|" + kls.kls2 + "\t" + "|");
        System.out.println("|" + "\t\t" + "|" + mk.MK7 + "\t\t" + "|" + dm.DM7 + "\t\t" + "|" + kls.kls3 + "\t" + "|");
        System.out.println("=================================================================================================================");

    }
}
