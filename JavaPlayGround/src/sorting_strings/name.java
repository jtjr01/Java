/*
 * Name: Jose Terrones Jr.
 * Purpose: This class will handle the setting and getting of
 * the users name.
 */

package sorting_strings;

import java.util.Scanner;

public class name {
	private String name1 = "0";
	private Scanner name = new Scanner(System.in);
	name ()
	{	
	}
	public void setname1(String a)
	{
		name1 = a;
	}
	public String getname1()
	{
		return name1;
	}
	public void ask_user()
	{
		System.out.println("What is your name?");
		name1 = name.nextLine();
	}
}
