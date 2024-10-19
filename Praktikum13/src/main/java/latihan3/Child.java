/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package latihan3;

/**
 *
 * @author bagas
 */
public class Child extends Parent {

    public void method1() {
        System.out.println("Child's method1()");
    }

    public static void main(String args[]) {
        Parent p = new Child();
        p.method2();
    }
}
