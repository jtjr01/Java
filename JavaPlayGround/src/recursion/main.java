/*
 * Name: Jose Terrones Jr.
 * Purpose: A simple recursion calculation to find the power or a preset
 * base.
*/

package recursion;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 2;
		int power = 11;
		int answer = 0;
		int count = 1;
		answer = calc(base, power);
		System.out.println( base + " raised to the " + power + " power is " + answer);
		while (count <= power)
		{
			answer =  (int) Math.pow(base, count);
			System.out.println(answer);
			count++;
		}
		
	}
	//This will recursively do work until the base case is reached
	public static int calc(int base, int power) {
		if (power == 0)
		{
			return 1;
		}
		else 
		{
			return base * calc(base, power - 1);
			
		}
	}
	


}
