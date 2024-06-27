package Abstract_Classes_And_Interfaces.Bank;

public class PlatinumCheckingAccount extends InterestCheckingAccount
{
    /**
     * Instantiates a new PlatinumCheckingAccount.
     *
     * @param customerName The customer's Account name.
     * @param accountBalance The Account balance.
     */
    public PlatinumCheckingAccount(String customerName, double accountBalance)
    {
        super(customerName, accountBalance);
    }

    /**
     * This increases the current balance of the account by 6%.
     */
    @Override
    public void addInterest()
    {
        this.accountBalance = this.getAccountBalance() + (this.getAccountBalance() * this.INTEREST_RATE * 2);
    }
}
