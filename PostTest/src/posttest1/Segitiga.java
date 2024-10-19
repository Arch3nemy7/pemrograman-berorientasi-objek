/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1;

/**
 *
 * @author bagas
 */

public class Segitiga {
    
    double luasSegitiga[] = new double[500];
    double luasSegitigaSebenarnya[] = new double[500];
    int kelilingSegitiga[] = new int[500];
    int kelilingSegitigaSebenarnya[] = new int[500];
    
    public void cariLuas(){
        for(int i = 1; i <= 500; i++){
            luasSegitiga[i - 1] = (i * i) / 2;
            System.out.println("Luas segitiga dengan panjang sisi " + i + " adalah " + luasSegitiga[i - 1]);
        }
    }  
    
    public void cariKeliling(){
        for(int i = 1; i <= 500; i++){
            kelilingSegitiga[i - 1] = i + i + i;
            System.out.println("Keliling segitiga dengan panjang sisi " + i + " adalah " + kelilingSegitiga[i - 1]);
        }
    }
    
    public void cariLuasSebenarnya(){
        for(int i = 1; i <= 500; i++){
            luasSegitigaSebenarnya[i - 1] = 0.5 * i * i;
            System.out.println("Luas segitiga sebenarnya dengan panjang sisi " + i + " adalah " + luasSegitigaSebenarnya[i - 1]);
        }
    }  
    
    public void cariKelilingSebenarnya(){
        for(int i = 1; i <= 500; i++){
            kelilingSegitigaSebenarnya[i - 1] = i + i + i;
            System.out.println("Keliling segitiga sebenarnya dengan panjang sisi " + i + " adalah " + kelilingSegitigaSebenarnya[i - 1]);
        }
    }    
}
