/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tugas;

/**
 *
 * @author bagas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Pegawai pegawai = new Pegawai(123, "Andrey");
        
        System.out.println(pegawai.nip);
        System.out.println(pegawai.nama);
    }
}
