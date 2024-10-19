/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;

/**
 *
 * @author bagas
 */
public class Bank {

    private Nasabah nasabah[] = new Nasabah[500];
    private int jumlahNasabah;

    public Bank() {
        this.jumlahNasabah = 0;
    }

    public void tambahNasabah(String namaAwal, String namaAkhir) {
        nasabah[jumlahNasabah++] = new Nasabah(namaAwal, namaAkhir);
    }

    public void hapusNasabah(int index) {
        
        Nasabah[] newArray = new Nasabah[nasabah.length - 1];
        int newIndex = 0;

        for (int i = 0; i < nasabah.length; i++) {
            if (i == index) {
                continue;
            }

            newArray[newIndex] = nasabah[i];
            newIndex++;
        }

        nasabah = newArray;
        jumlahNasabah--;
    }

    public int getJumlahNasabah() {
        return jumlahNasabah;
    }

    public Nasabah getNasabah(int indeks) {
        return nasabah[indeks];
    }
}
