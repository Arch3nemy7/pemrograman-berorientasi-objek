/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1;

/**
 *
 * @author bagas
 */

public class JajarGenjang {
    
    double luasJajarGenjang[] = new double[500];
    double luasJajarGenjangSebenarnya[] = new double[500];
    int kelilingJajarGenjang[] = new int[500];
    double kelilingJajarGenjangSebenarnya[] = new double[500];
    
    public void cariLuas(){
        for(int i = 1; i <= 500; i++){
            luasJajarGenjang[i - 1] = (i + i) / 2;
            System.out.println("Luas jajar genjang dengan panjang sisi " + i + " adalah " + luasJajarGenjang[i - 1]);
        }
    }  
    
    public void cariKeliling(){
        for(int i = 1; i <= 500; i++){
            kelilingJajarGenjang[i - 1] = i * i;
            System.out.println("Keliling jajar genjang dengan panjang sisi " + i + " adalah " + kelilingJajarGenjang[i - 1]);
        }
    }
    
    public void cariLuasSebenarnya(){
        for(int i = 1; i <= 500; i++){
            luasJajarGenjangSebenarnya[i - 1] = 2 * i * i;
            System.out.println("Luas jajar genjang sebenarnya dengan panjang sisi " + i + " adalah " + luasJajarGenjangSebenarnya[i - 1]);
        }
    }  
    
    public void cariKelilingSebenarnya(){
        for(int i = 1; i <= 500; i++){
            kelilingJajarGenjangSebenarnya[i - 1] = (4 * i) + (2 * i * Math.sqrt(2));
            System.out.println("Keliling jajar genjang sebenarnya dengan panjang sisi " + i + " adalah " + kelilingJajarGenjangSebenarnya[i - 1]);
        }
    }
}
