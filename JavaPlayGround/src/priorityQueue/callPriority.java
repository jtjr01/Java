/*
 * Name: Jose Terrones Jr.
 * Purpose: Various print jobs will be queued into a priority queue
 * and one will be given priority and it will show completion of the
 * task with priority first followed by the rest.
 */

package priorityQueue;

public class callPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		priorityQueue printJobs = new priorityQueue();
		printJobs.giveTask();
		printJobs.givePriority();
		printJobs.print();

	}

}
