package Abstract_Classes_And_Interfaces.Insurance;

/*
    This is a program that creates the Object of a Life and Health Insurance class and then displays
    information of both Insurance Objects.
 */
public class Main
{
    public static void main(String[] args)
    {
        // Creates an Object of a Life Insurance class.
        Life life = new Life();

        // Creates an Object of a Health Insurance class.
        Health health = new Health();

        // Displays information of both Insurance Objects.
        life.display();
        health.display();
    }
}
