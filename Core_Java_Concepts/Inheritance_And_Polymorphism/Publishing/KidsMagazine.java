package Inheritance_And_Polymorphism.Publishing;

public class KidsMagazine extends Magazine
{
    // Attribute of a KidsMagazine.
    protected String ageRange;

    /**
     * Instantiates a new KidsMagazine.
     * @param publisher The name of the KidsMagazine's publisher.
     * @param price The KidsMagazine's price.
     * @param numberOfPages The number of pages in the KidsMagazine.
     * @param title The KidsMagazine's title.
     * @param publicationUnit The KidsMagazine's publication unit(weekly, monthly or biweekly).
     * @param ageRange The recommended age range of the KidsMagazine.
     */
    public KidsMagazine(String publisher, double price, int numberOfPages, String title, PublicationUnit publicationUnit, String ageRange)
    {
        super(publisher, price, numberOfPages, title, publicationUnit);
        this.ageRange = ageRange;
    }

    /**
     * Displays Information about a KidsMagazine.
     */
    @Override
    public void printDetails()
    {
        super.printDetails();
        System.out.printf("Age Range: %s\n", this.ageRange);
    }
}
