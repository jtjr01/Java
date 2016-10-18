/*
 * Name: Jose Terrones Jr.
 * Purpose: Handles a linked lists where one is added names determined
 * by the user. Then an insert will occur, followed by a delete of a 
 * specified name.
 */

package linkedLists;

import java.util.*;

public class linklist_work {
	Scanner name = new Scanner(System.in);

	LinkedList <String> names = new LinkedList<String>();
	LinkedList <String> added_Names = new LinkedList<String>(); 	
	linklist_work()
	{
	}
	int getNum()
	{
		return name.nextInt();
	}

	void askName()
	{
		int i,max;
		System.out.println("How many names do you want to add?");
		max = this.getNum();

		for( i = 0; i < max; i++)
		{
			System.out.println("Enter a name:");
			names.add(name.next());
		}
		for( i = 0; i < max; i++)
		{
			System.out.println(i + ". " + names.get(i));
		}
	}

	void insert()
	{
		int location;
		System.out.println("What location do you want to add a name?");
		location = this.getNum();
		System.out.println("What name do you want to add?");
		names.add(location, name.next());
	}

	void delete_Match()
	{
		String name1;
		added_Names = names;
		System.out.println("What name do you want to delete?");
		name1 = name.next();
		added_Names.removeFirstOccurrence(name1);
		printList(added_Names);
	}

	void printList(LinkedList<String> listPrint)
	{
		int i;

		for(i = 0; i < listPrint.size(); i++)
		{
			System.out.println(i + ". " + listPrint.get(i));
		}		
	}

}
