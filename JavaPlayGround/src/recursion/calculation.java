/*
 * Name: Jose Terrones Jr.
 * Purpose: A simple recursion calculation to find the power or a preset
 * base.
 */

package recursion;

public class calculation {
	public int calculation(int base, int power, int answer) {
		if (power == 0)
		{
			return 0;
		}
		else
		{
			return base * calculation(base, power - 1, answer);
			
		}
	}
}


