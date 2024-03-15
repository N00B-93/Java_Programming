package Abstract_Classes_And_Interfaces.ParkerUniversity;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
    This is a program that displays a menu prompting the user to either add an UnderGraduateStudent, a GraduateStudent
    or a StudentAtLarge to a list. When the user is done, he/she can exit the menu and the information of the students
    added to the list is then displayed in the screen.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object;
        Scanner keyBoard = new Scanner(System.in);

        // Creates an ArrayList of Student Objects;
        ArrayList<Student> students = new ArrayList<>(0);

        // Initializes variables to hold Student's name and ID.
        String fullName;
        int studentID;

        while (true)
        {
            // Prompts th user to select an option.
            System.out.print("""
                    \nWhat would you like to do?
                    \n1. Add UnderGraduate Student
                    \n2. Add Graduate Student
                    \n3. Add Student At Large
                    \n4. Exit
                    """);
            System.out.printf("\nSelect an Option: ");
            String option = keyBoard.nextLine();

            // Displays an error message if the user option is invalid.
            if (!"1234".contains(option))
            {
                System.out.println("\nInvalid input, Try again.");
                continue;
            }
            // Exits the program if user option is 4.
            else if (option.equals("4"))
            {
                // Exits the menu.
                System.out.println("\nExiting...");
                break;
            }

            try
            {
                // Prompts the user to enter his/her name.
                System.out.printf("\nEnter your full name: ");
                fullName = keyBoard.nextLine();

                // Prompts the user to enter his/her ID number.
                System.out.printf("\nEnter your Student ID number: ");
                studentID = keyBoard.nextInt();
            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.println("\nInvalid Student ID, Use a valid Student ID.");
                keyBoard.next();
                continue;
            }

            switch (option)
            {
                case "1":
                    try
                    {
                        // Creates an UnderGraduateStudent Object.
                        UnderGraduateStudent underGraduateStudent = new UnderGraduateStudent(fullName, studentID);

                        // Add the UnderGraduate Object to the array of Students.
                        students.add(underGraduateStudent);

                        // Displays a message to the user that the Student has been added.
                        System.out.println("\nUnderGraduate Student added Successfully.");
                    }
                    catch (InvalidStudentIDException invalidStudentIDException)
                    {
                        System.out.println(invalidStudentIDException.getMessage());
                    }
                    break;
                case "2":
                    try
                    {
                        // Creates a GraduateStudent Object.
                        GraduateStudent graduateStudent = new GraduateStudent(fullName, studentID);

                        // Add the GraduateStudent Object to the array of Students.
                        students.add(graduateStudent);

                        // Displays a message to the user that the Student has been added.
                        System.out.println("\nGraduate Student added Successfully.");
                    }
                    catch (InvalidStudentIDException invalidStudentIDException)
                    {
                        System.out.println(invalidStudentIDException.getMessage());
                    }
                    break;
                case "3":
                    try
                    {
                        // Creates a StudentAtLarge Object.
                        StudentAtLarge studentAtLarge = new StudentAtLarge(fullName, studentID);

                        // Add the StudentAtLarge Object to the array of Students.
                        students.add(studentAtLarge);

                        // Displays a message to the user that the Student has been added.
                        System.out.println("\nStudentAtLarge added Successfully.");
                    }
                    catch (InvalidStudentIDException invalidStudentIDException)
                    {
                        System.out.println(invalidStudentIDException.getMessage());
                    }
                    break;
            }
            keyBoard.nextLine();
        }

        if (students.size() != 0)
        {
            System.out.println("\n\t\tStudents Information.");
            // Displays all Student information.
            for (Student student : students)
            {
                System.out.printf("\nStudent's Name: %s", student.studentName);
                System.out.printf("\nStudent ID: %d", student.studentID);
                System.out.printf("\nTuition: $ %.2f\n", student.getTuition());
            }
        }
    }
}
