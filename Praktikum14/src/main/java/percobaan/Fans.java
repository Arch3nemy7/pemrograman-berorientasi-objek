/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan;

public class Fans {

    private String name;
    
    public Fans() {
        this.name = "noname";
    }
    
    public Fans(String name) {
        this.name = name;
    }
    
    public void showName() {
        System.out.print(name + " ");
    }
    
    public void watchingPerformance() {
        showName();
        System.out.println("melihat idolanya dari youtube");
    }
    
    public void watchingPerformance(Musician musician) {
        if(musician instanceof Musician) {
            showName();
            musician.perform();
        } else if (musician instanceof Singer) {
            showName();
            Singer singer = (Singer) musician;
            singer.perform();
        } else if (musician instanceof Biduan) {
            showName();
            Biduan biduan = (Biduan) musician;
            biduan.perform();
        }
    }
}
