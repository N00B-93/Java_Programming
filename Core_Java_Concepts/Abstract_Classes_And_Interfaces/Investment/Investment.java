package Abstract_Classes_And_Interfaces.Investment;

public abstract class Investment
{
    // Attributes of an Investment.
    protected String name;
    protected double value;

    // Abstract method getValue.
    public abstract double getValue();

    // Abstract method displayData.
    public abstract void displayData();

}
