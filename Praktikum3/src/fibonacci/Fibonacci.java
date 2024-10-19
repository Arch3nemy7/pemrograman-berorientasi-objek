/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonacci;

/**
 *
 * @author bagas
 */
public class Fibonacci {
    
    long num1 = 0;
    long num2 = 1;
    long num3;
    int counter = 0;
    
    public void cetakBilanganFibonacci(int n) {        
        while(counter < n){
            System.out.print(num1 + " ");
            
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        System.out.println();
    }
}
