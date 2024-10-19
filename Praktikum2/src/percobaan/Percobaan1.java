/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaan;

/**
 *
 * @author bagas
 */

public class Percobaan1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Siswa anak = new Siswa();
        anak.setNrp(5);
        System.out.println(anak.nrp);
    }
}

class Siswa {
    int nrp;
            
    public void setNrp(int i) {
        nrp = i;
    }    
}
