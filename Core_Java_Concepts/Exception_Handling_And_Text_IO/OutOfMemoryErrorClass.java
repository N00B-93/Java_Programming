package Exception_Handling_And_Text_IO;

/*
    This is a program that causes the JVM to throw an
    OutOfMemoryError and catches and handles this error.
 */

public class OutOfMemoryErrorClass
{
    public static void main(String... args)
    {
        try
        {
            // Throws an OutOfMemoryError error.
            throw new OutOfMemoryError("\nOut of memory!");
        }
        catch (OutOfMemoryError err)
        {
            // Handles the error by displaying an error message.
            System.out.println(err.getMessage());
        }
    }
}
