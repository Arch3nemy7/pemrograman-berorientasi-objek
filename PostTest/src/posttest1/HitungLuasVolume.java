/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest1;

/**
 *
 * @author bagas
 */

public class HitungLuasVolume {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Persegi objekPersegi = new Persegi();
        Lingkaran objekLingkaran = new Lingkaran();
        Segitiga objekSegitiga = new Segitiga();
        JajarGenjang objekJajarGenjang = new JajarGenjang();
        Balok objekBalok = new Balok();
        Kubus objekKubus = new Kubus();
        
        System.out.println("#---Luas Persegi---#");
        objekPersegi.cariLuas();
        objekPersegi.cariLuasSebenarnya();
        System.out.println();
        System.out.println("#---Keliling Persegi---#");
        objekPersegi.cariKeliling();
        objekPersegi.cariKelilingSebenarnya();
        System.out.println();
        
//        System.out.println("#---Luas Lingkaran---#");
//        objekLingkaran.cariLuas();
//        objekLingkaran.cariLuasSebenarnya();
//        System.out.println();
//        System.out.println("#---Keliling Lingkaran---#");
//        objekLingkaran.cariKeliling();
//        objekLingkaran.cariKelilingSebenarnya();
//        System.out.println();
//        
//        System.out.println("#---Luas Segitiga---#");
//        objekSegitiga.cariLuas();
//        objekSegitiga.cariLuasSebenarnya();
//        System.out.println();
//        System.out.println("#---Keliling Segitigas---#");
//        objekSegitiga.cariKeliling();
//        objekSegitiga.cariKelilingSebenarnya();
//        System.out.println();
//        
//        System.out.println("#---Luas JajarGenjang---#");
//        objekJajarGenjang.cariLuas();
//        objekJajarGenjang.cariLuasSebenarnya();
//        System.out.println();
//        System.out.println("#---Keliling JajarGenjang---#");
//        objekJajarGenjang.cariKeliling();
//        objekJajarGenjang.cariKelilingSebenarnya();
//        System.out.println();
//        
//        System.out.println("#---Volume Balok---#");
//        objekBalok.cariLuasPermukaan();
//        objekBalok.cariVolume();
        
        System.out.println("#---Volume Kubus---#");
        objekKubus.cariLuasPermukaan();
        objekKubus.cariVolume();
    }
}
