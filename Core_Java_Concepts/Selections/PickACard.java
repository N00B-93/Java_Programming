package Selections;

import java.util.Random;

/*
    This is a program simulates picking a card from a deck
    of 52 cards. The program displays the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
    Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
 */

public class PickACard
{
    public static void main(String[] args)
    {
        // Creates a Random Object.
        Random rand = new Random();

        // Generates random numbers that represents suit and rank of a card.
        int rank = rand.nextInt(1,14);
        int suit = rand.nextInt(1, 5);

        // Switch-Case block that assigns a rank base on the number generated.
        String rankString = switch (rank)
        {
            case 1 -> "Ace";
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            default -> "";
        };

        // Switch-Case block that assigns a suit base on the number generated.
        String suitString = switch (suit)
        {
            case 1 -> "Clubs";
            case 2 -> "Diamonds";
            case 3 -> "Hearts";
            case 4 -> "Spades";
            default -> "";
        };

        // Displays the card generated.
        if (rank == 1 || rank == 11 || rank == 12 || rank == 13)
            System.out.printf("\n%s of %s\n", rankString, suitString);
        else
            System.out.printf("\n%d of %s", rank, suitString);
    }
}
