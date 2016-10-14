/*
 * Name: Jose Terrones Jr.
 * Purpose: This program is suppose to handle exceptions. It will divide int
 * by 0 and throw an exception. It will also divide a double by 0 and see if
 * an exception is thrown. Then an array will attempt to print 4 items but will 
 * not be able to as the array only contains two items. 
 */
package exceptions;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Integer = 10;
		double Double = 20.5;
		String countries [] = {"USA", "CANADA"};
		try
		{
			int divide = Integer / 0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by 0 exception thrown");
		}
		try
		{
			double divide2 = Double / 0;
		}
		catch(ArithmeticException r)
		{
			System.out.println("Divide by 0 exception thrown");
			
		}
		try
		{
			System.out.println(countries[0] + countries[1] + countries[2] + countries [3]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Index out of bound exception thrown");
		}
		finally
		{
			System.out.println("Good-bye");
		}

	}

}
