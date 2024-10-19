/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

public class Dosen extends User {
    private String pangkat;
    private String golongan;
    private String key;

    public Dosen() {
        
    }

    public Dosen(String username, String password, String key) {
        super(username, password, null);
        this.key = key;
    }

    public boolean login(String phone, String password) {
        return super.login(phone, password);
    }

    public boolean login(String username, String password, String key) {
        return super.login(username, password) && this.key.equals(key);
    }
}