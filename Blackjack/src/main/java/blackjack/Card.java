/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

/**
 *
 * @author bagas
 */
public class Card {

    private String nilai;
    private String tipe;

    public Card(String nilai, String tipe) {
        this.nilai = nilai;
        this.tipe = tipe;
    }

    @Override
    public String toString() {
        return nilai + "-" + tipe;
    }

    public int getNilai() {
        if ("AJQK".contains(nilai)) {
            if (nilai == "A") {
                return 11;
            } else {
                return 10;
            }
        }
        return Integer.parseInt(nilai);
    }

    public boolean isAce() {
        if (nilai == "A") {
            return true;
        } else {
            return false;
        }
    }

    public String getImagePath() {
        return "../cards/" + toString() + ".png";
    }
}
