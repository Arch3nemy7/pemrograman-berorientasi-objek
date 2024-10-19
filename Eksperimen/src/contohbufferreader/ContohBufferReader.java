/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contohbufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bagas
 */
public class ContohBufferReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        String nama;
        
        // membuat objek bufferreader
        InputStreamReader isr = new InputStreamReader(System.in);
        
        // membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);
        
        // mengisi variabel nama dengan bufferedreader
        System.out.print("Inputkan nama: ");
        nama = br.readLine();
        
        // tampilkan output isi variabel nama
        System.out.println("Nama kamu adalah " + nama);
    }
    
}
