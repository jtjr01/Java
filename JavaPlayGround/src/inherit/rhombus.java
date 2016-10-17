/*
 * Name: Jose Terrones Jr.
 * Purpose: An inherited class that takes triangle and uses its methods
 * to get a base and height to calculate for a rhombus.
 */

package inherit;

import java.util.*;

public class rhombus extends triangle {
	Scanner name = new Scanner(System.in);
	rhombus()
	{
		System.out.println("Rhombus will calculate the area which is A = 2 ((1/2) * B * H)");
	}
	public void show()
	{
		dimensions();
		calc();
	}
	public void dimensions()
	{
		System.out.println("What is the base side length of the rhombus?");
		super.setBase(name.nextDouble());
		System.out.println("What is the height of the rhombus?");
		super.setHeight (name.nextDouble());
	}
	public double calc_Area()
	{
		double area;
		area = super.calc_Area() * 2;
		return area;
	}
	public void calc()
	{
		System.out.format("The area of this rhombus is: %.2f", calc_Area());
	}
}
