package Core_Java_Concepts.Mathematical_Functions_Characters_And_Strings;

import java.util.Random;

/*
    This is a program that generate a plate number.
    Assume a vehicle plate number consists of three uppercase letters followed by four digits.
 */

public class GenerateVehiclePlateNumber
{
    public static void main(String[] args)
    {
        // Creates a Random Object.
        Random random = new Random();

        // Generates a four-digit number.
        int fourDigits = random.nextInt(1000, 10000);

        // Generates three characters.
        char character1 = (char) random.nextInt(65, 91);
        char character2 = (char) random.nextInt(65, 91);
        char character3 = (char) random.nextInt(65, 91);

        // Displays the result.
        System.out.printf("\nThe plate number is: %c%c%c%s\n", character1, character2, character3, ("" + fourDigits));
    }
}
