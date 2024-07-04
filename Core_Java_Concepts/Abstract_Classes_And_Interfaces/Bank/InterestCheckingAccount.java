package Core_Java_Concepts.Abstract_Classes_And_Interfaces.Bank;

public class InterestCheckingAccount extends Account implements InterestBearingAccount
{
    public final double INTEREST_RATE = 0.03;

    /**
     * Instantiates a new InterestCheckingAccount.
     *
     * @param customerName The customer's Account name.
     * @param accountBalance The Account balance.
     */
    public InterestCheckingAccount(String customerName, double accountBalance)
    {
        super(customerName, accountBalance);
    }

    /**
     * This increases the current balance of the account by 3%.
     */
    @Override
    public void addInterest()
    {
        this.accountBalance = this.getAccountBalance() + this.getAccountBalance() * INTEREST_RATE;
    }
}
