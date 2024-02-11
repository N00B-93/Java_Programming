package Single_Dimensional_Arrays;

import java.util.Arrays;

/*
	A school has 100 lockers and 100 students. All lockers
    are closed on the first day of school. As the students enter, the first student,
    denoted S1, opens every locker. Then the second student, S2, begins with the
    second locker, denoted L2, and closes every other locker. Student S3 begins
    with the third locker and changes every third locker (closes it if it was open,
    and opens it if it was closed). Student S4 begins with locker L4 and changes
    every fourth locker. Student S5 starts with L5 and changes every fifth locker,
    and so on, until student S100 changes L100.
    This is a program to determine the number of lockers open after all the
    students has passed through the building and changed the lockers.
 */

public class LockerPuzzle
{
	public static void main(String[] args)
	{
		// Creates an array of 101 boolean values representing lockers.
		boolean[] locker = new boolean[101];

		// Fills the locker array with false.
		Arrays.fill(locker, false);

		// Change the state of the 1st to 100th locker.
		for (int i = 1; i < locker.length; i++)
			changeLocker(locker, i);

		// Displays the number of the lockers that are open after all students has passed through the locker room.
		System.out.printf("\nThe lockers open after all student has passed is: ");
		for (int i = 0; i < locker.length; i++)
		{
			if (locker[i])
				System.out.printf("%d ", i);
		}

	}

	/**
	 * Open or closes lockers in the locker list based on the student number.
	 *
	 * @param locker Array of boolean values representing the state(open or close) of the lockers.
	 * @param studentNumber The student number.
	 */
	public static void changeLocker(boolean[] locker, int studentNumber)
	{
		int i = 0;

		if (studentNumber == 1)
		{
			i = 1;
			while (i < locker.length)
			{
				locker[i] = !locker[i];
				i++;
			}
		}
		else if (studentNumber == 1)
		{
			i = 2;
			while (i < locker.length) {
				locker[i] = !locker[i];
				i += 2;
			}
		}
		else
		{
			i = studentNumber;
			while (i < locker.length) {
				locker[i] = !locker[i];
				i += studentNumber;
			}
		}
	}
}
