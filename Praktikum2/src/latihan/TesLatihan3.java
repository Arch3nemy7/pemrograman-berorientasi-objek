/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package latihan;

/**
 *
 * @author bagas
 */
public class TesLatihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Truk truk = new Truk(1000);
        System.out.println("Muatan maksimal =  " + truk.getMuatanMaks());
        truk.tambahMuatan(500.0);
        System.out.println("Tambah muatan: 500 ");
        truk.tambahMuatan(350.0);
        System.out.println("Tambah muatan: 350 ");
        truk.tambahMuatan(100.0);
        System.out.println("Tambah muatan: 100 ");
        truk.tambahMuatan(150.0);
        System.out.println("Tambah muatan: 150 ");
        System.out.println("Muatan sekarang = " + truk.getMuatan());
    }
}
