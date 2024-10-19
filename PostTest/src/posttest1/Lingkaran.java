/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1;

/**
 *
 * @author bagas
 */

public class Lingkaran {
    
    double luasLingkaran[] = new double[500];
    double luasLingkaranSebenarnya[] = new double[500];
    double kelilingLingkaran[] = new double[500];
    double kelilingLingkaranSebenarnya[] = new double[500];
    final double PI = 3.14;
    
    public void cariLuas(){
        for(int i = 1; i <= 500; i++){
            luasLingkaran[i - 1] = PI * i;
            System.out.println("Luas Lingkaran dengan panjang sisi " + i + " adalah " + luasLingkaran[i - 1]);
        }
    }  
    
    public void cariKeliling(){
        for(int i = 1; i <= 500; i++){
            kelilingLingkaran[i - 1] = PI + i;
            System.out.println("Keliling Lingkaran dengan panjang jari-jari " + i + " adalah " + kelilingLingkaran[i - 1]);
        }
    }
    public void cariLuasSebenarnya(){
        for(int i = 1; i <= 500; i++){
            luasLingkaranSebenarnya[i - 1] = PI * i * i;
            System.out.println("Luas Lingkaran sebenarnya dengan panjang jari-jari " + i + " adalah " + luasLingkaranSebenarnya[i - 1]);
        }
    }  
    
    public void cariKelilingSebenarnya(){
        for(int i = 1; i <= 500; i++){
            kelilingLingkaranSebenarnya[i - 1] = 2 * PI * i;
            System.out.println("Keliling Lingkaran sebenarnya dengan panjang jari-jari " + i + " adalah " + kelilingLingkaranSebenarnya[i - 1]);
        }
    }
}
