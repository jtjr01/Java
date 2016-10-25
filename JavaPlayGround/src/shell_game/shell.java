/*
 * Name: Jose Terrones Jr.
 * Purpose: Program will display three cup with a corresponding number. Then it will
 * ask user if they wish to play. If Y is chosen it will ask the user which
 * number they chose and display a win or lose and position of the peanut.
 * After a initial game it will ask if they play again. This will continue 
 * until user chooses N and it will then end. After it ends a statistics 
 * menu will display number of games played, wins, losses and win percentage.
 */

package shell_game;

import java.util.Scanner;

public class shell {
	static Scanner name = new Scanner (System.in);
	static int hide = 0;
	static int games = 0;
	static int wins = 0;
	static int losses = 0;
	
	public static void hide()
	{
		hide = (int) (Math.random() * (3));
		++hide;
	}
	public static void display() 
	{
		System.out.print("      ______        ______         ______ \n");
		System.out.print("     /      \\      /      \\       /      \\\n");
		System.out.print("    /        \\    /        \\     /        \\\n");
		System.out.print("   /    1     \\  /     2    \\   /    3     \\\n");
	}
	public static void user_choice()
	{
		display();
		System.out.println("Do you wish to play the shell game? Y or N");
		String c = name.next();
		if (c.equals("Y"))
		{
			System.out.println("Which cup do you think holds the peanut?");
			int guess = name.nextInt();
			if (guess <= 3 || guess >= 1)
			{
				hide();
				game_played(guess);
				user_choice();
			}
			else
			{
				System.out.println("Make another choice?");
				
			}
		}
		else if(c.equals("N"))
		{
			print(games, wins, losses);
		}
		else
		{
			user_choice();
		}
		
	}
	//Win condition is hard coded to account for all possible situations
	public static void game_played(int guess)
	{
		if(guess == 1)
		{
			if (hide == 1)
			{
				System.out.print("      ______        ______         ______ \n");
				System.out.print("     /      \\      /      \\       /      \\\n");
				System.out.print("    /        \\    /        \\     /        \\\n");
				System.out.print("   /    "+ hide +"     \\  /          \\   /          \\\n");
				System.out.println("You won!");
				wins++;
			}
			else if (hide == 2)
			{
				System.out.print("      ______        ______         ______ \n");
				System.out.print("     /      \\      /      \\       /      \\\n");
				System.out.print("    /        \\    /        \\     /        \\\n");
				System.out.print("   /          \\  /    "+ hide +"     \\   /          \\\n");
				System.out.println("You guessed wrong");
				losses++;
			}
			else if (hide ==3)
			{
				System.out.print("      ______        ______         ______ \n");
				System.out.print("     /      \\      /      \\       /      \\\n");
				System.out.print("    /        \\    /        \\     /        \\\n");
				System.out.print("   /          \\  /          \\   /     "+ hide +"    \\\n");
				System.out.println("You guessed wrong");
				losses++;
			}
		}
		else if (guess == 2)
		{
			if (hide == 2)
			{
				System.out.print("      ______        ______         ______ \n");
				System.out.print("     /      \\      /      \\       /      \\\n");
				System.out.print("    /        \\    /        \\     /        \\\n");
				System.out.print("   /          \\  /    "+ hide +"     \\   /          \\\n");
				System.out.println("You won!");
				wins++;
			}
			else if (hide == 1)
			{
				System.out.print("      ______        ______         ______ \n");
				System.out.print("     /      \\      /      \\       /      \\\n");
				System.out.print("    /        \\    /        \\     /        \\\n");
				System.out.print("   /    "+ hide +"     \\  /          \\   /          \\\n");
				System.out.println("You guessed wrong");
				losses++;
			}
			else if (hide == 3)
			{
				System.out.print("      ______        ______         ______ \n");
				System.out.print("     /      \\      /      \\       /      \\\n");
				System.out.print("    /        \\    /        \\     /        \\\n");
				System.out.print("   /          \\  /          \\   /     "+ hide +"    \\\n");
				System.out.println("You guessed wrong");
				losses++;
			}
		}
		else if (guess == 3)
		{
			if (hide == 3)
			{
				System.out.print("      ______        ______         ______ \n");
				System.out.print("     /      \\      /      \\       /      \\\n");
				System.out.print("    /        \\    /        \\     /        \\\n");
				System.out.print("   /          \\  /          \\   /     "+ hide +"    \\\n");
				System.out.println("You won!");
				wins++;
			}
			else if (hide == 1)
			{
				System.out.print("      ______        ______         ______ \n");
				System.out.print("     /      \\      /      \\       /      \\\n");
				System.out.print("    /        \\    /        \\     /        \\\n");
				System.out.print("   /    "+ hide +"     \\  /          \\   /          \\\n");
				System.out.println("You guessed wrong");
				losses++;
			}
			else if (hide == 2)
			{
				System.out.print("      ______        ______         ______ \n");
				System.out.print("     /      \\      /      \\       /      \\\n");
				System.out.print("    /        \\    /        \\     /        \\\n");
				System.out.print("   /          \\  /    "+ hide +"     \\   /          \\\n");
				System.out.println("You guessed wrong");
				losses++;
			}
		}
		games++;
	}
	public static void print(int games, int wins, int losses)
	{
		double percent = 1.00 *wins / games;
		System.out.println("Statistics");
		System.out.println("Games played: " + games);
		System.out.println("Games won: " + wins);
		System.out.println("Games lost: " + losses);
		System.out.println("You won " + (percent * 100) +"% of games played");
		
	}

}
