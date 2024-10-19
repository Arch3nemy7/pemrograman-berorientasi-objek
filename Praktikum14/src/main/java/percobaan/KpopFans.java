/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan;

public class KpopFans extends Fans {
    
    public KpopFans() {
        
    }
    
    public KpopFans(String name) {
        super(name);
    }
    
    public void watchingPerformance(Musician musician, String expression) {
        if(musician instanceof Musician) {
            super.showName();
            System.out.print(expression + " ");
            musician.perform();
        } else if (musician instanceof Singer) {
            super.showName();
            System.out.print(expression + " ");
            Singer singer = (Singer) musician;
            singer.perform();
        } else if (musician instanceof Biduan) {
            super.showName();
            System.out.print(expression + " ");
            Biduan biduan = (Biduan) musician;
            biduan.perform();
        }
    }
}
