package Abstract_Classes_And_Interfaces.Turning;

public class Pancake implements Turner
{
    /**
     * Display a String indicating a Pancake Object being Turned.
     */
    @Override
    public void turn()
    {
        System.out.println("\nFlipping Pancake.");
    }
}
