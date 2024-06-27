package Abstract_Classes_And_Interfaces.Turning;

/*
    This is a program that creates the Objects of the Leaf, Page, and Pancake class, adds them to an array
    and calls the turn method of each Object.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creates an array Of Turner Objects.
        Turner[] turner = {new Leaf(), new Page(), new Pancake()};

        // Calls the turn method of each Object.
        for (Turner objects: turner)
           objects.turn();
    }
}
