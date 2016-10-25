/*
 * Name: Jose Terrones Jr.
 * Purpose: This class will sort a list of integers that 
 * will be sorted by finding the max and then sorting the rest
 * or using the insertion method.
 */

package sorting;

public class sort {

	public static void find_max(int[] list)
	{
		for(int i = 0; i < list.length; i++)
		{
			int max = i;
			for (int j = i + 1; j < list.length; j++)
			{
				if(list[j] > list[max])
				{
					max = j;
				}
				if (max != i)
				{
					sort_items(list, max,i,j);
				}
			}
		}
	}
	static void sort_items(int[] list, int max, int i, int j)
	{
		int temp = list[i];
		list[i] = list[max];
		list[max] = temp;
	}
	public static void insertion(int[] list)
	{
		for(int i = 0; i < list.length; i++)
		{
			int temp = list[i];
			int j;
			for (j = i - 1 ; (j > -1 && temp > list[j]); j--)
			{
					list[j + 1] = list[j];

			}
		list[j + 1] = temp;
		}
	}

}
