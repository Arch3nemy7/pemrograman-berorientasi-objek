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
public class Dealer {

    private Deck deck;
    private ArrayList<Card> kartu;
    private Card kartuTersembunyi;
    private int nilai;
    private int jumlahAs;

    public Dealer(Deck deck) {
        this.deck = deck;
        this.kartu = new ArrayList<Card>();
        this.nilai = 0;
        this.jumlahAs = 0;
    }

    public void tambahKartuTersembunyi() {
        kartuTersembunyi = deck.ambilKartu();
        nilai += kartuTersembunyi.getNilai();
        jumlahAs += kartuTersembunyi.isAce() ? 1 : 0;
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

    public boolean shouldHit(Player player) {
        int jumlahKartuMenang;
        int jumlahKartuTersisa;
        int jaraknilai;
        double probabilitas;

        jumlahKartuMenang = 0;
        jumlahKartuTersisa = deck.getDeck().size();
        jaraknilai = 21 - nilai;

        for (Card card : deck.getDeck()) {
            if (card.getNilai() <= jaraknilai) {
                jumlahKartuMenang++;
            }
        }

        probabilitas = (double) jumlahKartuMenang / (double) jumlahKartuTersisa;

        if (nilai < player.getNilai()) {
            if (probabilitas > 0.3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public Card getKartuTersembunyi() {
        return kartuTersembunyi;
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

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    
    public void setJumlahAs(int jumlahAs) {
        this.jumlahAs = jumlahAs;
    }
}
