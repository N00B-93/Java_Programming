package Loops;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Creates a Random Object.
		Random random = new Random();

		// Creates a list of words to be displayed instead of images as in a normal slot machine.
		String[] words = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};

		// Prompts the user to enter how much he/she wants to bet.
		System.out.printf("\nPlease enter your bet: $ ");
		double bet = input.next.Double();



