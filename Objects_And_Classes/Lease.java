package Objects_And_Classes;

import java.util.Scanner;

/**
 * The type Lease.
 */
public class Lease
{
	// Attributes of a Lease Object.
	private String tenantName = "XXXX";
	private int apartmentNumber = 0;
	private double rent = 1000.0;
	private int term = 12;

	/**
	 * Instantiates a new Lease Object.
	 *
	 * @param tenantName The tenant's name.
	 * @param apartmentNumber The apartment number.
	 * @param rent The rent.
	 * @param term The term(number of months).
	 */
	public Lease(String tenantName, int apartmentNumber, double rent, int term)
	{
		this.tenantName = tenantName;
		this.apartmentNumber = apartmentNumber;
		this.rent = rent;
		this.term = term;
	}

	/**
	 * Sets the tenant's name to the given value.
	 *
	 * @param name The tenant's name.
	 */
	public void setName(String name)
	{
		this.tenantName = tenantName;
	}


	/**
	 * This returns the tenant's  name.
	 *
	 * @return The tenant's name.
	 */
	public String getName()
	{
		return this.tenantName;
	}


	/**
	 * Sets the tenant's apartment number to the given value.
	 *
	 * @param apartmentNumber The apartment number.
	 */
	public void setApartmentNumber(int apartmentNumber)
	{
		this.apartmentNumber = apartmentNumber;
	}


	/**
	 * This returns the apartment number of the tenant.
	 *
	 * @return The apartment number
	 */
	public int getApartmentNumber()
	{
		return this.apartmentNumber;
	}


	/**
	 * Sets the tenant's rent to the specified value.
	 *
	 * @param rentAmount The rent amount.
	 */
	public void setRent(double rentAmount)
	{
		this.rent = rentAmount;
	}


	/**
	 * This returns the rent of the apartment.
	 *
	 * @return The apartment's rent.
	 */
	public double getRent()
	{
		return this.rent;
	}


	/**
	 * Sets the term to the specified value.
	 *
	 * @param term The term(number of months).
	 */
	public void setTerm(int term)
	{
		this.term = term;
	}


	/**
	 * This returns the number of terms(months).
	 *
	 * @return The number of term.
	 */
	public int getTerm()
	{
		return this.term;
	}


	/**
	 * This adds a pet fee to the rent if the tenant has a pet.
	 */
	public void addPetFee()
	{
		this.rent += + 10.00;
		explainPetPolicy();
	}

	/**
	 * Explains the Lease pet policy.
	 */
	public void explainPetPolicy()
	{
		System.out.print("\nThe pet fee is an additional fee that is levied on tenant's with pets.\n\n");
	}

	/**
	 * This gives information about a Lease Object.
	 *
	 * @return A String description of the Lease Object.
	 */
	public String toString()
	{
		return "\nTenant Name: " + this.tenantName + "\n" + "Apartment Number: " + this.apartmentNumber + "\n" +
				"Rent: $ " + this.rent + "\n" + "Term: " + this.term;
	}


	public static void main(String args[])
	{
		
	}

}
