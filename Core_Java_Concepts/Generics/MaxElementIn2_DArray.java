package Generics;

/*
    This is a program that uses a method with the header;
                public static <E extends Comparable<E>> E max(E[][] list)
    to find the maximum element of a 2-D Generic array.
 */

public class MaxElementIn2_DArray
{
    public static void main(String[] args)
    {
        // Creates a 2-D array of Integers.
        Integer[][] matrix1 =
                {
                        {5, 101, 65},
                        {17, 34, 901},
                        {44, 1076, 356}
        };

        // Creates a 2-D array of Strings.
        String[][] matrix2 =
                {
                        {"hard", "john", "baby"},
                        {"soft", "bread", "fang"},
                        {"cajole", "monk", "fig"}
        };

        // determines the maximum value in the array of Integers and Strings.
        Integer maximumValue = max(matrix1);
        String maximumValue2 = max(matrix2);

        // Displays the result.
        System.out.printf("\nThe Maximum element of Matrix1 is: %d\n", maximumValue);
        System.out.printf("\nThe Maximum element of Matrix2 is: %s\n", maximumValue2);
    }

    /**
     * Returns the maximum element in a 2-D Generic array.
     *
     * @param <E>  The type parameter
     * @param list The Array whose maximum element is to be determined.
     * @return The Maximum element of the 2-D Generic array.
     */
    public static <E extends Comparable<E>> E max(E[][] list)
    {
        E maximumValue = list[0][0];

        for (int row = 0; row < list[0].length; row++)
            for (int col = 0; col < list.length;col++)
            {
                if (list[row][col].compareTo(maximumValue) > 0)
                {
                    maximumValue = list[row][col];
                }
            }
        return maximumValue;
    }
}
