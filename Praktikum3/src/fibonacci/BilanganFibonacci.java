/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author bagas
 */
public class BilanganFibonacci {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        
        int batas;
        
        Fibonacci fibonacciNumber = new Fibonacci();
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("#---Bilangan Fibonacci---#");
        System.out.print("Masukkan berapa banyak bilangan fibonacci yang ingin ditampilkan: ");
        batas = keyboard.nextInt();
        fibonacciNumber.cetakBilanganFibonacci(batas);
    }
}
