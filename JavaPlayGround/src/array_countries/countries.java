/*
 * Name: Jose Terrones Jr.
 * Purpose: Handles the operations done to the array.
 * Add, add to a specific location, and delete at a specific locaiton.
 */

package array_countries;

import java.util.*;

public class countries {
	Scanner name = new Scanner(System.in);
	private String countries[] = new String [10];
	countries()
	{
	}
	//Basic add that will ask user for 5 countries
	public void add()
	{
		int count;
		for(count = 0; count <= 4; count++)
		{
			System.out.println("Enter country name?");
			countries[count] = name.next();
		}
	}
	//Adds user entered countries at specific indexes
	public void add_specifics()
	{
		System.out.println("What country would you like to add at index 2?");
		String temp = name.next();
		String temp1;
		for(int i = 9; i > 2; i--)
		{
			if (countries[i-1] != null)
			{
				temp1 = countries[i-1];
				countries[i + 1] = countries[i];
				countries[i] = temp1;
			}
		}
		countries[2] = temp;
		System.out.println("What country would you like to add at index 4?");
		temp = name.next();
		for(int i = 9; i > 4; i--)
		{
			if (countries[i-1] != null)
			{
				temp1 = countries[i-1];
				countries[i + 1] = countries[i];
				countries[i] = temp1;
			}
		}
		countries[4] = temp;
		System.out.println("What country would you like to add at index 6?");
		temp = name.next();
		for(int i = 9; i > 6; i--)
		{
			if (countries[i-1] != null)
			{
				temp1 = countries[i-1];
				countries[i + 1] = countries[i];
				countries[i] = temp1;
			}
		}
		countries[6] = temp;
		print();
	}
	//Deletes a country at a specific index
	public void delete()
	{
		System.out.println("Deleting element in index 3");
		countries[3] = null;
		String temp1;
		for(int i = 4; i < countries.length-1; i++)
		{
			if (countries[i+1] != null)
			{
				temp1 = countries[i+1];
				countries[i - 1] = countries[i];
				countries[i] = temp1;
			}
		}
		countries[7] = null;
		print();
		
	}
	//Displays the array onto the console while ignoring any null values
	public void print()
	{
		int i;
		for(i = 0; i < countries.length; i++)
		{
			if (countries[i] != null)
			{
				System.out.println(countries[i] + " at index " + i );
			}
		}
	}

}