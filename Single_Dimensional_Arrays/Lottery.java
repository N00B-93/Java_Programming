package Single_Dimensional_Arrays;

import java.util.Scanner;
import java.util.Random;

public class Lottery
{
	// Attribute of the Lottery class.
	protected int[] lotteryNumbers = new int[5];
	
	/**
	 * Instantiates a new Lottery object with an array of randomly generated numbers.
	 */
	public Lottery()
	{
		Random random = new Random();

		for (int i = 0; i < 5; i++)
			lotteryNumbers[i] = random(0, 10);
	}


