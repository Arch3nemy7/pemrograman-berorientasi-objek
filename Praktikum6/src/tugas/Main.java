/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tugas;

/**
 *
 * @author bagas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Departemen departemen = new Departemen(1, "Departemen Teknologi");
        Manager manager = new Manager(50, "Bagas", 10000);
        Karyawan karyawan = new Karyawan(420, "Andrey", 5000);
        
        System.out.println(departemen.getId() + " " + departemen.getNama());
        System.out.println(manager.getId() + " " + manager.getNama() + " " + manager.getGaji());
        System.out.println(karyawan.getId() + " " + karyawan.getNama() + " " + karyawan.getGaji());
    }
}
