/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DataKaryawan;

// mengimpor Scanner ke program
import java.util.Scanner;

/**
 *
 * @author bagas
 */
public class DataKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nama, alamat;
        int usia, gaji;
        
        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        // tampilkan iutput ke user
        System.out.println("### Pendataan Karyawan PT. Petani Kode");
        System.out.print("Nama karyawan: ");
        
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.nextLine();
        
        // tampilkan output lagi
        System.out.print("Alamat: ");
        
        // menggunakan scanner lagi
        alamat = keyboard.nextLine();
        
        System.out.print("Usia: ");
        usia = keyboard.nextInt();
        
        System.out.print("Gaji: ");
        gaji = keyboard.nextInt();
        
        // menampilkan apa yang sudah disimpan di variabel
        System.out.println("--------------------");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Gaji: Rp" + gaji);
    }
}
