/*
 * Jose Terrones Jr.
 * This program will create a binary search tree that the user enters values for.
 * It will also allow for an insert, delete and search. In the end it will display
 * the binary tree in three different orders: in order, preorder and postorder.
 * 
 */
package binaryTree;

import java.util.*;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name = new Scanner(System.in);
		nodeTree tree = new nodeTree();
		System.out.println("Please enter how many number to add to the tree:");
		int numbs = name.nextInt();
		int count = 0;
		while (count != numbs)
		{
			System.out.println("Enter the number to add:");
			tree.add(name.nextInt());
			tree.print();
			count++;
		}
		System.out.println("Would you like to add another node?(1 for yes, 2 for no)");
		int answer = name.nextInt();
		while(answer != 2)
		{
			tree.insert();
			System.out.println("Would you like to add another node?(1 for yes, 2 for no)");
			answer = name.nextInt();
		}
		System.out.println("Enter the number to look for: ");
		int find = name.nextInt();
		tree.find(find);
		System.out.println("Enter the number to delete: ");
		int remove = name.nextInt();
		tree.remove(remove);
		System.out.println("In order: ");
		tree.print();
		System.out.println("Preorder: ");
		tree.printpreorder();
		System.out.println("Postorder: ");
		tree.printpostorder();
		name.close();
	}

}
