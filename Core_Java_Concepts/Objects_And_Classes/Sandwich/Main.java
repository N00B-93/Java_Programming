package Objects_And_Classes.Sandwich;

/**
        This is a driver program that tests the functionalities of the Sandwich class.
 */
public class Main
{
    public static void main(String[] args)
    {
        // Test 1: Creating a Sandwich with constructor
        System.out.println("\nTest 1: Creating a Sandwich with constructor");
        Sandwich sandwich1 = new Sandwich("Turkey", "Wheat", 5.99);
        printSandwichDetails(sandwich1);

        // Test 2: Modifying Sandwich using setters
        System.out.println("\nTest 2: Modifying Sandwich using setters");
        sandwich1.setMainIngredient("Chicken Salad");
        sandwich1.setBreadType("Multigrain");
        sandwich1.setPrice(6.49);
        printSandwichDetails(sandwich1);

        // Test 3: Creating a Sandwich with empty constructor and setting values
        System.out.println("\nTest 3: Creating a Sandwich with empty constructor and setting values");
        Sandwich sandwich2 = new Sandwich();
        sandwich2.setMainIngredient("Roast Beef");
        sandwich2.setBreadType("Rye");
        sandwich2.setPrice(7.25);
        printSandwichDetails(sandwich2);
    }

    /**
     * Displays the details of a Sandwich.
     *
     * @param sandwich The Sandwich whose details is to be displayed.
     */
    private static void printSandwichDetails(Sandwich sandwich)
    {
        System.out.println("Main Ingredient: " + sandwich.getMainIngredient());
        System.out.println("Bread Type: " + sandwich.getBreadType());
        System.out.println("Price: $" + sandwich.getPrice());
    }
}
