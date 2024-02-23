package Multidimensional_Arrays;

import java.util.Random;

/*
	This is a program that generates a 6-by-6 two-dimensional matrix filled with 0s and 1s, displays 
	the matrix, and checks if every row and every column have an even number of 1s.
*/

public class EvenNumberOfOnes
{
	public static void main(String... args)
	{
		// Creates a Random Object.
		Random random = new Random();

		// Creates a 2-D 6x6 matrix.
		int[][] matrix = new int[6][6];

		
