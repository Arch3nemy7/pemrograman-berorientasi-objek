/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputconsole;

import java.io.Console;

/**
 *
 * @author bagas
 */
public class InputConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nama;
        int usia;
        
        // membuat objek console
        Console con = System.console();
        
        // mengisi variabel nama dan usia dengan console
        System.out.print("Inputkan nama: ");
        nama = con.readLine();
        System.out.print("Inputkan usia: ");
        usia = Integer.parseInt(con.readLine());
        
        // menampilkan isi variabel nama dan usia
        System.out.println("Nama kamu adalah " + nama);
        System.out.println("Saat ini berusia " + usia + "tahun");
    }
    
}
