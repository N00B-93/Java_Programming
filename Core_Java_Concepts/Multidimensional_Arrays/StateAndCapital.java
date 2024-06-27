package Multidimensional_Arrays;

import java.util.Scanner;

/*
	This is a program that repeatedly prompts the user to enter a
    capital for a state. Upon receiving the user input, the program reports whether
    the answer is correct.
    The number of questions answered corrected is displayed at the end of the program.
 */

public class StateAndCapital
{
	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Creates a 2-D array to store states and their capitals.
		String[][] stateAndCapital = {
			{"abia", "umuahia"}, {"adamawa", "yola"}, {"akwa-ibom", "uyo"}, {"anambra", "awka"}, {"bauchi", "bauchi"},
				{"bayelsa", "yenagoa"}, {"benue", "makurdi"}, {"borno", "maiduguri"}, {"cross river", "calabar"},
				{"delta", "asaba"}, {"ebonyi", "abakaliki"}, {"edo", "benin city"}, {"ekiti", "ado ekiti"}, {"enugu", "enugu"},
				{"gombe", "gombe"}, {"imo", "owerri"}, {"jigawa", "dutse"}, {"kaduna", "kaduna"}, {"katsina", "katsina"},
				{"kano", "kano"}, {"kebbi", "birin kebbi"}, {"kogi", "lokoja"}, {"kwara", "ilorin"}, {"lagos", "ikeja"},
				{"niger", "minna"}, {"ogun", "abeokuta"}, {"ondo", "akure"}, {"osun", "osogbo"}, {"oyo", "ibadan"},
				{"plateau", "jos"}, {"rivers", "port harcourt"}, {"sokoto", "sokoto"}, {"taraba", "jalingo"},
				{"yobe", "damaturu"}, {"nasarawa", "lafia"}, {"zamfara", "gusau"}, {"FCT", "abuja"}
		};

		int row = 0, correct = 0;
		String answer = "";

		System.out.print("\n\t\tSTATE AND CAPITAL\n\n");
		for (; row < stateAndCapital.length; row++)
		{
			// Prompts the user to enter the capital of a state.
			System.out.printf("\nWhat is the capital of %s? ", stateAndCapital[row][0]);
			answer = input.nextLine();

			if (answer.equalsIgnoreCase(stateAndCapital[row][1]))
			{
				System.out.printf("\n%s is correct\n", answer);
				correct++;
			}
			else
			{
				System.out.printf("\n%s is wrong, the answer is: %s\n", answer, stateAndCapital[row][1]);
			}
		}
		// Displays the number of correct and wrong answers.
		System.out.printf("\nThe number of correct answers is: %d\nThe number of wrong answers is: %d\n", correct, 37 - correct);
	}
}
