/*
 * Name: Jose Terrones Jr.
 * Purpose: binary tree will have all the functions from adding nodes,
 * insert a single node, find a node, delete a node and print
 * the tree with its left and right link.
 */

package binaryTree;

import java.util.*;

public class nodeTree {
	private node root;
	Scanner name = new Scanner(System.in);
	
	//constructor that will make the root a null value initially
	nodeTree()
	{
		root = null;
	}
	//adds a node by creating a node with given values for its left
	//and right link, then it will find the location it needs to be added in.
	public void add(Integer data) 
	{
		node newNode = new node(); 
		newNode.data = data; 
		newNode.leftLink = null; 
		newNode.rightLink = null;
		if (root == null) 
		{ 
			root = newNode; 
		}
		else 
		{ 
			root.addNode(newNode); 
		} 
	}
	//ask user to give a value and calls the add function
	public void insert()
	{
		System.out.println("Enter the number to add:");
		add(name.nextInt());
		print();
	}
	//compares the value that user gave to the values of the root
	//runs a compareTo function to find if the values is equal to, 
	//greater to or less than value entered.
	public boolean find(int find)
	{
		node current = root; 
		while (current != null) 
		{
			int i = current.data.compareTo(find);
			if (i == 0) 
			{ 
				System.out.println("Found");
				return true; 
			}
			else if (i > 0) 
			{ 
				current = current.leftLink; 
			} 
			else 
			{ 
				current = current.rightLink; 
			}
		}
		System.out.println("Not found");
		return false;
	}
	//Removes the node data entered by user.
	//uses a boolean variable and toBeRemoved variable
	//to make it run until its found. Once found special 
	// loops are ran to make sure the tree is shifted correctly.
	public void remove(int remove)
	{
		node toBeRemoved = root;
		node parent = null;
		boolean found = false;
		while (!found && toBeRemoved != null) 
		{
			int d = toBeRemoved.data.compareTo(remove); 
			if (d == 0) 
			{ 
				found = true; 
			}
			else 
			{
				parent = toBeRemoved;
				if(d > 0)
				{
					toBeRemoved = toBeRemoved.leftLink;
				}
				else 
				{
					toBeRemoved = toBeRemoved.rightLink;
				}
			}
		}
		if (!found) 
		{
			return;
		}
		if(toBeRemoved.leftLink == null || toBeRemoved.rightLink == null)
		{
			node newChild;
			if(toBeRemoved.leftLink == null)
			{
				newChild = toBeRemoved.rightLink;
			}
			else
			{
				newChild = toBeRemoved.leftLink;
			}
			if(parent == null)
			{
				root = newChild;
			}
			else if (parent.leftLink == toBeRemoved)
			{
				parent.leftLink = newChild;
			}
			else
			{
				parent.rightLink = newChild;
			}
			return;
			
		}
		node smallestParent = toBeRemoved;
		node smallest = toBeRemoved.rightLink;
		while(smallest.leftLink != null)
		{
			smallestParent = smallest;
			smallest = smallest.leftLink;
		}
		toBeRemoved.data = smallest.data;
		if(smallestParent == toBeRemoved)
		{
			smallestParent.rightLink = smallest.rightLink;
		}
		else
		{
			smallestParent.leftLink = smallest.rightLink;
		}
	}
	//basic print function that will call the print that will run recursively
	public void print() 
	{
		print(root);
		System.out.println(); 
	}
	public void printpreorder()
	{
		printpreorder(root);
		System.out.println();
	}
	public void printpostorder()
	{
		printpostorder(root);
		System.out.println();
	}
	//prints the root and its left and right link in-order
	//it will be ran recursively for each left and right link
	private void print(node parent) 
	{
		if (parent == null) 
		{ 
			return; 
		}
		print(parent.leftLink); 
		if (parent.leftLink == null && parent.rightLink == null)
		{
			System.out.print("[" + parent.leftLink + " " + parent.data + " " + parent.rightLink + "]");
		}
		else if(parent.leftLink == null)
		{
			Integer right = parent.rightLink.data;
			System.out.print("[" + parent.leftLink + " " + parent.data + " " + right + "]");
		}
		else if (parent.rightLink == null)
		{
			Integer left = parent.leftLink.data;
			System.out.print("[" + left + " " + parent.data + " " + parent.rightLink + "]");	
		}
		else
		{
			Integer left = parent.leftLink.data;
			Integer right = parent.rightLink.data;
			System.out.print("[" + left + " " + parent.data + " " + right + "]");
		}
		print(parent.rightLink);
	}
	private void printpreorder(node parent)
	{
		if (parent == null) 
		{ 
			return; 
		}
		if (parent.leftLink == null && parent.rightLink == null)
		{
			System.out.print("[" + parent.leftLink + " " + parent.data + " " + parent.rightLink + "]");
		}
		else if(parent.leftLink == null)
		{
			Integer right = parent.rightLink.data;
			System.out.print("[" + parent.leftLink + " " + parent.data + " " + right + "]");
		}
		else if (parent.rightLink == null)
		{
			Integer left = parent.leftLink.data;
			System.out.print("[" + left + " " + parent.data + " " + parent.rightLink + "]");	
		}
		else
		{
			Integer left = parent.leftLink.data;
			Integer right = parent.rightLink.data;
			System.out.print("[" + left + " " + parent.data + " " + right + "]");
		}
		print(parent.leftLink); 
		print(parent.rightLink);
	}
	private void printpostorder(node parent)
	{
		print(parent.leftLink); 
		print(parent.rightLink);
		if (parent.leftLink == null && parent.rightLink == null)
		{
			System.out.print("[" + parent.leftLink + " " + parent.data + " " + parent.rightLink + "]");
		}
		else if(parent.leftLink == null)
		{
			Integer right = parent.rightLink.data;
			System.out.print("[" + parent.leftLink + " " + parent.data + " " + right + "]");
		}
		else if (parent.rightLink == null)
		{
			Integer left = parent.leftLink.data;
			System.out.print("[" + left + " " + parent.data + " " + parent.rightLink + "]");	
		}
		else
		{
			Integer left = parent.leftLink.data;
			Integer right = parent.rightLink.data;
			System.out.print("[" + left + " " + parent.data + " " + right + "]");
		}
	}

}
