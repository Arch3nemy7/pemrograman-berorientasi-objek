/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package latihan4;

public class Main {

    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("Andrey", "Mahasiswa");
        Pegawai pegawai2 = new Manajer("Pratama", "Manajer", "IT");
        Pegawai pegawai3 = new Kurir("Gunawan", "Kurir", "Motor");

        bekerja(pegawai1);
        bekerja(pegawai2);
        bekerja(pegawai3);
    }

    public static void bekerja(Pegawai pegawai) {
        pegawai.bekerja();
    }
}
