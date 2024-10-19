/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan4;

public class Kurir extends Pegawai {

    private String kendaraan;

    public Kurir() {

    }

    public Kurir(String nama, String jabatan, String kendaraan) {
        super(nama, jabatan);
        this.kendaraan = kendaraan;
    }

    @Override
    public void bekerja() {
        System.out.println("Bekerja sebagai kurir dengan kendaraan " + this.kendaraan);
    }
}
