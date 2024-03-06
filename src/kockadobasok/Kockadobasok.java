/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kockadobasok;

import java.util.Random;
import java.util.Scanner;


public class Kockadobasok {

    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();
    
    public static void main(String[] args) {
        //Kovacs Istvan Gabor
        
        System.out.println("Hányszor szeretne dobni a dobokockával?: ");
        int dobas = sc.nextInt();
        
        final int dobasok = 13;
        int[] dob = new int[dobasok];
        
        for (int i = 1; i < dobas; i++) {
            int szam = rnd.nextInt(1,13);
            dob[szam]++;
        }
        
        int max = 0;
        for (int i = 0; i < dob.length; i++) {
            if(dob[i] > dob[max]){
                max = i;
            }
        }
        
        int mxErtek = dob[max];
        
        final int MAX_csillag = 40;
        for (int i = 1; i < dob.length; i++){
            System.out.print(i + " ");
            int elofordulas = dob[i];
            
            double szamias = dob[i] / max * MAX_csillag;
        }
        
    }
    
}
