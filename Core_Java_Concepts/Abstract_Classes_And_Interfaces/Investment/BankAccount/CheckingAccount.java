package Core_Java_Concepts.Abstract_Classes_And_Interfaces.Investment.BankAccount;

public class CheckingAccount extends BankAccount
{
    // Attributes of a ClearingAccount.
    private double minimumBalance;
    private double penalty;
    private double annualInterestRate; // Annual interest rate on excess balance

    /**
     * Instantiates a new CheckingAccount.
     *
     * @param name The account holder's name.
     * @param accountNumber The CheckingAccount account number.
     * @param balance The available balance in the CheckingAccount.
     * @param minimumBalance The minimum amount that should be available in the CheckingAccount.
     * @param penalty The amount to be paid
     * @param annualInterestRate The annual interest rate on the Checking account.
     */
    public CheckingAccount(String name, String accountNumber, double balance,
                           double minimumBalance, double penalty, double annualInterestRate)
    {
        super(name, accountNumber, balance);
        this.minimumBalance = minimumBalance;
        this.penalty = penalty;
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * Adds interest to a CheckingAccount.
     */
    @Override
    public void addInterest()
    {
        if (balance > minimumBalance)
        {
            double monthlyRate = annualInterestRate / 12;
            double excessBalance = balance - minimumBalance;
            double interest = excessBalance * monthlyRate;
            balance += interest;
        }
    }

    /**
     * Checks if the current balance is above the minimum balance and deducts a penalty from the available balance if
     * it is lower than the minimum balance.
     */
    public void checkBalance()
    {
        if (balance < minimumBalance)
            balance -= penalty;
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
     * Displays information about a CheckingAccount.
     */
    public void displayData()
    {
        System.out.println("\nAccount Name: " + this.name + "\nAccount Number: " + this.accountNumber +
                "\nBalance: $" + this.balance + "\nAnnual Interest Rate: " + this.annualInterestRate + "%" +
                "\nTotal Value: $" + this.getValue() + "\nMinimum Balance: $" + this.minimumBalance
        + "\nPenalty: $" + this.penalty);
    }
}
