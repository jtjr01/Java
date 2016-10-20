/*
 * Name: Jose Terrones Jr.
 * Purpose: Handles the creation of a priority queue that will use to hold
 * the various print jobs. It will also designate a priority job.
 */
package priorityQueue;

import java.util.*;

public class priorityQueue {
	Scanner name = new Scanner(System.in);
	PriorityQueue <String> jobs = new PriorityQueue<String>();
	String names[] = new String[5];
	String priority;
	public void setPriority(String i)
	{
		priority = i;
	}
	public void setNames(String i, int j)
	{
		names[j] = i;
	}

	public String getPriority()
	{
		return priority;
	}
	public String getNames(int j)
	{
		return names[j];
	}

	//Creates 5 printing jobs for the priority queue
	public void giveTask()
	{
		int i;
		for(i = 0; i < names.length; i++)
		{
			System.out.println("Enter the names of people who have print jobs?");
			setNames(name.nextLine(), i);
			jobs.add(this.getNames(i));
		}
	}

	//Assigns a name to be priority
	public void givePriority()
	{
		System.out.println("Who will get priority?");
		setPriority(name.nextLine());
	}

	public void print()
	{
		int i;
		System.out.println(jobs.toString());
		for(i = 0; i < jobs.size(); i++)
		{
			if(jobs.contains(getPriority()))
			{
				System.out.println("Printed: " + getPriority());
				jobs.remove(this.getPriority());
				System.out.println(jobs.toString());
			}
			else
			{
				System.out.println("Printed: " + jobs.remove());
				System.out.println(jobs.toString());
			}
		}
		System.out.println("Printed: " + jobs.remove());
		System.out.println(jobs.toString());
		System.out.println("Printed: " + jobs.remove());
	}

}
