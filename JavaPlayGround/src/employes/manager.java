/*
 * Name: Jose Terrones Jr.
 * Purpose: Basic class that determines a manager's salary.
 */

package employes;

public class manager extends main_shop {
	public manager(String name1, double salary)
	{
		double finalPay = salary*.1 + salary;
		System.out.println("Hello, " + name1);
		System.out.println("Your slary is " + finalPay);
	
	}

}
