/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversidesimalkeheksadesimal;

import java.util.Scanner;

/**
 *
 * @author bagas
 */
public class KonversiDesimalKeHeksadesimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int desimal, sisa, index = 0;
        char[] heksadesimal = new char[32];
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("#---Konversi Bilangan Desimal ke Bilangan Heksadesimal---#");
        System.out.print("Masukkan bilangan desimal: ");
        desimal = keyboard.nextInt();
        
        if (desimal == 0)
            System.out.print("Bilangan heksadesimal: 0");
        else {
            while (desimal > 0) {
                sisa = desimal % 16;
                
                if (sisa < 10) {
                    heksadesimal[index] = (char) ('0' + sisa);
                }
                else {
                    heksadesimal[index] = (char) ('A' + (sisa - 10));
                }
                desimal = desimal / 16;
                index++;
            }
            
            System.out.print("Bilangan heksadesimal: ");
            for (int i = index - 1; i >= 0; i--) {
                System.out.print(heksadesimal[i]);
            }
        }
        
        System.out.println();
    }
}
