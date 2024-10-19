/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author bagas
 */
public class Tabungan {

    int saldo;

    Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public void ambilUang(int jumlah) {
        saldo = saldo - jumlah;
    }
}
