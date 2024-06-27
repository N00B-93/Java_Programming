package Multidimensional_Arrays;

/*
	The weekly hours for all employees are stored in a table as shown below;

                        Su M T W Th F Sa
                Employee 0 2 4 3 4 5 8 8
                Employee 1 7 3 4 3 3 4 4
                Employee 2 3 3 4 3 3 2 2
                Employee 3 9 3 4 7 3 4 1
                Employee 4 3 5 4 3 6 3 8
                Employee 5 3 4 4 6 3 4 4
                Employee 6 3 7 4 8 3 8 4
                Employee 7 6 3 5 9 2 7 9
    This program displays employees and their total hours in decreasing order of the total hours.
 */

public class WeeklyHours
{
	public static void main(String[] args)
	{
		// Creates a 2-D array that stores each employee hours.
		int[][] Employee = 
		{
			{0, 2, 4, 3, 4, 5, 8, 8},
			{1, 7, 3, 4, 3, 3, 4, 4},
			{2, 3, 3, 4, 3, 3, 2, 2},
			{3, 9, 3, 4, 7, 3, 4, 1},
			{4, 3, 5, 4, 3, 6, 3, 8},
			{5, 3, 4, 4, 6, 3, 4, 4},
			{6, 3, 7, 4, 8, 3, 8, 4},
			{7, 6, 3, 5, 9, 2, 7, 9}
	
		};

		// 1-D array that stores the index of the 1-D array that holds each employee's weekly hours.
		int employeeIndex[] = {1, 2 ,3, 4, 5, 6, 7, 8};

		// 1-D array that holds the total weekly hours for each employee.
		int total[] = new int[8];

		// Calculates the total weekly hours for each employee.
		for (int i = 0; i < Employee.length; i++)
		{
			for (int j = 0; j < Employee[i].length; j++)
			{
				total[i] += Employee[i][j];
			}
		}

		// Sorts the total weekly hours and employee index in descending order.
		for (int pass = 0; pass < total.length; pass++)
		{
			for (int i = 0; i < total.length - 1; i++)
			{
				if (total[i] < total[i + 1])
				{
					int temp1 = employeeIndex[i];
					employeeIndex[i] = employeeIndex[i + 1];
					employeeIndex[i + 1] = temp1;

					int temp2 = total[i];
					total[i] = total[i + 1];
					total[i + 1] = temp2;
				}
			}

		}

		// Displays the employees and their total weekly hours in descending order.
		for (int i = 0; i < total.length; i++)
		{
			System.out.printf("\nEmployee %d's total hours is: %d\n", employeeIndex[i], total[i]);
		}
	}
}
