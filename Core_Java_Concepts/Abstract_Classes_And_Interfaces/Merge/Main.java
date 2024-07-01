package Core_Java_Concepts.Abstract_Classes_And_Interfaces.Merge;

import java.util.ArrayList;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        // Creates 3 ArrayList to hold the lottery numbers played by each Player.
        ArrayList<Integer> numberList1 = new ArrayList<>();
        ArrayList<Integer> numberList2 = new ArrayList<>();
        ArrayList<Integer> numberList3 = new ArrayList<>();

        // Adds 10 randomly generated integers into the three ArrayList of Integers.
        generateLotteryNumbers(numberList1);
        generateLotteryNumbers(numberList2);
        generateLotteryNumbers(numberList3);

        try
        {
            // Creates three Integer set Objects.
            IntegerSet player1 = new IntegerSet(numberList1);
            IntegerSet player2 = new IntegerSet(numberList2);
            IntegerSet player3 = new IntegerSet(numberList3);

            // Merges the three created IntegerSet Objects into a new IntegerSet.
            IntegerSet mergedIntegerSet = player3.merge(player2.merge(player1));

            // Displays the content of the ArrayLists.
            System.out.println("\nLottery Numbers played by player 1: ");
            player1.printElements();
            System.out.println("\nLottery Numbers played by player 2: ");
            player2.printElements();
            System.out.println("\nLottery Numbers played by player 3: ");
            player3.printElements();

            // Displays the elements of the merged IntegerSet.
            System.out.println("\nThe Lottery numbers played by all players: ");
            mergedIntegerSet.printElements();

            // Displays the total cost of playing all the Lottery numbers.
            System.out.printf("\nTotal cost of playing all numbers: $%d\n", mergedIntegerSet.size());
        }
        catch (ClassCastException ex)
        {
            System.out.println("\nArgument of the merge method must be of type IntegerSet");
            System.exit(1);
        }
    }

    /**
     * Randomly generates 10 integers between 1 and 1000000 and adds them to an ArrayList of Integers.
     *
     * @param lotteryNumberList An ArrayList of Integers.
     */
    public static void generateLotteryNumbers(ArrayList<Integer> lotteryNumberList)
    {
        Random random = new Random();

        for (int i = 0; i < 10; ++i)
            lotteryNumberList.add(random.nextInt(1, 1_000_001));
    }
}
