/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan4;

public class Manajer extends Pegawai {

    private String bidang;

    public Manajer() {

    }

    public Manajer(String nama, String jabatan, String bidang) {
        super(nama, jabatan);
        this.bidang = bidang;
    }

    @Override
    public void bekerja() {
        System.out.println("Bekerja sebagai manajer di bidang " + this.bidang);
    }
}
