/*
 * Name: Jose Terrones Jr.
 * Purpose: This program asks the user for an input and then will 
 * calculate the area and perimeter of a square and then it will 
 * use the same length to calculate the perimeter and volume of a cube.
 */

package square;

import java.util.Scanner; 
public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name = new Scanner (System.in);
		System.out.println("What is the side lenght of the square?");
		double length = name.nextDouble();
		new square(length);
		

	}

}
