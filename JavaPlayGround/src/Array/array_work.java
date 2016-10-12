package Array;

import java.util.*;

public class array_work {
	Scanner name = new Scanner(System.in);
	private String user_name;
	static int amount;
	private String array[] = new String [amount];
	array_work()
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
		System.out.println("What is your name?");
		setName(name.nextLine());
	}
	public void amount_add()
	{
		System.out.println("How many names do you want to add?");
		amount = name.nextInt();
		array = new String[amount];
	}
	public void add_name()
	{
		int count;
		for(count = 0; count < array.length; count++)
		{
			System.out.print("Enter the name: ");
			array[count] = name.next();
		}
	}
	public void add_more()
	{
		int index;
		String new_name;
		System.out.println("Where would you like to add another name?(Index number from 0 to " + (array.length-1) + ")");
		index = name.nextInt();
		System.out.println("What is the name being addded?");
		new_name = name.next();
		String array2[] = new String[amount];
		array2 = array.clone();
		array = new String[amount+1];
		for(int i = 0; i < array2.length; i++)
		{
			if(i == index && i == array2.length-1)
			{
				array[i+1] = array2[i];
			}
			else if(i >= index)
			{
				array[i+1] = array2[i];

			}
			else if(i < index)
			{
				array[i] = array2[i];
			}
		}
		array[index] = new_name;
		print();
	}
	public void print()
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
}
