package Selections;

import java.util.Scanner;

/*
    An ISBN-10 (International Standard Book Number) consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10,
    is a checksum, which is calculated from the other nine digits using the following formula:
        (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11.
    If the checksum is 10, the last digit is denoted as X according to the ISBN-10
    convention.
    This is a program that prompts the user to enter the first 9 digits and
    displays the 10-digit ISBN (including leading zeros).
 */

public class ISBN_10
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the first 9 digits of an ISBN-10 number.
        System.out.print("\nEnter the first 9 digit of an ISBN-10 number: ");
        int isbn9 = input.nextInt();

        // Stores the value of the number entered by the user to preserve its value.
        int tempVariable = isbn9;

        // Initializes d1 to 0 to cover the case where the number entered by the user has a leading 0.
        int d1 = 0;

        // Peels off each digit from the number entered by the user.
        int d9 = isbn9 % 10;
        isbn9 = (int) Math.floor(isbn9 / 10.0);

        int d8 = isbn9 % 10;
        isbn9 = (int) Math.floor(isbn9 / 10.0);

        int d7 = isbn9 % 10;
        isbn9 = (int) Math.floor(isbn9 / 10.0);

        int d6 = isbn9 % 10;
        isbn9 = (int) Math.floor(isbn9 / 10.0);

        int d5 = isbn9 % 10;
        isbn9 = (int) Math.floor(isbn9 / 10.0);

        int d4 = isbn9 % 10;
        isbn9 = (int) Math.floor(isbn9 / 10.0);

        int d3 = isbn9 % 10;
        isbn9 = (int) Math.floor(isbn9 / 10.0);

        int d2 = isbn9 % 10;
        isbn9 = (int) Math.floor(isbn9 / 10.0);

        d1 = isbn9 % 10;
        isbn9 = (int) Math.floor(isbn9 / 10.0);

        // Calculates the value of d10.
        int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        // Displays the result based on the leading number and the value of d10.
        if (d1 == 0 && d10 == 10)
            System.out.printf("\nThe ISBN-10 number is 0%dX\n", (tempVariable));
        else if (d1 == 0)
            System.out.printf("\nThe ISBN-10 number is 0%d\n", (tempVariable * 10) + d10);
        else if (d10 == 10)
            System.out.printf("\nThe ISBN-10 number is %dX\n", (tempVariable));
        else
            System.out.printf("\nThe ISBN-10 number is %d\n", (tempVariable * 10) + d10);
    }
}
