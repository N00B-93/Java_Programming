package Core_Java_Concepts.Abstract_Classes_And_Interfaces.Investment.BankAccount;

import Core_Java_Concepts.Abstract_Classes_And_Interfaces.Investment.Investment;

public abstract class BankAccount extends Investment
{
    // Attribute of a BankAccount.
    protected String accountNumber;
    protected double balance;

    /**
     * Instantiates a new BankAccount Object.
     *
     * @param name The name of a Bank.
     * @param accountNumber The account number of a BankAccount.
     */
    public BankAccount(String name, String accountNumber, double balance)
    {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Abstract addInterest method to be implemented by subclasses
    public abstract void addInterest();
}
