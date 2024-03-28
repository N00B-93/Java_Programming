package Abstract_Classes_And_Interfaces.Student;

import java.util.Arrays;

/*
    This is a program that creates an Array of 5 Student Objects, sorts them according to their last names and
    then displays the sorted Students and their Student IDs.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creates an Array to store Students.
        Student[] students = {new Student("Adebisi", 1148),
                new Student("Oriloye", 1147), new Student("Alabeni", 1146),
                new Student("Okon", 1145), new Student("Agwu", 1144)};

        // Sorts the students based on their last names.
        Arrays.parallelSort(students);

        // Displays the Students sorted in order of increasing student last name.
        System.out.println("\n\t\tStudent Details");
        System.out.println("\nStudent Name\t\tStudent ID");
        for (Student student: students)
            System.out.printf("%s\t\t\t%14d\n", student.getLastName(), student.getStudentID());
    }
}
