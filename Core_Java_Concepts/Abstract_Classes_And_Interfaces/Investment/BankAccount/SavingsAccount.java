package Core_Java_Concepts.Abstract_Classes_And_Interfaces.Investment.BankAccount;

public class SavingsAccount extends BankAccount
{
    private double annualInterestRate; // Annual interest rate (e.g., 0.05 for 5%)

    /**
     * Instantiates a new SavingsAccount.
     *
     * @param name The name of the Account holder.
     * @param accountNumber The account number of the SavingsAccount.
     * @param balance The available balance in the SavingsAccount.
     * @param annualInterestRate The annual interest rate of the SavingsAccount.
     */
    public SavingsAccount(String name, String accountNumber, double balance, double annualInterestRate)
    {
        super(name, accountNumber, balance);
        this.annualInterestRate = annualInterestRate;
    }


    /**
     * Adds the interest to the balance quarterly.
     */
    @Override
    public void addInterest()
    {
        double quarterlyRate = annualInterestRate / 4;
        double interest = balance * quarterlyRate;
        balance += interest;
    }

    /**
     * This returns the amount of money present in the SavingsAccount.
     *
     * @return The available balance in the SavingsAccount.
     */
    public double getValue()
    {
        return this.balance;
    }

    /**
     * Displays information about a SavingsAccount.
     */
    public void displayData()
    {
        System.out.println("\nAccount Name: " + this.name + "\nAccount Number: " + this.accountNumber +
                "\nBalance: $" + this.balance + "\nAnnual Interest Rate: " + this.annualInterestRate + "%" +
                "\nTotal Value: $" + this.getValue());
    }
}
