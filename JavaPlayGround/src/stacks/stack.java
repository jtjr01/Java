/*
 * Name: Jose Terrones Jr.
 * Purpose: This program will use stacks to verify if an equation is balanced.
 * It will make the stack verify everything as chars. It is checking for 
 * pairs of (), {}, and []. This class will push each item into the stack 
 * if it fall into one of the three possible types and it will push an item 
 * out if it matches.
 */

package stacks;

import java.util.*;

public class stack {
	
	//Creates a stack using char type
	Stack<Character>myStack = new Stack<Character>();
	
	stack()
	{
	}
	//Loops through the string entered and verifies the similar cases
	public void addToStack(String equation)
	{
		int i;
		for(i = 0; i < equation.length(); i++)
		{
			if(equation.charAt(i) == '(' || equation.charAt(i) ==  '{' || equation.charAt(i) == '[')
			{
				myStack.push(equation.charAt(i));
			}
			else if (equation.charAt(i) == ')' || equation.charAt(i) ==  '}' || equation.charAt(i) == ']')
			{
				if(myStack.peek() == '(' && equation.charAt(i) == ')')
				{
					myStack.pop();
				}
				else if(myStack.peek() == '{' && equation.charAt(i) ==  '}')
				{
					myStack.pop();
				}
				else if(myStack.peek() == '[' && equation.charAt(i) == ']')
				{
					myStack.pop();
				}
			}
		}
		if(myStack.isEmpty())
		{
			System.out.println("Equation is balanced");
		}
		else
			System.out.println("Equation is not balanced");
		
	}

}
