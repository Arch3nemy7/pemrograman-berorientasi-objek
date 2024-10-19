/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author bagas
 */
public class Departemen {
    
    private int idDepartemen;
    private String namaDepartemen;
    
    public Departemen(int idDepartemen, String namaDepartemen){
        this.idDepartemen = idDepartemen;
        this.namaDepartemen = namaDepartemen;
    }
    
    public int getId(){
        return idDepartemen;
    }
    
    public String getNama(){
        return namaDepartemen;
    }
}
