package Abstract_Classes_And_Interfaces.Loan;

public class PersonalLoan extends Loan
{
    /**
     * Instantiates a new Personal loan Object.
     *
     * @param loanNumber The loan number.
     * @param term The term.
     * @param loanAmount The loan amount.
     * @param customerLastName The customer last name.
     * @param primeInterestRate The prime interest rate.
     */
    public PersonalLoan(int loanNumber, int term, double loanAmount, String customerLastName, double primeInterestRate)
    {
        super(loanNumber, term, loanAmount, customerLastName);
        this.interestRate = primeInterestRate + 2.0;
    }

    /**
     * This returns a string description of a Personal Object.
     *
     * @return String description of Personal Object.
     */
    @Override
    public String toString()
    {
        return "\nLoan Type: Personal Loan" + super.toString() + "\nInterest Rate: " + this.interestRate + "%";
    }
}
