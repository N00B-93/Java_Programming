package Objects_And_Classes.CarpetCalculator;

import java.util.Scanner;

/*
    This program prompts the user to enter the length and breadth of a room and the carpet cost
    and the calculates the total cost of the carpet.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner keyBoard = new Scanner(System.in);

        // Prompts the user to enter the dimension of the room and the cost per square feet of carpet.
        System.out.printf("\nEnter the length of the room: ");
        double length = keyBoard.nextDouble();

        System.out.printf("\nEnter the breadth of the room: ");
        double breadth = keyBoard.nextDouble();

        System.out.printf("\nEnter the cost of a sq.ft of the carpet: $ ");
        double carpetCost = keyBoard.nextDouble();

        // Creates a RoomCarpet Object.
        RoomCarpet roomCarpet= new RoomCarpet(new RoomDimension(length, breadth), carpetCost);

        // Displays the total cost of the carpet.
        System.out.printf("\nThe total cost of the carpet is: $ %.2f\n", roomCarpet.getTotalCost());
    }
}
