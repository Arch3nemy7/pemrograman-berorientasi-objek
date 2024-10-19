/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

public class Gun extends Weapon {
    
    public int bullets;
    
    public Gun(int bullets) {
        this.bullets = bullets;
    }
    
    @Override
    public void attack() {
        bullets--;
        System.out.println("Senjata");
        System.out.println("Menembakkan peluru");
        System.out.println("Sisa peluru:" + bullets);
    }
}
