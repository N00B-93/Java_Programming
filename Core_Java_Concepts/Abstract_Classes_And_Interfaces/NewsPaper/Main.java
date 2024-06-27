package Abstract_Classes_And_Interfaces.NewsPaper;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter the name an address of a physical subscriber and an online subscriber
    and then creates the objects of the OnlineNewsPaperSubscription and PhysicalNewsPaperSubscription classes and then
    displays the details of the two Objects.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner keyBoard = new Scanner(System.in);

        // Prompts the user to enter the name of a Physical subscriber.
        System.out.printf("\nEnter the name of a Physical Subscriber: ");
        String subscriberName = keyBoard.nextLine();

        // Creates an Object of the PhysicalNewsPaperSubscription class.
        PhysicalNewsPaperSubscription physicalNewsPaperSubscription = new PhysicalNewsPaperSubscription(subscriberName);

        // Prompts the user to enter the name of an Online subscriber.
        System.out.printf("\nEnter the name of an Online Subscriber: ");
        subscriberName = keyBoard.nextLine();

        // Creates an Object of an OnlineNewsPaperSubscriber class.
        OnlineNewsPaperSubscription onlineNewsPaperSubscription = new OnlineNewsPaperSubscription(subscriberName);

        // Prompts the user to enter the address of a Physical subscriber.
        System.out.printf("\nEnter the Physical Subscriber's address: ");
        String subscriberAddress = keyBoard.nextLine();

        // Sets the PhysicalNewsPaperSubscriber's address.
        physicalNewsPaperSubscription.setAddress(subscriberAddress);

        // Prompts the user to enter the address of a Physical subscriber.
        System.out.printf("\nEnter the Online Subscriber's address: ");
        subscriberAddress = keyBoard.nextLine();

        // Sets the OnlineNewsPaperSubscriber's address.
        onlineNewsPaperSubscription.setAddress(subscriberAddress);

        // Displays the Physical Subscriber's information.
        System.out.printf("\n\t\tPhysical NewsPaper Subscriber's Information: ");
        System.out.printf("\nName: %s\nAddress: %s\nRate: $ %.2f\n", physicalNewsPaperSubscription.getName(),
                physicalNewsPaperSubscription.getAddress(), physicalNewsPaperSubscription.getRate());

        // Displays the Online Subscriber's information.
        System.out.printf("\n\t\tOnline NewsPaper Subscriber's Information: ");
        System.out.printf("\nName: %s\nAddress: %s\nRate: $ %.2f\n", onlineNewsPaperSubscription.getName(),
                onlineNewsPaperSubscription.getAddress(), onlineNewsPaperSubscription.getRate());
    }
}
