package Core_Java_Concepts.Selections;

import java.util.Random;
import java.util.Scanner;

/*
    This is a program that lets the user guess whether the flip of
    a coin results in heads or tails. The program randomly generates an integer 0 or 1,
    which represents head or tail. The program prompts the user to enter a guess and
    reports whether the guess is correct or incorrect.
 */

public class HeadsOrTails
{
    public static void main(String[] args)
    {
        // Creates a Scanner and a Random Object.
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Generates a random number.
        int randomNumber = rand.nextInt(2);

        // Initializes a string variable representing coin side based on number generated.
        String coinSide;

        // Assigns a choice for coin side based on number generated.
        coinSide = switch (randomNumber)
        {
            case 0 -> "Head";
            case 1 -> "Tail";
            default -> "";
        };

        // Prompts the user to enter '0' or '1'.
        System.out.print("\nEnter 0 or 1 ('0' represents Head and '1' represents Tail): ");
        int userChoice = input.nextInt();

        // Displays an error message and terminates the program if the user enters a number less than 0 or greater than 1.
        if (userChoice < 0 || userChoice > 1)
        {
            System.out.println("\nError: User choice must be '0' or '1', Try again.");
            System.exit(1);
        }

        // Initializes a string variable representing coin side based on user input.
        String userCoinSide;

        // Assigns a choice for coin side based on user input.
        userCoinSide = switch (userChoice)
        {
            case 0 -> "Head";
            case 1 -> "Tail";
            default -> "";
        };

        // Displays the result based on user and COM choice.
        if (coinSide.equals(userCoinSide))
            System.out.printf("\nCorrect Guess!\nYou played %s and COM plays %s\n", userCoinSide, coinSide);
        else
            System.out.printf("\nWrong Choice!\nYou played %s and COM plays %s\n", userCoinSide, coinSide);
    }
}
