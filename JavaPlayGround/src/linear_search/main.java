/*
 * Name: Jose Terrones Jr
 * Purpose: This program will create an array of random numbers and ask for user input.
 * After that it will search if found it will print found and go to the next array 
 * and repeat. If number is not found repeat again till found.
 */

package linear_search;

public class main {

	public static void main(String[] args) {
		linear_search.initialize();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		linear_search.initialize1();
	}

}
