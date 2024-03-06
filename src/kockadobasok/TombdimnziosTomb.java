/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kockadobasok;


public class TombdimnziosTomb {
    
    
    public static void main(String[] args) {
        final int SOR_DB = 3;
        final int OSZL_DB = 5;
        
        int[][] negyzetes = new int[SOR_DB][OSZL_DB];
        
        negyzetes[1][2] = 1;
        
        System.out.println("négyzetes:");
        for (int sor = 0; sor < SOR_DB; sor++) {
            //adott sorban lévő tömb memóriacíme
            //System.out.println(negyzetes[sor]);
            for (int oszl = 0; oszl < OSZL_DB; oszl++) {
                System.out.print(negyzetes[sor][oszl] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        int[][] fureszes = new int[7][];
        for (int sor = 0; sor < 7; sor++) {
            //for (int oszl = 0; oszl < 3; oszl++) {
                int db = (int)(Math.random()*5)+3;
                fureszes[sor] = new int[3+sor];
            //}
        }
        
        fureszes[1][2] = 1;
        fureszes[2][1] = 1;
        
        System.out.println("fűrészes:");
        int sorDB = fureszes.length;
        for (int sor = 0; sor < 5; sor++) {
            int oszlDB = fureszes[sor].length;
            for (int oszl = 0; oszl < 3; oszl++) {
                System.out.print(fureszes[sor][oszl] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        
    }
}
