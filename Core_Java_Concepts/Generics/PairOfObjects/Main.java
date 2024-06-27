package Generics;

/**
	This is a driver program for the Pair class.
*/

public class Main
{
    public static void main(String[] args)
    {
        // Create a Pair of Integers
        Pair<Integer> integerPair = new Pair<>(1, 2);
        System.out.println("\nInteger Pair: " + integerPair);

        // Create a Pair of Strings
        Pair<String> stringPair = new Pair<>("Hello", "World");
        System.out.println("\nString Pair: " + stringPair);

        // Modify the elements of the integer pair
        integerPair.setFirst(10);
        integerPair.setSecond(20);
        System.out.println("\nModified Integer Pair: " + integerPair);

        // Modify the elements of the string pair
        stringPair.setFirst("Goodbye");
        stringPair.setSecond("Everyone");
        System.out.println("\nModified String Pair: " + stringPair);
    }
}

