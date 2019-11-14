/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6.kambingstatic;

class Mamalia  {
    // Variabel jumlahKambing dideklarasikan sebagai statik
    public static int jumlahKambing;

}


/**
 * NAMA  : Jamaludin Muhamad Akbar
 * NIM   : A2.1900090
 * Kelas : TI-1A
 * 
 * @author JamaludinMuhamadAkbar
 */
public class L6KambingStatic {
    //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "UDIN";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
    
}
