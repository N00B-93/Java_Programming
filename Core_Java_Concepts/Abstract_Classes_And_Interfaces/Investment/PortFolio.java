package Core_Java_Concepts.Abstract_Classes_And_Interfaces.Investment;

import java.util.ArrayList;

public class PortFolio
{
    // Attribute of a PortFolio.
    ArrayList<Investment> investments;

    /**
     * Instantiates a New PortFolio
     *
     * @param investments A list of Investments to be added to the PortFolio.
     */
    public PortFolio(ArrayList<Investment> investments)
    {
        this.investments = investments;
    }

    /**
     * This determines and returns the total value of all Investment present in the PortFolio.
     *
     * @return The total value of all Investment present in the PortFolio.
     */
    public double getNetValue()
    {
        double totalValue = 0.0;

        for (Investment investment: this.investments)
            totalValue += investment.getValue();
        return totalValue;
    }
}
