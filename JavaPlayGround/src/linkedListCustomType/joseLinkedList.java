/*
 * Name: Jose Terrones Jr.
 * Purpose: This class will handle all the methods that affect the list
 * for example insert. insert at beginning, insert after, search, delete and 
 * printing of the list.
 */

package linkedListCustomType;

import java.util.*;

public class joseLinkedList extends joseLink{
	
	joseLink first = new joseLink();
	LinkedList <joseLink> lList = new LinkedList<joseLink>();
	
	joseLinkedList()
	{	
	}
	//Basic insert 
	public void insert(String name, int id)
	{
		joseLink newPerson = new joseLink(name,id);
		lList.add(newPerson);	
	}
	//Inserts to the beginning of the list
	public void insertAtBeginning(String nameAdd, int idAdd)
	{
		super.setNextLink(nameAdd,idAdd);
		lList.push(super.getNextLink());
	}
	//Searches for the name and then inserts after it
	public void insertAfter(String nameSearch, String nameAdd, int idAdd)
	{
		super.setNextLink(nameAdd,idAdd);
		int i;
		for(i = 0; i < lList.size(); i++)
		{
			if(lList.get(i).getName()==nameSearch)
			{
				lList.add((i+1),super.getNextLink());
				break;
			}			
		}
	}
	//Searches for the name 
	public void isPresent(String nameSearch)
	{
		int i;
		boolean look = false;
		System.out.println("Searching for " + nameSearch);
		for(i = 0; i < lList.size(); i++)
		{
			if(lList.get(i).getName()==nameSearch)
			{
				System.out.println(nameSearch + " was found at index:" + i);
				look = true;
				break;
			}
		}		
		if(!look)
		{
			System.out.println(nameSearch + " was not found");
		}
	}
	//Deletes the name 
	public void delete(String nameSearch)
	{
		int i;
		System.out.println("Deleting "+ nameSearch);
		for(i = 0; i < lList.size(); i++)
		{
			if(lList.get(i).getName()==nameSearch)
			{
				lList.remove(i);
				break;
			}
		}	
	}
	public void printLink()
	{
		int i;
		for(i = 0; i < lList.size(); i++)
		{
			System.out.println("Index: " + i + " id: " + lList.get(i).getId() + " name:" + lList.get(i).getName());
		}
	}

}
