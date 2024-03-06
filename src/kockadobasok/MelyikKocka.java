/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kockadobasok;

/**
 *
 * @author KovácsIstvánGábor(SZ
 */
public class MelyikKocka {
    
    public static void main(String[] args) {
        final int dobas_db = 1000;
        final int kocka_oldal = 6;
        int[][] dobasok = new int[kocka_oldal + 1][kocka_oldal + 1];
        
        for (int i = 0; i < dobas_db; i++) {
            int dobas1 = (int)(Math.random()*kocka_oldal+1);
            int dobas2 = (int)(Math.random()*kocka_oldal+1);
            dobasok[dobas1][dobas2]++;
        }
        
        for (int i = 0; i <= kocka_oldal; i++) {
            for (int j = 0; j <= kocka_oldal; j++) {
                System.out.printf("%3d", dobasok[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        
        
    }
}
