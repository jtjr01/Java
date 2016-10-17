/*
 * Name: Jose Terrones Jr.
 * Purpose: An inherited class that takes triangle and uses its methods
 * to get the base an then calculate for a star.
 */

package inherit;

import java.util.*;

public class star extends triangle{
	Scanner name = new Scanner(System.in);
	star()
	{
		System.out.println("Star class will calculate area by using triangles");
		System.out.println("Area = 10*sqrt(s*(s-side1)*(s-side2)*(s-side3))" );
	}
	public void show()
	{
		dimensions();
		calc();
	}
	public void dimensions()
	{
		System.out.print("What is the length from the center to the tip of the star?");
		super.setBase(name.nextDouble());
	}
	public void calc()
	{
		System.out.format("The area of this star is: %.2f", calc_Area());
	}
	public double calc_Area()
	{
		double area;
		double side_2,side_3,s;
		side_2 = super.getBase() * Math.sin(Math.toRadians(18));
		side_3 = super.getBase() * Math.sin(Math.toRadians(36));
		s = (super.getBase() + side_2 + side_3) / 2;
		area = Math.sqrt(Math.abs(s *(s - super.getBase()) * (s - side_2)*(s-side_3)));
		area *= 10;
		return area;
	}
}
