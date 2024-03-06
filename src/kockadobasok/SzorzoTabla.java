/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kockadobasok;

/**
 *
 * @author KovácsIstvánGábor(SZ
 */
public class SzorzoTabla {
    
    public static void main(String[] args) {
        final int meret = 5;
        int[][] tabla = new int[meret+1][meret+1];
        
       for (int i = 0; i <= meret; i++) {
            for (int j = 0; j <= meret; j++) {
                tabla[i][j] = i*j;   
            }
        }
        
        for (int sor = 0; sor <= meret; sor++) {
            for (int oszl = 0; oszl <= meret; oszl++) {
                System.out.printf("%4d", tabla[sor][oszl]);
            }
            System.out.println("");
        }
        System.out.println("");
        
        
    }
}
