/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package abstrak;

/**
 *
 * @author bagas
 */
public class TestAnimal {

    public static void main(String[] args) {
        Binatang loveBird = new Burung();
        Binatang cat = new Mamalia();
        Mamalia dolphin = new Mamalia();
        
        loveBird.bernafas();
        loveBird.makan();
        loveBird.berkembangBiak();
        
        cat.bernafas();
        cat.makan();
        cat.berkembangBiak();
        
        dolphin.berkembangBiak();
    }
}
