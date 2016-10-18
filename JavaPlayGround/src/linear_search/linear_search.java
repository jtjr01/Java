/*
 * Name: Jose Terrones Jr.
 * Purpose: This class will create two arrays that will have random numbers
 * inserter into a fix sized array. It will also have a search function with
 * a timer to show how long the search and user input took for each array.
 */

package linear_search;

import java.util.Scanner; 

public class linear_search {
	static int limit = 50;
	static int limit1 = 500; 
	static int array [] = new int [limit];
	static int array1 [] = new int [limit1];
	static Scanner name = new Scanner (System.in);
	static long start;
	
	public static void initialize()
	{
		int i;
		for (i = 0; i < limit; i++)
		{
			array[i] = (int) (Math.random() * 2000);
		}
		print(array, limit);
		start = System.nanoTime();
		ask_user(array, limit);
		long endtime0 = System.nanoTime() - start;
		double seconds0 = (double)endtime0 / 1000000000.0;
		System.out.println("Took : " + seconds0 + "sec");
		
	}
	public static void initialize1()
	{
		int i;
		for (i = 0; i < limit1; i++)
		{
			array1[i] = (int) (Math.random() * 2000);
		}
		print(array1, limit1);
		start = System.nanoTime();
		ask_user(array1, limit1);
		long endtime0 = System.nanoTime() - start;
		double seconds1 = (double)endtime0 / 1000000000.0;
		System.out.println("Took : " + seconds1 + "sec");
	}
	public static void ask_user(int [] array, int limit)
	{
		System.out.println("Enter a number to search");
		int numb = name.nextInt();
		if (!search(array, numb, limit))
		{
			not_found(array, numb, limit);
		}
		
	}
	public static boolean search(int [] array, int numb, int limit)
	{
		for (int i = 0; i < limit; i++)
		{
			if (numb == array[i])
			{
				System.out.print("Numbers match at index " + i);
				System.out.println("");
				return true;
			}
		}
		return false;
	}
	public static void not_found (int [] array, int numb, int limit)
	{
		System.out.println("Number does not match");
		ask_user(array, limit);
	}
	public static void print(int [] array, int limit)
	{
		int i;
		for (i = 0; i < limit; i++)
		{
			System.out.print(array[i] + " , ");
		}
		System.out.println("");
	}
}
