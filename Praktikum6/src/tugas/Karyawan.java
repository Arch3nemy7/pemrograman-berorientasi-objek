/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author bagas
 */
public class Karyawan {
    
    private int idKaryawan;
    private String namaKaryawan;
    private int gajiKaryawan;

    public Karyawan(int idKaryawan, String namaKaryawan, int gajiKaryawan) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.gajiKaryawan = gajiKaryawan;
    }
    
    public int getId() {
        return idKaryawan;
    }

    public String getNama() {
        return namaKaryawan;
    }

    public int getGaji() {
        return gajiKaryawan;
    }
}
