/*
 * Name: Jose Terrones Jr.
 * Purpose: This program will ask for the user to enter a string and then copy the string to another 
 * array and then sort the second array in alphabetical order, it will print the results and the 
 * original array.
 */

package stringArrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		work str = new work();
		str.ask_user();
		str.store();
		str.copy();
		str.sort();
		str.print();
	}
}
