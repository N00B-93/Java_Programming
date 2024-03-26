package Inheritance_And_Polymorphism.TeeShirt;

import java.util.Arrays;
import java.util.Locale;
import java.text.NumberFormat;

/*
    This is a program that creates two object of a TeeShirt class and two Object of a CustomTee class and then displays
    information about each of the Objects.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creates two TeeShirt Objects.
        TeeShirt teeShirt1 = new TeeShirt(1024, "XXXL", "Sky Blue");
        TeeShirt teeShirt2 = new TeeShirt(2048, "M", "White");

        // Creates two CustomTee Objects.
        CustomTee customTee1 = new CustomTee(1101, "XXXL", "Red and Green",
                "Free Palestine");
        CustomTee customTee2 = new CustomTee(9296, "L", "Red and Blue",
                "Slava Russia");


        // Creates a NumberFormat Object.
        NumberFormat unitedState = NumberFormat.getCurrencyInstance(Locale.US);

        // Displays the properties of teeShirt1.
        System.out.printf("\nOrder Number: %d", teeShirt1.getOrderNumber());
        System.out.printf("\nSize: %s", teeShirt1.getSize());
        System.out.println("\nPrice: " + unitedState.format(teeShirt1.getPrice()));
        System.out.printf("Colour: %s\n", teeShirt1.getColour());

        // Displays the properties of teeShirt2.
        System.out.printf("\nOrder Number: %d", teeShirt2.getOrderNumber());
        System.out.printf("\nSize: %s", teeShirt2.getSize());
        System.out.println("\nPrice: " + unitedState.format(teeShirt2.getPrice()));
        System.out.printf("Colour: %s\n", teeShirt2.getColour());

        // Displays the properties of customTee1.
        System.out.printf("\nOrder Number: %d", customTee1.getOrderNumber());
        System.out.printf("\nSize: %s", customTee1.getSize());
        System.out.println("\nPrice: " + unitedState.format(customTee1.getPrice()));
        System.out.printf("Colour: %s", customTee1.getColour());
        System.out.printf("\nSlogan: %s\n", customTee1.getSlogan());

        // Displays the properties of customTee2.
        System.out.printf("\nOrder Number: %d", customTee2.getOrderNumber());
        System.out.printf("\nSize: %s", customTee2.getSize());
        System.out.println("\nPrice: " + unitedState.format(customTee2.getPrice()));
        System.out.printf("Colour: %s", customTee2.getColour());
        System.out.printf("\nSlogan: %s\n", customTee2.getSlogan());
    }
}
