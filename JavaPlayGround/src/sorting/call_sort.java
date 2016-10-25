/*
 * Name: Jose Terrones Jr.
 * Purpose: This class will sort a list of integers that 
 * will be sorted by finding the max and then sorting the rest
 * or using the insertion method.
 */

package sorting;

public class call_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start, stop;
		int list[] = {100,87,67,85,80,17,83,42,59,92};
		start = System.nanoTime();
		System.out.println("Sorting by finding max");
		sort.find_max(list);
		int f = 0;
		while(f < list.length)
		{
			System.out.println(list[f]);
			f++;
		}
		stop = System.nanoTime();
		long endtime0 = stop - start;
		double seconds0 = (double)endtime0 / 1000000000;
		System.out.println("Took : " + seconds0 + "sec");
		start = System.nanoTime();
		System.out.println("Sorting by using insertion");
		sort.insertion(list);
		int g = 0;
		while (g < list.length)
		{
			System.out.println(list[g]);
			g++;
		}		
		stop = System.nanoTime();
		long endtime1 = stop - start;
		double seconds1 = (double)endtime1 / 1000000000;
		System.out.println("Took : " + seconds1 + "sec");
		int order[] = {10,20,30,40,50,60,70,80,90,100};
		start = System.nanoTime();
		System.out.println("Sorting by finding max");
		sort.find_max(order);
		f = 0;
		while(f < order.length)
		{
			System.out.println(order[f]);
			f++;
		}
		stop = System.nanoTime();
		long endtime2 = stop - start;
		double seconds2 = (double)endtime2 / 1000000000;
		System.out.println("Took : " + seconds1 + "sec");
		start = System.nanoTime();
		System.out.println("Sorting by using insertion");
		sort.insertion(order);
		f = 0;
		while(f < order.length)
		{
			System.out.println(order[f]);
			f++;
		}
		stop = System.nanoTime();
		long endtime3 = stop - start;
		double seconds3 = (double)endtime3 / 1000000000;
		System.out.println("Took : " + seconds3 + "sec");

	}

}
