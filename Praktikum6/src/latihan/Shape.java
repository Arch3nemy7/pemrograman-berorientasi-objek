/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author bagas
 */
public class Shape {
    
    public double length;
    public double width;
    public double height;
    public double volume; 
    
    public Shape(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
        calculateVolume();
    }
    
    public double compareTo(Shape shape){
        double selisih;
        
        selisih = shape.volume - volume;
        
        return selisih;
    }
    
    private void calculateVolume(){
        volume = length * width * height;
    }
    
    public void cetak(){
        System.out.println("Panjangxlebarxtinggi = " + width + ", " + length + ", " + height);
        System.out.println("volume = " + volume);
    }
}
