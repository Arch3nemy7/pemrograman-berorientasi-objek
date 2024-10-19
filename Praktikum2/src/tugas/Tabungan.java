/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tugas;

/**
 *
 * @author bagas
 */
public class Tabungan {

    int saldo;

    Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }
    
    public int simpanUang(int jumlah) {
        saldo = saldo + jumlah;
        return saldo;
    }
    
    public boolean ambilUang(int jumlah) {
        if(saldo > jumlah) {
            saldo = saldo - jumlah;
            return true;
        } else {
            return false;
        }
    }
}
