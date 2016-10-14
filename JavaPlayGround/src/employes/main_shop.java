/*
 * Name: Jose Terrones Jr.
 * Purpose: A simple shop that display wages of different type of employees.
 * It uses a constructor to pass the initial values and then displays the wage.
 */

package employes;

import java.util.Scanner; 

public class main_shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name = new Scanner (System.in); 
		System.out.println("What is your name?");
		String name1 = name.nextLine();
		System.out.println("What type of employee are you?");
		System.out.println("Type 1 for manager, type 2 for regular employee, type 3 for comissioned employee");
		int choice = name.nextInt();
		if (choice == 1)
		{
			System.out.println("What is your salary?");
			double salary = name.nextDouble();
			new manager(name1, salary);
		}
		else if (choice == 2)
		{
			System.out.println("What is your salary?");
			double salary = name.nextDouble();
			new employe(name1, salary); 
			
			
		}
		else if (choice == 3 )
		{
			System.out.println("You do not have a salary.");
			System.out.println("How much do you get paid per hour?");
			double payment = name.nextDouble();
			System.out.println("How many hour did you work?");
			int hour = name.nextInt();
			new comissioned_employe(name1, payment, hour);
			
		}
		name.close();
	}
}
