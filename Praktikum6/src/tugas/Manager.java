/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author bagas
 */
public class Manager {
    
    private int idManager;
    private String namaManager;
    private int gajiManager;
    
    public Manager(int idManager, String namaManager, int gajiManager){
        this.idManager = idManager;
        this.namaManager = namaManager;
        this.gajiManager = gajiManager;
    }
    
    public int getId() {
        return idManager;
    }

    public String getNama() {
        return namaManager;
    }

    public int getGaji() {
        return gajiManager;
    }
}
