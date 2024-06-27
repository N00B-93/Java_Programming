package Exception_Handling_And_Text_IO;

/*
    This is a simple command-line calculator. The program has an exception handler
    that deals with non-numeric operands. The program displays a message that informs the user of
    the wrong operand type before exiting.

 */

public class Calculator
{
    public static void main(String[] args)
    {
        try
        {
                if (args[1].equals("+"))  // Adds the integers if the symbol in the args array is '+'.
                {
                    System.out.printf("\n%d + %d = %d\n", Integer.parseInt(args[0]), Integer.parseInt(args[2]),
                            Integer.parseInt(args[0]) + Integer.parseInt(args[2]));
                }
                else if (args[1].equals("-"))  // Subtracts the integers if the symbol in the args array is '-'.
                {
                    System.out.printf("\n%d - %d = %d\n", Integer.parseInt(args[0]), Integer.parseInt(args[2]),
                            Integer.parseInt(args[0]) - Integer.parseInt(args[2]));
                }
                else if (args[1].equals("."))  // Multiply the integers if the symbol in the args array is '.'.
                {
                    System.out.printf("\n%d x %d = %d\n", Integer.parseInt(args[0]), Integer.parseInt(args[2]),
                            Integer.parseInt(args[0]) * Integer.parseInt(args[2]));
                }
                else if (args[1].equals("/"))  // Divide the result if the symbol in the args array is '/'.
                {
                    System.out.printf("\n%d / %d = %d\n", Integer.parseInt(args[0]), Integer.parseInt(args[2]),
                            Integer.parseInt(args[0]) / Integer.parseInt(args[2]));
                }
        }
        catch (NumberFormatException ex)  // Catches NumberFormatException and displays the invalid argument.
        {
            System.out.println("\nWrong input: " + ex.getMessage().split(":")[1]);
        }
    }
}
