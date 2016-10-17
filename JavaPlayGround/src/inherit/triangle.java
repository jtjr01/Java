/*
 * Name: Jose Terrones Jr.
 * Purpose: A base class with details for a basic triangle and will
 * calculate for area.
 */

package inherit;

import java.util.*;

public class triangle {
	Scanner name = new Scanner(System.in);
	private double base;
	private double height;
	triangle() 
	{
	}
	triangle(int A) {
		System.out.println("Triangle will set and get a base and height.");
		System.out.println("It will also calculate area which equals A = H * B / 2");
	}
	public void setBase(double leng) {
		base = leng;
	}
	public void setHeight(double triHeight) {
		height = triHeight;
	}
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
	public void show() {
		dimensions();
		calc();
	}
	public void dimensions() {
		System.out.print("What is the length of the base of the triangle: ");
		setBase(name.nextDouble());
		System.out.print("What is the height of the triangle: ");
		setHeight(name.nextDouble());
	}
	public void calc() {
		System.out.format("The area is: %.2f",calc_Area());
	}
	public double calc_Area() {
		double area;
		area = (getHeight() * getBase()) / 2;
		return area;
	}
}
