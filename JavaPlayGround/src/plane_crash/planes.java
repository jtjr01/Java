/*
 * Name: Jose Terrones Jr.
 * Purpose: Simulates two planes flying at variable heights and will 
 * be given random heights and if they are within 100 miles they are considered
 * crashed.
 */

package plane_crash;

public class planes {
	static int amount0 = 5001;
	static int amount1 = 3301;
	static int runs = 0;
	static double percent0 = 0;
	static double percent1 = 0;
	static int count0 = 0;
	static int count1 = 0;
	static int Delta[] = new int[amount0];
	static int Jet_blue[] = new int[amount1];

	//Creates arrays that will hold the various heights of the planes
	public static void initialize() 
	{
		int plane1 = 0, plane2 = 0;
		int i;
		for (i = 0; i < amount0; i++) 
		{
			Delta[i] = (30000 + i);
		}
		for (i = 0; i < amount1; i++) 
		{

			Jet_blue[i] = (29200 + i);
		}
		while (runs <= 100) 
		{
			assign(Delta, Jet_blue, plane1, plane2);
			runs++;
		}
	}

	//Chooses a random index that contains a height
	public static void assign(int[] Delta, int[] Jet_blue, int plane1, int plane2) 
	{
		int random0, random1;
		random0 = (int) (Math.random() * (amount0));
		plane1 = Delta[random0];
		random1 = (int) (Math.random() * (amount1));
		plane2 = Jet_blue[random1];
		int height = plane2 - plane1;
		compare(Delta, Jet_blue, plane1, plane2, height);

	}

	public static void compare(int[] Delta, int[] Jet_blue, int plane1, int plane2, int height) 
	{
		if (plane1 == plane2) 
		{
			System.out.println("Planes crashed " + plane1 + " " + plane2);
			count0++;
			}
		else if (height <= 100 && height >= -100)
		{
			System.out.println("Planes crashed " + plane1 + " " + plane2 + " " + height);
			count0++;
		}
		else if (plane1 != plane2) 
		{
			System.out.println("Planes do not crash " + plane1 + " " + plane2);
			count1++;
		}
			
	}

	public static void percent() {
		percent0 = 1.00 * count0 / (runs);
		percent1 = 1.00 * count1 / (runs);
		System.out.println("Times crashed " + (percent0 * 100));
		System.out.println("Times not crashed " + (percent1 * 100));
	}

}
