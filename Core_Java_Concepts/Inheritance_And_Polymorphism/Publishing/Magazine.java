package Inheritance_And_Polymorphism.Publishing;

public class Magazine extends Publication
{
    // Attribute of a Magazine.
    protected PublicationUnit publicationUnit;

    public Magazine() {};  // No-arg constructor.

    /**
     * Instantiates a new Magazine.
     * @param publisher The name of the Magazine's publisher.
     * @param price The Magazine's price.
     * @param numberOfPages The number of pages in the Magazine.
     * @param title The Magazine's title.
     * @param publicationUnit The Magazine's publication unit(weekly, monthly or biweekly).
     */
    public Magazine(String publisher, double price, int numberOfPages, String title, PublicationUnit publicationUnit)
    {
        super(publisher, price, numberOfPages, title);
        this.publicationUnit = publicationUnit;
    }

    /**
     * Displays Information about a Magazine.
     */
    @Override
    public void printDetails()
    {
        super.printDetails();
        System.out.printf("Publication Unit: %s\n", this.publicationUnit);
    }
}
