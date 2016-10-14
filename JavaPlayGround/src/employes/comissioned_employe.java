/*
 * Name: Jose Terrones Jr.
 * Purpose: Basic class that determines a commissioned employee's salary.
 */

package employes;

public class comissioned_employe extends main_shop {
	public comissioned_employe(String name1, double payment, int hour)
	{
		double finalPayment = payment * hour;
		System.out.println("Hello, " + name1);
		System.out.println("Your final payment is  " + finalPayment);
		
	}

}
