/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1;

/**
 *
 * @author bagas
 */

public class Persegi {
    
    int luasPersegi[] = new int[500];
    int luasPersegiSebenarnya[] = new int[500];
    int kelilingPersegi[] = new int[500];
    int kelilingPersegiSebenarnya[] = new int[500];
    
    public void cariLuas(){
        for(int i = 1; i <= 500; i++){
            luasPersegi[i - 1] = i + i;
            System.out.println("Luas persegi dengan panjang sisi " + i + " adalah " + luasPersegi[i - 1]);
        }
    }  
    
    public void cariKeliling(){
        for(int i = 1; i <= 500; i++){
            kelilingPersegi[i - 1] = i + 4;
            System.out.println("Keliling persegi dengan panjang sisi " + i + " adalah " + kelilingPersegi[i - 1]);
        }
    }
    
    public void cariLuasSebenarnya(){
        for(int i = 1; i <= 500; i++){
            luasPersegiSebenarnya[i - 1] = i * i;
            System.out.println("Luas persegi sebenarnya dengan panjang sisi " + i + " adalah " + luasPersegiSebenarnya[i - 1]);
        }
    }  
    
    public void cariKelilingSebenarnya(){
        for(int i = 1; i <= 500; i++){
            kelilingPersegiSebenarnya[i - 1] = i + i + i + i;
            System.out.println("Keliling persegi sebenarnya dengan panjang sisi " + i + " adalah " + kelilingPersegiSebenarnya[i - 1]);
        }
    }
}
