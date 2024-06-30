package Core_Java_Concepts.Selections;

import java.util.Scanner;

/*
	A box of cookies can hold 24 cookies and a container can hold 75 boxes of cookies.
	This is a program that prompts the user to enter the total number of cookies. The program then outputs the number of boxes and the number of containers to ship the cookies.
	If the last box of cookies contains less than the number of specified cookies, it is discarded, and the number of leftover cookies is displayed. 
	Similarly, if the last container contains less than the number of specified boxes, it is discarded, and the number of the number of leftover boxes is displayed.
*/

public class CookiePackaging
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner console = new Scanner(System.in);

		// Prompts the user to enter the number of cookies to be packaged.
		System.out.print("\nEnter the number of cookies to be packaged: ");
		int numberOfCookies = console.nextInt();

		// Closes the Scanner.
		console.close();

		// Displays an error message and terminates the program if the user enters a negative number of cookies.
		if(numberOfCookies < 0)
		{
			System.out.println("\nError: Number of cookies should be non-negative, Try again.");
			System.exit(1);
		}

		// Determines the number of boxes.
		int numberOfBoxes = numberOfCookies / 24;

		// Determines the number of cookies remaining.
		int remainingCookies = numberOfCookies % 24;

		// Determines the number of containers.
		int numberOfContainers = numberOfBoxes / 75;

		// Determines the number of boxes remaining.
		int remainingBoxes = numberOfBoxes % 75;

		// Displays the result.
		System.out.printf("\nNumber of boxes needed: %d", numberOfBoxes);
		System.out.printf("\nNumber of containers needed: %d", numberOfContainers);
		System.out.printf("\nNumber of leftover cookies: %d", remainingCookies);
		System.out.printf("\nNumber of leftover boxes: %d\n", remainingBoxes);
	}
}

