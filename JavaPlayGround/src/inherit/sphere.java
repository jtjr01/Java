/*
 * Name: Jose Terrones Jr.
 * Purpose: An inherited class that takes circle and uses its methods
 * to get a radius an then calculate for a sphere.
 */

package inherit;

import java.util.*;

public class sphere extends circle{
	Scanner name = new Scanner(System.in);
	sphere()
	{
		System.out.println("Sphere will calculate volume and area.");
		System.out.println("Volume is V = 4 / 3 * PI * (r ^ 3))");
		System.out.println("Area is A = 4 * PI (r ^ 2)");
	}
	public void show()
	{
		dimensions();
		calc();
	}
	//Uses Super to get a method from the parent class
	public void dimensions()
	{
		System.out.print("What is the length of the radius of the sphere?");
		super.setRadius (name.nextDouble());	
	}
	public void calc()
	{
		System.out.format("The volume of this sphere is: %.2f",calc_Volume());
		System.out.format("\nAnd the area is: %.2f",calc_Area());	
	}
	public double calc_Volume()
	{
		double vol;
		vol = ( 4.0 / 3 ) * Math.PI * Math.pow(super.getRadius(), 3);
		return vol;	
	}
	public double calc_Area()
	{
		double area;
		area = 4 * Math.PI * Math.pow(super.getRadius(),2);
		return area;
	}
}


