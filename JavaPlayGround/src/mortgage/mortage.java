/*
 * Name: Jose Terrones Jr.
 * Purpose: This program will calculate the mortgage with a principal of $100,000
 * and with an interest of 5% yearly. It will then calculate how much is 
 * needed to be payed per month.
 */
package mortgage;

public class mortage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal = 100000.00;
		double interest = 0.05 / 12;
		int monthly = 15 * 12;
		double calc = 1 + interest;
		double calc2 = Math.pow(calc, monthly);
		double top = interest * calc2;
		double bot = calc2 - 1;		
		double divide = top / bot;
		double final_calc = principal * divide;
		System.out.println("Your monthly payment is $" + final_calc);
		
		
	}

}
