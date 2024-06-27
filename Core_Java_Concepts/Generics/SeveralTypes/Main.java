package Core_Java_Concepts.Generics.SeveralTypes;

/**
    This is a driver program to test the functionality of the SeveralType class.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Example 1: Integer and String types
        SeveralType<Integer, String> obj1 = new SeveralType<>(10, "Hello");
        System.out.println("\nObject 1:");
        System.out.println("First value: " + obj1.getFirst());
        System.out.println("Second value: " + obj1.getSecond());

        // Modify values
        obj1.setFirst(20);
        obj1.setSecond("World");
        System.out.println("\nModified Object 1:");
        System.out.println(obj1);

        // Example 2: Double and Boolean types
        SeveralType<Double, Boolean> obj2 = new SeveralType<>(3.14, true);
        System.out.println("\nObject 2:");
        System.out.println("First value: " + obj2.getFirst());
        System.out.println("Second value: " + obj2.getSecond());

        // Modify values
        obj2.setFirst(2.71);
        obj2.setSecond(false);
        System.out.println("\nModified Object 2:");
        System.out.println(obj2);
    }
}
