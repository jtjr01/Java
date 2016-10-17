/*
 * Name: Jose Terrones Jr.
 * Purpose: Handles the menu selection process and will call upon 
 * the correct class to continue the operations choosen.
 */

package inherit;

import java.util.*;

public class menu {
	private Scanner name = new Scanner(System.in);
	private int user_choice;
	menu() 
	{
	}
	public void setUserChoice(int choice)
	{
		user_choice = choice;
	}
	public int getUserChoice()
	{
		return user_choice;
	}
	public void options() {
		System.out.println("Options to chose: ");
		System.out.println("1. Triangle");
		System.out.println("2. Circle");
		System.out.println("3. Rhombus");
		System.out.println("4. Star");
		System.out.println("5. Sphere");
		System.out.println("6. Exit");
		prompt();
	}
	public void prompt()
	{
		System.out.println("Choose any of the following shapes: ");
		setUserChoice(name.nextInt());
	}
	//Used if statements but a switch block could have also worked
	public void option_choice(int choose)
	{
		if(choose == 1)
		{
			triangle tri = new triangle(1);
			tri.show();
			
		}
		else if(choose == 2)
		{
			circle cir = new circle(1);
			cir.show();
		}
		else if (choose == 3)
		{
			rhombus rhom = new rhombus();
			rhom.show();
		}
		else if (choose == 4)
		{
			star str = new star();
			str.show();
		}
		else if (choose == 5)
		{
			sphere sph = new sphere();
			sph.show();
		}
		else if (choose == 6)
		{
			System.out.println("Exit was choosen.");
		}
		else
		{
			options();
			option_choice(getUserChoice());
		}		
	}
}
