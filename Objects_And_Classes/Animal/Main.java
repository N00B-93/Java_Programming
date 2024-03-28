package Objects_And_Classes.Animal;

import java.util.ArrayList;

/*
    This is a program that creates 3 Animal Objects, adds them to an ArrayList and displays information about each animal.
    The program also compares each animal with the other using the Animal class equals method.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creates 3 instances of an Animal.
        Animal fox = new Animal("Fox", 25, 75.21);
        Animal cow = new Animal("Cow", 125, 52.3);
        Animal rabbit = new Animal("Rabbit", 62, -10.31);

        // Creates an ArrayList of Animals
        ArrayList<Animal> animals = new ArrayList<>();

        // Adds all Animal Object to the list.
        animals.add(fox);
        animals.add(cow);
        animals.add(rabbit);

        // Displays information about each animal in the list.
        System.out.println("\n\t\tAnimal Information");
        for (Animal animal: animals)
        {
            System.out.println(animal.toString());
            System.out.printf("Is %s endangered? %b\n\n", animal.getSpecie(), animal.isEndangered());
        }

        // Compares animals based on their specie.
        System.out.printf("Is a %s the same as a %s? %b\n", fox.getSpecie(), cow.getSpecie(), fox.equals(cow));
        System.out.printf("\nIs a %s the same as a %s? %b\n", fox.getSpecie(), rabbit.getSpecie(), fox.equals(rabbit));
        System.out.printf("\nIs a %s the same as a %s? %b\n", cow.getSpecie(), rabbit.getSpecie(), cow.equals(fox));
    }
}
