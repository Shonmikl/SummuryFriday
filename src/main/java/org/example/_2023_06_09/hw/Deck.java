package org.example._2023_06_09.hw;

import java.util.Random;

public class Deck {
    private final Suit[] suits = Suit.values();
    private final Rank[] rank = Rank.values();
    private String[] cards;

    public Deck() {
        initDeck();
    }

    private void initDeck() {
        int numberOfCards = suits.length * rank.length;
        cards = new String[numberOfCards];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                cards[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }
    }

    public Suit[] getSuits() {
        return suits;
    }

    public Rank[] getRank() {
        return rank;
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < cards.length; i++) {
            int card = i + (random.nextInt(cards.length - i));
            String temp = cards[card];
            cards[card] = cards[i];
            cards[i] = temp;
        }
    }

    public String drawCard() {
        String card = cards[0];
        String[] newDeck = new String[cards.length - 1];
        System.arraycopy(cards, 1, newDeck, 0, cards.length - 1);
        cards = newDeck;
        return card;
    }
}