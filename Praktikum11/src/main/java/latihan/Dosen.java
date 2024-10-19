/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

public class Dosen extends User {
    private String pangkat;
    private String golongan;
    private String key;

    public Dosen() {

    }

    public Dosen(String username, String password) {
        super(username, password);
    }

    public boolean login(String phone, String password) {
        return getPhone().equals(phone) && getPassword().equals(password);
    }

    public boolean login(String username, String password, String key) {
        return getUsername().equals(username) && getPassword().equals(password) && getKey().equals(key);
    }

    public String getKey() {
        return key;
    }
    
    public void setKey(String key) {
        this.key = key;
    }
}
