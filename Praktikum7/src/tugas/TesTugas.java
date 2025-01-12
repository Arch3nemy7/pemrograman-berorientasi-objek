/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tugas;


import perbankan.*;
/**
 *
 * @author bagas
 */
public class TesTugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Bank bank = new Bank();
        
        bank.tambahNasabah("Agus", "Daryanto");
        bank.getNasabah(0).setTabungan(new Tabungan(5000));
        bank.tambahNasabah("Tuti", "Irawan");
        bank.getNasabah(1).setTabungan(new Tabungan(7000));
        bank.tambahNasabah("Ani", "Ratna");
        bank.getNasabah(2).setTabungan(new Tabungan(4000));
        bank.tambahNasabah("Bambang", "Darmawan");
        bank.getNasabah(3).setTabungan(new Tabungan(6500));
        System.out.println("Jumlah Nasabah = " + bank.getJumlahNasabah());

        for (int i = 0; i < bank.getJumlahNasabah(); i++) {
            System.out.println("Nasabah ke-" + (i + 1) + " : "
                    + bank.getNasabah(i).getNamaAwal() + " "
                    + bank.getNasabah(i).getNamaAkhir() + " ; Saldo = "
                    + bank.getNasabah(i).getTabungan().getSaldo());
        }
    }
}