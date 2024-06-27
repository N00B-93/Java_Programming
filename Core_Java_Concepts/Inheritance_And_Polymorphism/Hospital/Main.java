package Inheritance_And_Polymorphism.Hospital;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
    This is a program that creates a Patient and a Doctor Object, stores them in an ArrayList
    and then loop through the ArrayList to display the information of each Object.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creates a Bill Object.
        Bill patientBill = new Bill(2536.55, 104.65, 366.95);

        // Creates an ArrayList of Persons.
        ArrayList<Person> persons = new ArrayList<>();

        // Creates a Patient Object.
        Patient patient = new Patient("Adebisi", "Demilade", 1144, 29,
                new Date(1994 - 1900, Calendar.DECEMBER, 1), new Date(2024 - 1900, Calendar.MAY, 10),
                new Date(2024 - 1900, Calendar.MAY, 11), "Dr. Marc Fernandez", patientBill);

        // Creates a Doctor Object.
        Doctor doctor = new Doctor("Marc", "Fernandez", "Gynecologist");

        // Adds the Patient and Doctor to the Person ArrayList.
        persons.add(patient);
        persons.add(doctor);

        // Displays information about all Person Object in the ArrayList.
        for (Person person: persons)
            System.out.println(person.toString());
    }
}
