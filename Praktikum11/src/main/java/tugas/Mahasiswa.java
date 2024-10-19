/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

public class Mahasiswa extends User {
    public Dosen dosenWali;
    public String kelas;

    public Mahasiswa() {

    }

    public Mahasiswa(String username, String password, String phone) {
        super(username, password, phone);
    }
}
