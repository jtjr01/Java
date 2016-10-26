/*
 * Name: Jose Terrones Jr.
 * Purpose: User will enter a number that will be square rooted and
 * it will be rounded to a whole number and then square rooted again
 * until the result is 1.
 */

package square_root;

import java.util.Scanner;

public class root_work {
	static Scanner name = new Scanner (System.in);
	
	public static void ask_user()
	{
		System.out.println("Enter the number that will be sqrted: ");
		double numb = name.nextDouble();
		work(numb);
	}
	public static void work(double numb)
	{
		double result = (double) Math.sqrt(numb);
		System.out.println("The sqrt is " + result);
		
		if(result >=1 && result < 2)
		{
			int result1 = 1;
			System.out.println("The final sqrt is " + result1);
		}
		else if (result < 1 && result >= 0)
		{
			int result2 = 0;
			System.out.println("The final sqrt is " + result2);
		}
		else 
		{	
			System.out.println("Rounded sqrt is " + (int)result);
			work((int)result);
		}
	}

}
