package org.example._2023_06_09.hw;

import java.util.Scanner;

public class Game {
    private static final int CARDS_FOR_PLAYER = 5;
    private static int players;
    private static final Scanner SC = new Scanner(System.in);
    private final Deck deck = new Deck();

    public void start() {
        setUpPlayers();
        deck.shuffle();
        for (int i = 0; i < players * CARDS_FOR_PLAYER; i++) {
            System.out.println(deck.drawCard());

            if (i % CARDS_FOR_PLAYER == CARDS_FOR_PLAYER - 1)
                System.out.println();
        }
    }

    private void setUpPlayers() {
        int numberOfCards = deck.getSuits().length * deck.getRank().length;
        while (true) {
            System.out.println("Enter the number of players: ");

            if (SC.hasNextInt()) {
                players = SC.nextInt();
                if (CARDS_FOR_PLAYER * players <= numberOfCards) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        break;
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }
    }
}