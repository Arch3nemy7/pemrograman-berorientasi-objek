/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversidesimalkebiner;

import java.util.Scanner;

/**
 *
 * @author bagas
 */
public class KonversiDesimalKeBiner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int desimal, index = 0;
        int[] biner = new int[32];
                
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("#---Konversi Bilangan Desimal ke Bilangan Biner---#");
        System.out.print("Masukkan bilangan desimal: ");
        desimal = keyboard.nextInt();
        
        if (desimal == 0)
            System.out.print("Bilangan biner: 0");
        else {
            while (desimal > 0) {
                biner[index] = desimal % 2;
                desimal = desimal / 2;
                index++;
            }
            
            System.out.print("Bilangan biner: ");
            for(int i = index - 1; i >= 0; i--) {
                System.out.print(biner[i]);
            }
        }
        
        System.out.println();
    }
    
}
