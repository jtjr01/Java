/*
 * Name: Jose Terrones Jr.
 * Purpose: A base class that will be inherited for sphere.
 * This class handles calculation to determine the area and perimeter of
 * a circle.
 */

package inherit;

import java.util.*;

public class circle {
	Scanner name = new Scanner(System.in);
	private double radius;
	
	circle()
	{
	}
	//Constructor with a paramter
	circle(int A)
	{
		System.out.println("Circle will set and get a radius.");
		System.out.println("It will also calculate area which equals A = pi * r ^ 2");
		System.out.println("It will also calculate perimeter which equals P = 2 * pi * r");
	}
	public void setRadius(double rad) {
		radius = rad;
	}
	public double getRadius() {
		return radius;
	}
	public void show() {
		dimensions();
		calc();
	}
	public void dimensions() {
		System.out.print("What is the Radius of the Circle: ");
		setRadius(name.nextDouble());
	}
	public void calc() {
		System.out.format("The area is: %.2f",calc_Area());
		System.out.format("\nThe perimeter is : %.2f", calc_Perimeter());
	}
	public double calc_Area() {
		double area;
		area = (Math.PI * getRadius() * getRadius());
		return area;
	}
	public double calc_Perimeter()
	{
		double perimeter;
		perimeter = (Math.PI * 2 * getRadius());
		return perimeter;
	}
}
