/*
 * Name: Jose Terrones Jr.
 * Purpose: This class will handle the initial calculation for area 
 * and perimeter of a square.
 */

package square;

public class square extends main {
	public square(double length)
	{
		System.out.println("Perimeter of a square is " + 4 * length);
		System.out.println("Area of a square is " + length * length);
		new cube(length);

	}

}



