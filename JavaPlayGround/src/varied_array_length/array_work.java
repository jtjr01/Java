/*
 * Name: Jose Terrones Jr.
 * Purpose: This program will make an array that has a set amount of rows but
 * each row has a varied length. After the first one is created, it 
 * is copied to another one and then added. At the end all three
 * are printed out.
 */

package varied_array_length;

import java.util.*;

public class array_work {
	Scanner name = new Scanner(System.in);
	private int rows = 0;
	private int array1[][] = new int[rows][];
	private int array2[][] = new int[rows][];
	private int array3[][] = new int[rows][];

	array_work() 
	{
	}
	//fill_array will reinitialize the rows after user input is given.
	//It will also fill in the length of each row also for array1, 
	//and its values can be filled in.
	public void fill_array() 
	{
		System.out.println("How many rows would you like? ");
		rows = name.nextInt();
		array1 = new int[rows][];
		array2 = new int[rows][];
		array3 = new int[rows][];
		for (int i = 0; i < array1.length; i++) 
		{
			array1[i] = new int[i + 1];
		}
		for (int i = 0; i < array1.length; i++)
		{
			for (int j = 0; j < array1[i].length; j++) 
			{
				System.out.println("Enter values for the first array's " + i + " row");
				array1[i][j] = name.nextInt();
			}
		}
	}
	//simply initializes the second array and copies the values of the first.
	public void copy_array()
	{
		for (int i = 0; i < array2.length; i++) 
		{
			array2[i] = new int[i + 1];
		}
		for (int i = 0; i < array2.length; i++)
		{
			for (int j = 0; j < array2[i].length; j++) 
			{
				array2[i][j] = array1[i][j];
			}
		}
	}
	//Initializes the third array and will add the two arrays 
	//and store the added value in this array.
	public void add_arrays()
	{
		for (int i = 0; i < array3.length; i++) 
		{
			array3[i] = new int[i + 1];
		}
		for (int i = 0; i < array2.length; i++)
		{
			for (int j = 0; j < array2[i].length; j++) 
			{
				array3[i][j] = array1[i][j] + array2[i][j];
			}
		}
	}
	public void print()
	{
		System.out.println("This is the first array");
		for (int i = 0; i < array1.length; i++)
		{
			for (int j = 0; j < array1[i].length; j++) 
			{
				System.out.print(array1[i][j] + " "); 
			}
			System.out.println(); 
		}
		System.out.println("This is the second array");
		for (int i = 0; i < array2.length; i++)
		{
			for (int j = 0; j < array2[i].length; j++) 
			{
				System.out.print(array2[i][j] + " "); 
			}
			System.out.println(); 
		}
		System.out.println("This is the two arrays added");
		for (int i = 0; i < array3.length; i++)
		{
			for (int j = 0; j < array3[i].length; j++) 
		{
			System.out.print(array3[i][j] + " "); 
		}
		System.out.println(); 
		}
	}

}
