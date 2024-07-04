package Core_Java_Concepts.Abstract_Classes_And_Interfaces.Bank;

import java.util.Random;

public abstract class Account
{
    // Attributes of an Account.
    protected String customerName;
    protected long accountNumber;
    protected double accountBalance;

    /**
     * Instantiates a new Account.
     *
     * @param customerName The customer's Account name.
     * @param accountBalance The Account balance.
     */
    public Account(String customerName, double accountBalance)
    {
        Random random = new Random();  // Creates a Random Object.

        this.customerName = customerName;
        this.accountBalance = accountBalance;
        this.accountNumber = random.nextLong(1_000_000_000L, 9_999_999_999L);
    }

    /**
     * This returns the name of the Account holder.
     *
     * @return The name of the Account holder.
     */
    public String getCustomerName()
    {
        return customerName;
    }

    /**
     * This returns the Account's current balance.
     *
     * @return The current Account balance.
     */
    public double getAccountBalance()
    {
        return accountBalance;
    }

    /**
     * This returns the Account's account number.
     *
     * @return The Account number.
     */
    public long getAccountNumber()
    {
        return accountNumber;
    }

    /**
     * Deposits a specific amount into an Account if the amount is > $0.0.
     *
     * @param amount The amount to be deposited.
     */
    public void deposit(double amount)
    {
        if (amount <= 0)
        {
            System.out.println("\nError: Amount to be deposited must be greater than $0.0, Try again.");
            return;
        }

        this.accountBalance = this.getAccountBalance() + amount;

        System.out.printf("\n$%.2f deposited successfully!\n\nCurrent Balance: $%.2f\n", amount, this.getAccountBalance());
    }

    public void withdraw(double amount)
    {
        if (this.getAccountBalance() == 0 || amount > this.getAccountBalance() || amount <= 0)
        {
            System.out.println("\nError: Insufficient balance, Please fund your Account and try again.\n");
            return;
        }

        this.accountBalance = this.getAccountBalance() - amount;

        System.out.printf("\n$%.2f withdrawn successfully!\n\nCurrent Balance: $%.2f\n", amount, this.getAccountBalance());
    }
}
