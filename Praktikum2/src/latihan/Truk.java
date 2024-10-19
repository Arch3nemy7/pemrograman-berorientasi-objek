/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author bagas
 */
public class Truk {

    double muatan;
    double muatanmaks;

    Truk(double muatanmaks) {
        this.muatanmaks = muatanmaks;
    }

    public double getMuatan() {
        return muatan;
    }

    public double getMuatanMaks() {
        return muatanmaks;
    }

    public void tambahMuatan(double berat) {
        muatan = muatan + berat;

        if (muatan > muatanmaks) {
            muatan = muatan - berat;
        } else {
            muatan = muatan;
        }
    }
}
