/*
 * Name: Jose Terrones Jr.
 * Purpose: This program will create two queue's to simulate two cashier lines
 * After a person has left the line the remaining customers will be 
 * displayed until no more customers are left.
 */

package queue;

import java.util.*;

public class queue {
	Queue <String> Q1 = new LinkedList <String>();
	Queue <String> Q2 = new LinkedList <String>();
	
	public void cashLine1()
	{
		Q1.add("Rue");
		Q1.add("Roy");
		Q1.add("Rabbit");
		System.out.println("Cashier 1 has the following line:");
		System.out.println(Q1.toString());
		while(!Q1.isEmpty())
		{
			Q1.remove();
			System.out.println(Q1.toString() + " \t\tAfter one customer has left");
		}
		System.out.println("No more custormers left");
	}
	public void cashLine2()
	{
		Q2.add("Joseph");
		Q2.add("Jakob");
		Q2.add("John");
		Q2.add("Jeremiah");
		System.out.println("Cashier 2 has the following line:");
		System.out.println(Q2.toString());
		while(!Q2.isEmpty())
		{
			Q2.remove();
			System.out.println(Q2.toString() + " \t\tAfter one customer has left");
		}
		System.out.println("No more custormers left");
	}

}
