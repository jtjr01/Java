/*
 * Name: Jose Terrones Jr.
 * Purpose: This program will use stacks to verify if an equation is balanced.
 * It will make the stack verify everything as chars. It is checking for 
 * pairs of (), {}, and [].
 */

package stacks;

import java.util.*;

public class stack_call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name = new Scanner(System.in);
		stack mywork = new stack();
		System.out.println("Enter the problem that will be check");
		mywork.addToStack(name.nextLine());

	}

}
