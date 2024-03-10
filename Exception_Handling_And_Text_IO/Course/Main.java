package Exception_Handling_And_Text_IO.Course;

import java.util.ArrayList;
import java.util.Scanner;

/*
    This is a program that creates an ArrayList to store course and the prompts the user to enter the details
    of a course and add it to the ArrayList if the details certifies the specifies conditions, else the Object is not
    added to the list.
    After this, all the Course Object's details are the displayed.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner keyBoard = new Scanner(System.in);

        // Creates an ArrayList of Course Object.
        ArrayList<Course> courses = new ArrayList<>();

        int counter = 0;

        while (counter != 6)
        {
            try
            {
                // Prompt the user to enter the Course Name.
                System.out.printf("\nEnter course[%d] Name(e.g., XXX): ",  counter + 1);
                String courseName = keyBoard.next();

                // Prompt the user to enter the Course Number.
                System.out.printf("\nEnter course[%d] Number(100 - 499): ", counter + 1);
                int courseNumber = keyBoard.nextInt();

                // Prompt the user to enter the Course Number of Credits.
                System.out.printf("\nEnter course [%d] Number of Credits(0.5 - 6): ", counter + 1);
                double numberOfCredits = keyBoard.nextDouble();

                // Creates a new Course Object.
                Course course = new Course(courseName, courseNumber, numberOfCredits);

                // Adds the newly created course to the ArrayList of Courses.
                courses.add(course);

                // Increments counter by 1.
                counter++;
            }
            catch (CourseException courseException)
            {
                System.out.println(courseException.getMessage());
            }
        }

        // Displays the courses that were successfully created.
        System.out.println("\n\t\tCourses Information");
        for (Course course: courses)
        {
            System.out.printf("\nCourse Name: %s\nCourse Number: %d\nNumber of Credits: %.2f\n", course.department,
                    course.courseNumber, course.numberOfCredits);
        }
    }
}
