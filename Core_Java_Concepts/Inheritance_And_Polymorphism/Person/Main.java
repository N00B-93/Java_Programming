package Inheritance_And_Polymorphism.Person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;

/**
    This is a program that creates a Person, Student, Employee, Staff and FacultyMember objects, adds 
    them to a list of People and the call the toString methods of each of the Objects.
*/

public class Main
{
    public static void main(String[] args)
    {
        // List to hold People.
        List<Person> people = new ArrayList<>();

        // Creating instances with "date hired" values 2 years apart and adding them to the list
        people.add(new Person("John Doe", "123 Main St", "555-1234", "john@example.com"));
        people.add(new Student("Alice Smith", "456 Elm St", "555-5678", "alice@example.com",
                ClassStatus.JUNIOR));

        // Creating a calendar instance and setting it to the current date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        // Adding 2 years to the current date for each employee
        calendar.add(Calendar.YEAR, -2); // Subtracting 2 years

        people.add(new Employee("Bob Johnson", "789 Oak St", "555-9012",
                "bob@example.com", "Office 101", 50000, calendar.getTime()));

        // Adding another 2 years
        calendar.add(Calendar.YEAR, -2); // Subtracting 2 more years

        people.add(new FacultyMember("Jane Brown", "246 Pine St", "555-3456",
                "jane@example.com", "Office 202", 60000, calendar.getTime(),
                "Professor", "9am - 5pm"));

        // Adding another 2 years
        calendar.add(Calendar.YEAR, -2); // Subtracting 2 more years

        // Add a Staff member to the list of People.
        people.add(new Staff("Mike Wilson", "135 Cedar St", "555-7890",
                "mike@example.com", "Office 303", "Mr.", 40000, calendar.getTime()));

        // Printing out the objects using toString() method
        for (Person person : people)
        {
            System.out.println(person);
        }
    }
}
