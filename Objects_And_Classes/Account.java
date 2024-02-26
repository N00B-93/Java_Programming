package Object_And_Classes;

import java.util.Date;

/**
 * The type Account.
 */
public class Account
{
	// Account class attributes.
	public int accountId = 0;
	public double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();

	// No-arg constructor.
	public Account(){}

	/**
	 * Instantiates a new Account.
	 *
	 * @param id  The Account id.
	 * @param balance The Account balance.
	 */
	public Account(int id, double balance)
	{
		accountId = id;
		this.balance = balance;
	}

	/**
	 * Gets account id.
	 *
	 * @return The account id.
	 */
	public int getAccountId()
	{
		return accountId;
	}

	/**
	 * Sets account id to the given value.
	 *
	 * @param id The id.
	 */
	public void setAccountId(int id)
	{
		accountId = id;
	}

	/**
	 * Gets balance.
	 *
	 * @return The Account balance.
	 */
	public double getBalance()
	{
		return balance;
	}

	/**
	 * Sets balance to the given value.
	 *
	 * @param balance The balance
	 */
	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	/**
	 * Sets interest rate to the given value.
	 *
	 * @param intRate The new interest rate.
	 */
	public void setInterestRate(double intRate)
	{
		annualInterestRate = intRate;
	}

	/**
	 * Gets interest rate.
	 *
	 * @return The interest rate.
	 */
	public double getInterestRate()
	{
		return annualInterestRate;
	}

	/**
	 * Gets monthly interest rate.
	 *
	 * @return The monthly interest rate.
	 */
	public double getMonthlyInterestRate()
	{
		return (annualInterestRate / 12);
	}

	/**
	 * Gets monthly interest.
	 *
	 * @return The monthly interest.
	 */
	public double getMonthlyInterest()
	{
		return (balance * getMonthlyInterestRate());
	}

	/**
	 * Withdraws a specified amount from the account.
	 *
	 * @param amount The amount to be withdrawn.
	 */
	public void withdraw(double amount)
	{
		if (balance >= amount)
		{
			balance = balance - amount;
			System.out.printf("\n$ %.2f Withdrawn Successfully!!\n", amount);
		}
		else
			System.out.printf("\nInsufficient Balance!!\n");
		return;
	}

	/**
	 * Deposits a specified amount to the Account.
	 *
	 * @param amount The amount to be deposited.
	 */
	public void deposit(double amount)
	{
		balance = balance + amount;
		System.out.printf("\n$ %.2f Successfully Deposited!!\n", amount);
	}
	
	public static void main(String[] args)
	{
		// Creates an Account Object.
		Account customer1 = new Account(1122, 20000);

		// Sets the interest rate to 0.045.
		customer1.setInterestRate(0.045);

		// Withdraws 2500 from the Account.
		customer1.withdraw(2500);

		// Deposits 3000 to the Account.
		customer1.deposit(3000);

		// Displays the current balance.
		System.out.printf("\nYour Current Balance is: $%.2f\n", customer1.getBalance());

		// Displays the monthly interest.
		System.out.printf("\nMonthly Interest Rate: $ %.2f\n", customer1.getMonthlyInterest());

		// Displays the date the Account was created.
		System.out.printf("\nDate Created: %s\n", customer1.dateCreated);
	}		
}
