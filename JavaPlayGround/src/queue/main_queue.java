/*
 * Name: Jose Terrones Jr.
 * Purpose: This program will create two queue's to simulate two cashier lines
 * After a person has left the line the remaining customers will be 
 * displayed until no more customers are left.
 */

package queue;

public class main_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue shop = new queue();
		shop.cashLine1();
		System.out.println("");
		shop.cashLine2();
	}

}
