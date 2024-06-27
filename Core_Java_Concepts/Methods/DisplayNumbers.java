package Methods;

/*
    This is a program that displays the number 1 - 100 by printing 10 numbers
    per line using a method with the header;
                    public static void printNumbers(int num1, int num2, int numberPerLine)
 */

public class DisplayNumbers
{
    public static void main(String[] args)
    {
        // Displays the numbers from 1 to 100 printing 10 digits per line.
        System.out.println("\nThe numbers from 1 to 100 are:");
        printNumbers(1, 100, 10);
    }

    /**
     * Displays numbers from a starting point to an end point printing a specified number of digits per line.
     *
     * @param num1 The starting point.
     * @param num2 The end point.
     * @param numberPerLine The number of digits to be displayed per line.
     */
    public static void printNumbers(int num1, int num2, int numberPerLine)
    {
        int lineCounter = 0;

        for (int i = num1; i <= num2; ++i)
        {
            System.out.printf("%d ", i);
            ++lineCounter;
            if (lineCounter % numberPerLine == 0)
                System.out.println();
        }
    }
}
