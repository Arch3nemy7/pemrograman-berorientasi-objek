/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

public class User {

    private String id;
    private String phone;
    private String username;
    private String password;

    public User() {

    }

    public User(String username, String password, String phone) {
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public boolean login(String phone, String username, String password) {
        return this.phone.equals(phone) && this.username.equals(username) && this.password.equals(password);
    }
}
