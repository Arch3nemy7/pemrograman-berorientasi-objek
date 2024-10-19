/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package prima;

import java.util.Scanner;

/**
 *
 * @author bagas
 */
public class BilanganPrima {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        
        int batas;
        
        Prima primeNumber = new Prima();
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("#---Bilangan Prima---#");
        System.out.print("Masukkan batas bilangan prima yang ingin ditampilkan: ");
        batas = keyboard.nextInt();
        primeNumber.cetakBilanganPrima(batas);
    }
}
