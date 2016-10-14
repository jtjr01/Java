/*
 * Name: Jose Terrones Jr.
 * Purpose: This program will ask the user for an input of an integer. 
 * It will then determine if the input is positive or not.
 * After that it will split the number if possible and find the
 * square of each number and then add that result together.
 * If the sum ends in 1 then the number inputed is a happy 
 * number but if it does an infinite loop then after the first repetition 
 * the message the number is not happy will display.
 */

package happynumbers;

public class happy_numbers_call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		happy_number_calcs happy_num = new happy_number_calcs();
		happy_number_calcs.ask_user();
	}

}
