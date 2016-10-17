/*
 * Name: Jose Terrones Jr.
 * Purpose: This program will use linked list to create a list
 * of names and id. It will add a few elements at first
 * then print the list. After printing the list it will 
 * add a new element after a it locates a certain element.
 * Then it prints again, after that it will look for a name
 * and delete it. It will look for that name again 
 * and then print the final list.
 */
package linkedListCustomType;

public class joseLinkedListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		joseLinkedList jose = new joseLinkedList();
		jose.insert("Jose", 1001);
		jose.insert("Jorge", 1002);
		jose.insert("Cosette", 1003);
		jose.insert("Rosa", 1004);
		jose.insert("Clark", 1005);
		System.out.println("Original list:");
		jose.printLink();
		jose.insertAfter("Jorge", "Glen", 1006);
		System.out.println("New list:");
		jose.printLink();
		jose.isPresent("Cosette");		
		jose.delete   ("Cosette");		
		jose.isPresent("Cosette");
		System.out.println("Final list:");
		jose.printLink();	
	}

}
