package Core_Java_Concepts.Recursion;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter number of disks and then solves the Tower of Hanoi
    problem for that number of disks using recursion and also determines the number of moves needed to move the disks
    from the source to the destination.
 */

public class TowerOfHanoi
{
    // Static variable to hold the number of moves required.
    public static int numberOfMoves = 0;

    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input =new Scanner(System.in);

        // Prompts the user to enter the number of disks to be moved.
        System.out.printf("\nEnter the number of disks: ");
        int numberOfDisks = input.nextInt();

        // Makes a call to the recursive function.
        towerOfHanoi(numberOfDisks, 1, 2, 3);

        // Displays the number of moves.
        System.out.println("\nThe number of moves required to move the disks from the source rod to the destination rod" +
                " is: " + numberOfMoves);
    }

    /**
     * This solves the Tower of Hanoi problem recursively.
     * @param numberOfDisks The number of disks to be moved.
     * @param srcRod The source rod from which the disks are moved.
     * @param auxRod The auxiliary rod used for intermediate moves.
     * @param destRod The destination rod to which the disks are moved.
     */
    public static void towerOfHanoi(int numberOfDisks, int srcRod, int auxRod, int destRod)
    {
        if (numberOfDisks > 0)
        {
            numberOfMoves++;
            towerOfHanoi(numberOfDisks - 1, srcRod, destRod, auxRod);
            System.out.printf("\nMove disk %d from rod %d to rod %d\n", numberOfDisks, srcRod, destRod);
            towerOfHanoi(numberOfDisks - 1, auxRod, srcRod, destRod);
        }
    }
}
