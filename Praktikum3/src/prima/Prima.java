/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prima;

/**
 *
 * @author bagas
 */
public class Prima {
    
    boolean isPrime;
    
    public void cetakBilanganPrima(int num){
        for(int i = 1; i <= num; i++){
            isPrime = true;
            for(int j = 2; j <= i / 2; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){   
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
