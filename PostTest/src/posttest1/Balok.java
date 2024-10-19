/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1;

/**
 *
 * @author bagas
 */
public class Balok {
    
    long luasPermukaanBalok[] = new long[500];
    long volumeBalok[] = new long[500];
    
    public void cariLuasPermukaan(){
        for(int i = 1; i <= 500; i++){
            luasPermukaanBalok[i - 1] = 2 * (((2 * i) * i) + ((2 * i) * i) + (i * i));
            System.out.println("Luas permukaan balok dengan panjang sisi " + i + " adalah " + luasPermukaanBalok[i - 1]);
        }
    }
    
    public void cariVolume(){
        for(int i = 1; i <= 500; i++){
            volumeBalok[i - 1] = i * (2 * i) * i;
            System.out.println("Volume balok dengan panjang sisi " + i + " adalah " + volumeBalok[i - 1]);
        }
    }  
}
