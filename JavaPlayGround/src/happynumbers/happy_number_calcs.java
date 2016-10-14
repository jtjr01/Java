/*
 * Name: Jose Terrones Jr.
 * Purpose: This class will contain the work that the integer
 * will be processed by. The integer will be split if possible, 
 * then each item will be squared followed by a sum of the items.
 * This will continue until 1 is determined as a happy number or
 * the first repetition is found.
 */

package happynumbers;

import java.util.*;

public class happy_number_calcs {
	static Scanner name = new Scanner (System.in);
	static List<Integer> split_num  = new ArrayList<Integer>();
	static List<Integer> check = new ArrayList<Integer>();

	//will ask the user for input.
	public static void ask_user()
	{
		System.out.println("Enter a number "); 
		int numb = name.nextInt();
		if (numb > 0)
		{
			work(numb);
		}
		else
		{
			ask_user();
		}
	}
	//will call all the functions that will dissect, do powers
	//and sum the numbers, will also check if repetition is 
	//done
	public static void work(int numb)
	{
		int not_hap;
		dissect(numb, split_num);
		power(split_num);
		not_hap = sum(split_num);
		check.add(numb);
		if (not_hap == 1)
		{
			System.out.println("Happy number.");
		}

		else if(check.contains(not_hap))
		{
			System.out.println(check.get(check.indexOf(not_hap)));
			System.out.println("This number is not happy");			
		}
		else 
		{
			split_num.clear();
			work(not_hap);
		}	
	}
	//splits the number and displays the split
	public static void dissect(int numb, List <Integer> split_num)
	{
		while(numb > 0)
		{
			split_num.add(numb%10);
			numb = numb/10;			
		}
		Collections.reverse(split_num);
		System.out.println (split_num);
	}
	//takes the split numbers and raises them the second power.
	public static void power(List <Integer> split_num)
	{
		int i;
		for( i = 0; i < split_num.size(); i++)
		{
			split_num.set(i, (int)((Math.pow(split_num.get(i), 2))));
		}
	}
	//sums the numbers that we raised to the second power.
	public static int sum(List <Integer> sum_num)
	{
		int k,sum;
		sum = 0;
		for( k = 0; k < sum_num.size(); k++)
		{
			sum += sum_num.get(k);
		}		
		return sum;
		
	}
}
