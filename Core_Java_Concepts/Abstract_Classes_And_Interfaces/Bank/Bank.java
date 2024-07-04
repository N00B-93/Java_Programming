package Core_Java_Concepts.Abstract_Classes_And_Interfaces.Bank;

import java.util.ArrayList;

public class Bank
{
    // Attribute of a bank.
    ArrayList<Account> accounts = new ArrayList<>();

    /**
     * Instantiates a new Bank Object.
     *
     * @param accounts The Accounts in the Bank.
     */
    public Bank(ArrayList<Account> accounts)
    {
        this.accounts = accounts;
    }

    /**
     * This returns the sum of all the Account balances in all account present in the Bank.
     *
     * @return The sum of all Account balances in the Bank.
     */
    public double totalAssets()
    {
        double sumOfBalances = 0.0;

        for (Account account: accounts)
            sumOfBalances += account.getAccountBalance();

        return sumOfBalances;
    }

    /**
     * Add interest to all InterestBearingAccounts.
     */
    public void addInterest()
    {
        for (Account account: accounts)
        {
            if (account instanceof InterestBearingAccount)
                ((InterestBearingAccount) account).addInterest();
        }
    }
}
