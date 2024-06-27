package Inheritance_And_Polymorphism.Publishing;

import java.util.Arrays;

/**
    This is a driver program for the Publishing project.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creates an Array of 10 Publication Objects.
        Publication[] publications = new Publication[10];

        // Adds 10 Publication Objects to the Array.
        publications[0] = new Book("Penguin Books", 19.99, 300, "The Great Gatsby", "F. Scott Fitzgerald");
        publications[1] = new Magazine("National Geographic", 5.99, 120, "July 2024", PublicationUnit.MONTHLY);
        publications[2] = new KidsMagazine("Disney", 3.99, 50, "Frozen Adventures", PublicationUnit.MONTHLY, "4-8 years");
        publications[3] = new Book("HarperCollins", 24.99, 450, "To Kill a Mockingbird", "Harper Lee");
        publications[4] = new Magazine("Time", 4.99, 80, "June 2024", PublicationUnit.WEEKLY);
        publications[5] = new Book("Simon & Schuster", 14.99, 320, "1984", "George Orwell");
        publications[6] = new KidsMagazine("Nickelodeon", 2.99, 40, "SpongeBob Adventures", PublicationUnit.MONTHLY, "6-10 years");
        publications[7] = new Magazine("Sports Illustrated", 6.99, 64, "Summer Special", PublicationUnit.MONTHLY);
        publications[8] = new Book("Random House", 12.99, 280, "The Catcher in the Rye", "J.D. Salinger");
        publications[9] = new Magazine("Cosmopolitan", 3.99, 100, "Fashion Issue", PublicationUnit.MONTHLY);

        // Print the titles of the Publications before sorting.
        int line = 1;
        System.out.println("\nTitles before sorting: ");
        for (Publication publication: publications)
        {
            System.out.println(line + ". " + publication.title);
            ++line;
        }

        // Displays a new line.
        System.out.println();

        // Sorting publications by title using Comparable interface
        Arrays.sort(publications);

        // Print the titles of the Publications after sorting.
        line = 1;
        System.out.println("\nTitles after sorting: ");
        for (Publication publication: publications)
        {
            System.out.println(line + ". " + publication.title);
            ++line;
        }

        // Printing information using polymorphism
        for (Publication publication : publications)
        {
            publication.printDetails();
            System.out.println();
        }
    }
}
