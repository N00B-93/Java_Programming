package Objects_And_Classes.Tests;

/**
    This is a program that creates 10 Test Objects, adds them to an array, displays the information of 
    each of the Test Objects and then calculates the class average.
 */
public class Main
{
    public static void main(String[] args)
    {
        // Creates 10 Test Objects.
        Test test1 = new Test("Jack", "Johnson", 85, 83, 77, 91, 76);
        Test test2 = new Test("Lisa", "Aniston", 80, 90, 95, 93, 48);
        Test test3 = new Test("Andy", "Cooper", 78, 81, 11, 90, 73);
        Test test4 = new Test("Ravi", "Gupta", 92, 83, 30, 69, 87);
        Test test5 = new Test("Bonny", "Blair", 23, 45, 96, 38, 59);
        Test test6 = new Test("Danny", "Clark", 60, 85, 45, 39, 67);
        Test test7 = new Test("Samantha", "Kennedy", 77, 31, 52, 74, 83);
        Test test8 = new Test("Robin", "Bronson", 93, 94, 89, 77, 97);
        Test test9 = new Test("Sheila", "Sunny", 79, 85, 28, 93, 82);
        Test test10 = new Test("Kiran", "Smith", 85, 72, 49, 75, 63);

        // Creates a variable to hold the total average score.
        double totalAverageScore = 0;

        // Creates an array to hold all the Test Objects.
        Test[] tests = {test1, test2, test3, test4, test5, test6, test7, test8, test9, test10};

        // Displays each student's name, scores, average and grade.
        System.out.println("\nFirstName\tLastName\tTest1\tTest2\tTest3\tTest4\tTest5\tAverage\tGrade");
        for (Test test: tests)
        {
            System.out.println(test.toString());
            totalAverageScore += test.getAverageScore();
        }

        // Determines the class average.
        double classAverage = totalAverageScore / 10.0;

        // Displays the class average.
        System.out.printf("\nClass Average: %.2f\n", classAverage);
    }
}
