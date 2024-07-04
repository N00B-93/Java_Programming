package Core_Java_Concepts.Abstract_Classes_And_Interfaces.Bank;

public class NonInterestCheckingAccount extends Account
{
    /**
     * Instantiates a new NonInterestCheckingAccount.
     * @param customerName The customer's Account name.
     * @param accountBalance The Account balance.
     */
    public NonInterestCheckingAccount(String customerName, double accountBalance)
    {
        super(customerName, accountBalance);
    }
}
