package Abstract_Classes_And_Interfaces.Turning;

public class Leaf implements Turner
{
    /**
     * Displays a String indicating that a Leaf Object is changing colour.
     */
    @Override
    public void turn()
    {
        System.out.println("\nLeaf Changing Colour.");
    }
}
