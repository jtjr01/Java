/*
 * Jose Terrones Jr.
 * Purpose: This program will create an arraylist of type Person that is storing information
 * of a person and an id number. It will also declare the size of the array multiple times
 * throughout the running of the program. It will create four people, and then add another
 * person, then remove a person and allow for a search to be ran. If the person searched is found
 * it will display that it was found and at the index it was found, if not it will state no found.
 */

package arrayL_obj;

import java.util.*;

public class caller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name1 = new Scanner(System.in);
		ArrayList<person> array = new ArrayList<person>();
		int i;
		String name;
		System.out.println("The size of the array is " + array.size());
		array.add(new person("Jose", 1001));
		array.add(new person("Jorge", 1002));
		array.add(new person("Clark", 1003));
		array.add(new person("Cosette", 1004));
		for(i=0; i < array.size(); i++)
		{
			array.get(i).display();
		}
		System.out.println("The size of the array is " + array.size());
		System.out.println("Adding another person at index 2");
		array.add(2,new person("Karol", 1005));
		for(i=0; i < array.size(); i++)
		{
			array.get(i).display();
		}
		System.out.println("The size of the array is " + array.size());
		System.out.println("Removing the first person");
		array.remove(0);
		for(i=0; i < array.size(); i++)
		{
			array.get(i).display();
		}
		System.out.println("The size of the array is " + array.size());
		System.out.println("Enter name to search");
		name = name1.next();
		for(i=0; i < array.size(); i++)
		{
			if(array.get(i).getName().equals(name))
			{
				System.out.println("Name was found at index " + i);
				break;
			}
			else if(i == (array.size() - 1))
			{
				System.out.println("Name was not found");
			}
		}
		System.out.println("The size of the array is " + array.size() + " and the index goes from 0 to " + (array.size() - 1));
		name1.close();
	}

}
