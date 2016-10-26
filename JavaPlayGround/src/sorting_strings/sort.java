/*
 * Name: Jose Terrones Jr.
 * Purpose: This class will handle the string that is entered
 * and delete the white space and store each word into an array.
 * After it has sorted the array it will display the result and then
 * it will upper case each letter and then display the results again.
 */

package sorting_strings;

import java.util.*;

public class sort {
	private String string = "0";
	private String array [];
	private Scanner name = new Scanner(System.in);
	sort()
	{
	}
	public String getString()
	{
		System.out.println("Enter a set of words");
		string = name.nextLine();
		System.out.println("Original: ");
		System.out.println(string);
		return string;
	}
	//deletes the white space and places the words in an array
	public void convert()
	{
		array = string.split(" ");
	}
	//will sort the array and print its sorted values
	public void sort()
	{
		Arrays.sort(array);
		System.out.println("After sort:");
		for(int i = 0;i<array.length;i++)
		{
		  System.out.print(array[i] + " ");
		}
		upper();
	}
	//this method will do the upper casing of the set of words and 
	//print it
	public void upper()
	{
		Arrays.toString(array).toUpperCase();
		System.out.println(" ");
		System.out.println("After upper case:");
		for(int i = 0;i<array.length;i++)
		{
		  System.out.print(array[i].toUpperCase() + " ");
		}
	}
}
