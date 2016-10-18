/*
 * Name: Jose Terrones Jr.
 * Purpose: Will ask the user for a string and store it to an 
 * array by char characters. It will then copy and sort in alphabetical 
 * order and print the results of both arrays.
 */

package stringArrays;

import java.util.*;

public class work {
	Scanner name = new Scanner(System.in);
	private String word;
	private char array[] = new char [0];
	private char array2[] = new char [0];
	work()
	{
	}
	public void ask_user()
	{
		System.out.println("Please enter a string: ");
		word = name.nextLine();
	}
	//reinitialize the array with the strings length
	public void store()
	{
		array = new char [word.length()];
		array = word.toCharArray();
	}
	//reinitialize the second array with the strings length
	//then it will copy the values from the first to the second
	public void copy()
	{
		array2 = new char [(word.length())];
		for(int i = 0; i < word.length(); i++)
		{
			array2[i] = array[i];
		}
	}
	//the second array is sorted
	public void sort()
	{
		Arrays.sort(array2);
	}
	//prints the array of each one
	public void print()
	{
		System.out.println("The original array is as follows:");
		for(int i = 0; i < word.length(); i++)
		{
			System.out.println(array[i] + " at index " + i);
		}
		System.out.println();
		System.out.println("Sorted array is as follows:");
		for(int i = 0; i < word.length(); i++)
		{
			System.out.println(array2[i] + " at index " + i);
		}
	}
}
