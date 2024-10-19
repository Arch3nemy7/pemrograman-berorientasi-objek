/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan4;

public class Dosen extends Orang {

    private int nip = 0;
    
    public Dosen(String nama) {
        super(nama);
    }
    
    public Dosen(String nama, int nip) {
        super(nama);
        this.nip = nip;
    }
    
    public Dosen(String nama, int nip, int umur) {
        super(nama, umur);
        this.nip = nip;
    }
    
    public void Info() {
        System.out.println("Nama : " + nama);
        System.out.println("NIP : " + (nip == 0 ? "-" : nip));
        System.out.println("Umur : " + (umur == 0 ? "-" : umur));
    }
}
