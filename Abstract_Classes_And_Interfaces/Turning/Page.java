package Abstract_Classes_And_Interfaces.Turning;

public class Page implements Turner
{
    /**
     * Displays a String that indicates that a Page Object is being turned.
     */
    @Override
    public void turn()
    {
        System.out.println("\nGoing to the next Page.");
    }
}
