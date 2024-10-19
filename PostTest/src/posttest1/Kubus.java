/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1;

/**
 *
 * @author bagas
 */
public class Kubus {
    
    long luasPermukaanKubus[] = new long[500];
    long volumeKubus[] = new long[500];
    
    public void cariLuasPermukaan(){
        for(int i = 1; i <= 500; i++){
            luasPermukaanKubus[i - 1] = 6 * (i + i);
            System.out.println("Luas permukaan kubus dengan panjang sisi " + i + " adalah " + luasPermukaanKubus[i - 1]);
        }
    }
    
    public void cariVolume(){
        for(int i = 1; i <= 500; i++){
            volumeKubus[i - 1] = i * i * i;
            System.out.println("Volume kubus dengan panjang sisi " + i + " adalah " + volumeKubus[i - 1]);
        }
    }
}
