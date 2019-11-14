/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l15.logika;

/**
 * NAMA  : JamaludinMuhamadAkbar
 * NIM   : A2.1900090
 * Kelas : TI-1A
 * 
 * @author JamaludinMuhamadAkbar
 */
public class L15Logika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean a = true;
       boolean b = true;
       System.out.println("a && b = " + (a && b));
       System.out.println("a || b = " + (a || b));
       System.out.println("a !a = " +  !a);
       System.out.println("!(a && b) = " + !(a && b));
    }
    
}
