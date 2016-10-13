/*
 * Name: Jose Terrones Jr.
 * Purpose: Run through of basic add, delete, copy, and printing using array list with strings.
 */

package array_lists;

import java.util.*;

public class arrayL_work {
	private ArrayList<String> array = new ArrayList<String>();
	private ArrayList<String> array1;
	Scanner name = new Scanner(System.in);
	private int count,count1;
	String user_name,name_delete;
	arrayL_work()
	{
	}
	public void setName(String name1)
	{
		user_name = name1;
	}
	public String getName()
	{
		return user_name;
	}
	public void ask_user()
	{
		System.out.println("Enter a name.");
		setName(name.nextLine());
	}
	//Adds a desired amount of names aside from the initial name asked.
	public void adding()
	{
		array.add(user_name);
		int i=0;
		System.out.println("How many names would you like to add?");
		count = name.nextInt();
		while(i < count)
		{
			System.out.println("Enter the name.");
			array.add(i+1,name.next());
			i++;
		}
	}
	//Inserts into the array list using an index location.
	public void insert()
	{
		int location;
		String name1;
		System.out.println("Where would you like to add a name?(Enter a location number from 0 to " + (count+1) + ")");
		location = name.nextInt();
		System.out.println("What name would you like to add?");
		name1 = name.next();
		array.add(location,name1);
	}
	//Copies the original array list into a second one that filled with the same items.
	public void copy()
	{
		System.out.println("Copying the first array list");
		array1 = new ArrayList<String>(array);
	}
	//Deletes an item from the second array list.
	public void delete()
	{
		System.out.println("Deleting from the second array list");
		System.out.println("Enter the name to delete");
		name_delete = name.next();
		array1.remove(name_delete);
	}
	//Adds United States of America to the original array list at index 3.
	public void america()
	{
		System.out.println("Adding United States of America to first array list at index 3");
		array.set(3,"United States of America");
	}
	//Prints the final content of the first and second array list to console.
	public void print()
	{
		System.out.println("First array list");
		for(count = 0; count < array.size(); count++)
		{
			System.out.print(count + "   " + array.get(count) + "\n");
		}
		System.out.println("Second array list");
		for(count1 = 0; count1 < array1.size(); count1++)
		{
			System.out.print(count1 + "   " + array1.get(count1) + "\n");
		}
	}
}
