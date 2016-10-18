/*
 * Name: Jose Terrones Jr.
 * Purpose: This program will ask user how many names to add in a linked list
 * and then it will ask the user to input the names. Then it will 
 * ask where too add another name, and finally it will delete the name.
 */
package lab20;

public class linklist_call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linklist_work link = new linklist_work();
		link.askName();
		link.insert();
		link.printList(link.names);
		link.delete_Match();

	}

}
