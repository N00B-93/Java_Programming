package Elementary_Programming;

/*
	A soft drink company recently surveyed 12,467 of its customers and found that approximately 14 percent of those surveyed 
	purchase one or more energy drinks per week. Of those customers who purchase energy drinks, approximately 64 percent of them prefer citrusflavored energy drinks. 
	This program displays the following:
		• The approximate number of customers in the survey who	purchase one or	more energy drinks per week.
		• The approximate number of customers in the survey who prefer citrus-flavored energy drinks.
*/

public class EnergyDrinkConsumption
{
	public static void main(String... args)
	{
		// Calculates the number of customers that purchases more than one energy drink.
		int customersPurchaseMoreThanOneEnergyDrink = 14 * 12_467 / 100;

		// Calculates the customer that prefers citrus flavoured drink.
		int customersPreferCitrusDrink = customersPurchaseMoreThanOneEnergyDrink * 64 / 100;
		
		// Displays the number of customers that purchased more than one drink and the customer that prefers citrus flavoured drink.
		System.out.printf("\nNumber of customers who purchased more than one energy drink: %d\n", customersPurchaseMoreThanOneEnergyDrink);
		System.out.printf("\nNumber of customers who preferred citrus flavoured drink: %d\n", customersPreferCitrusDrink);
	}
}

