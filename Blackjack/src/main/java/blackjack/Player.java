/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

import java.util.ArrayList;

/**
 *
 * @author bagas
 */
public class Player {
    
    private String nama;
    private Deck deck;
    private ArrayList<Card> kartu;
    private int nilai;
    private int jumlahAs;
    private int uang;

    public Player() {
        this.kartu = new ArrayList<Card>();
        this.nilai = 0;
        this.jumlahAs = 0;
    }
    
    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public void tambahKartu() {
        Card card = deck.ambilKartu();
        nilai += card.getNilai();
        jumlahAs += card.isAce() ? 1 : 0;
        kurangiNilaiAs();
        kartu.add(card);
    }

    public void kurangiNilaiAs() {
        while (nilai > 21 && jumlahAs > 0) {
            nilai -= 10;
            jumlahAs -= 1;
        }
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<Card> getKartu() {
        return kartu;
    }

    public int getNilai() {
        return nilai;
    }

    public int getJumlahAs() {
        return jumlahAs;
    }

    public int getUang() {
        return uang;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }   

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public void setJumlahAs(int jumlahAs) {
        this.jumlahAs = jumlahAs;
    }
}
