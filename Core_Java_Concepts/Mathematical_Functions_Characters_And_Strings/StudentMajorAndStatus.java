package Core_Java_Concepts.Mathematical_Functions_Characters_And_Strings;

import java.util.Scanner;

/**
    This is a program that prompts the user to enter two characters and displays the major and status represented in the characters.
    The first character indicates the major and the second is the number character 1, 2, 3, 4, which indicates whether
    a student is a freshman, sophomore, junior, or senior.
 */

public class StudentMajorAndStatus
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner console = new Scanner(System.in);

        // Prompts the user to enter a major and a status code.
        System.out.println("\nMajor\nM: Mathematics\nC: Computer Science\nI: Information Technology");
        System.out.println("\nStatus Code\n1. Freshman\n2. Sophomore\n3. Junior\n4. Senior");
        System.out.printf("\nEnter a major and status code(e.g. M2): ");
        String majorAndStatusCode = console.next();

        // Displays an error message and terminates the program if the status code is not in the right format.
        if (majorAndStatusCode.length() != 2)
        {
            System.out.println("\nError: Major and status code must consist of 2 characters(an Uppercase alphabet and a number), Try again.\n");
            System.exit(1);
        }

        // Extracts the major and the status code.
        char major = majorAndStatusCode.charAt(0);
        char status = majorAndStatusCode.charAt(1);

        // Displays a major and a status based on user input.
        switch (major)
        {
            case 'M':
                if (status == '1')
                    System.out.println("\nMathematics Freshman.\n");
                else if (status == '2')
                    System.out.println("\nMathematics Sophomore.\n");
                else if (status == '3')
                    System.out.println("\nMathematics Junior.\n");
                else if (status == '4')
                    System.out.println("\nMathematics Senior.\n");
                else
                    System.out.println("\nError: Invalid status code.\n");
                break;
            case 'C':
                if (status == '1')
                    System.out.println("\nComputer Science Freshman.\n");
                else if (status == '2')
                    System.out.println("\nComputer Science Sophomore.\n");
                else if (status == '3')
                    System.out.println("\nComputer Science Junior.\n");
                else if (status == '4')
                    System.out.println("\nComputer Science Senior.\n");
                else
                    System.out.println("\nError: Invalid status code.\n");
                break;
            case 'I':
                if (status == '1')
                    System.out.println("\nInformation Technology Freshman.\n");
                else if (status == '2')
                    System.out.println("\nInformation Technology Sophomore.\n");
                else if (status == '3')
                    System.out.println("\nInformation Technology Junior.\n");
                else if (status == '4')
                    System.out.println("\nInformation Technology Senior.\n");
                else
                    System.out.println("\nError: Invalid status code.\n");
                break;
            default:
                System.out.println("\nError: Major code must be a single uppercase letter(M, C or I), Try again.\n");
                break;
        }
    }
}
