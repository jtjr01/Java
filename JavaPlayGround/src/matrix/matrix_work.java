/*
 * Name: Jose Terrones Jr.
 * Purpose: Program will ask user for the dimension of a square matrix.
 * It will do this for two matrixes and will perform the multiplication 
 * if the dimension are the same. After the calculation is completed the results 
 * are printed with the time it took to compute.
 */

package matrix;

import java.util.Scanner;

public class matrix_work {
	static Scanner name = new Scanner (System.in);
	static int h_line, v_line;
	static int matrix1[][] = new int [h_line][v_line];
	static int matrix2[][] = new int [h_line][v_line];
	static int matrix3[][] = new int [h_line][v_line];
	
	public static void ask_user()
	{
		long start, stop;
		System.out.println("Enter dimesion of the square matrix1:");
		int dimension = name.nextInt();
		h_line = dimension;
		v_line = h_line;
		matrix1 = new int [h_line][v_line];
		fill_values(matrix1, dimension);
		print(matrix1, dimension);
		System.out.println("Enter dimension of the square matrix2:");
		int dimension1 = name.nextInt();
		h_line = dimension1;
		v_line = h_line;
		matrix2 = new int [h_line][v_line];
		fill_values(matrix2, dimension1);
		print(matrix2, dimension1);
		matrix3 = new int [dimension][dimension1];
		System.out.println("Results are:");
		start = System.nanoTime();
		mult(matrix1, matrix2,matrix3, dimension,dimension1);
		print(matrix3,dimension);
		stop = System.nanoTime();
		long endtime0 = stop - start;
		double seconds0 = (double)endtime0 / 1000000000;
		System.out.println("Took : " + seconds0 + "sec");
		
	}
	//initializes the matrix with random numbers from 0 - 5
	public static void fill_values(int [][] matrix1, int dimension)
	{
		int i,j;
		for (i = 0; i < dimension; i++)
		{
			for (j = 0; j < dimension; j++)
			{
				matrix1[i][j] = (int) (Math.random() * 5);
			}
		}
	}
	//Will conduct the multiplication if dimensions match
	public static void mult(int [][]matrix1, int [][] matrix2, int [][] matrix3, int dimension, int dimension1)
	{
		int i,j,k;
		if (dimension == dimension1)
		{
			for (i = 0; i < dimension; i++)
			{
				for (j = 0; j < dimension1; j++)
				{
					matrix3[i][j] = 0;
					for (k = 0; k < dimension; k++)
					{
						matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
					}
				}
			}
		}
		else
		{
			System.out.println("Dimensions did not match");
			ask_user();
		}
	}
	public static void print(int [][] matrix1, int dimension)
	{
		int i,j;
		for (i = 0; i < dimension; i++)
		{
			System.out.print("[");
			for (j = 0; j < dimension; j++)
			{
				System.out.print(matrix1[i][j]);
				if(j < dimension - 1){
					System.out.print(" , ");
				}
			}
			System.out.println("]");
		}
		
	}

}
