/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tugas2;

public class TesTugas2 {

    public static void main(String args[]) {
        Katak o1 = new Katak(5, "Froggy");
        Kecebong o2 = new Kecebong(2, "Junior Frog", 10);
        
        System.out.println(o1.umur);
        System.out.println(o1.nama);
        System.out.println(o1.caraBergerak());
        
        System.out.println(o2.umur);
        System.out.println(o2.nama);
        System.out.println(o2.panjangEkor);
        System.out.println(o2.caraBergerak());
    }
}
