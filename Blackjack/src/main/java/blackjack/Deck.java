/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author bagas
 */
public class Deck {

    private ArrayList<Card> deck;

    public void buatDeck() {
        this.deck = new ArrayList<Card>();

        String[] nilai = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] tipe = {"C", "D", "H", "S"};

        for (int i = 0; i < tipe.length; i++) {
            for (int j = 0; j < nilai.length; j++) {
                Card kartu = new Card(nilai[j], tipe[i]);
                deck.add(kartu);
            }
        }
    }

    public void kocokDeck() {
        Random random = new Random();

        for (int i = 0; i < deck.size(); i++) {
            int j = random.nextInt(deck.size());
            Card kartuSekarang = deck.get(i);
            Card kartuAcak = deck.get(j);
            deck.set(i, kartuAcak);
            deck.set(j, kartuSekarang);
        }
    }
    
    public void siapkanDeck() {
        buatDeck();
        kocokDeck();
    }

    public Card ambilKartu() {
        return deck.remove(deck.size() - 1);
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }
}
