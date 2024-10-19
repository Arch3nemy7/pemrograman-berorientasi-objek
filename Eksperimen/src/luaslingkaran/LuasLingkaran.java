/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luaslingkaran;

import java.util.Scanner;

/**
 *
 * @author bagas
 */
public class LuasLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double r, luas, pi;
        
        pi = 3.14;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari lingkaran: ");
        r = keyboard.nextDouble();
        
        luas = pi * r * r;
        
        System.out.print("Luas lingkaran = ");
        System.out.println(luas);
    }
    
}
