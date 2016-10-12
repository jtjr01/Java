/*
 * Name: Jose Terrones Jr.
 * Purpose: A simple tic tac toe game that is displayed on the console.
 * Players will take turns playing the game until a win is had or a draaw occurs.
 */

package TicTacToe;

import java.util.Scanner;

import TicTacToe.Board.Cell;

public class Main {

public static void main(String[] args){
	Scanner s = new Scanner (System.in);
	Board b = new Board();
	int turn = 1;
	int count = 0;
	System.out.println(b.toString());
	while(count < 9){
		//Alternates between players
		if(turn == 1){
			System.out.print("Please enter a row,column pair for the location you would like an X: ");
			}
		else{
			System.out.print("Please enter a row,column pair for the location you would like an O: ");
			}
		//Parses the string of coordinates using the comma as the split
		String rowColumnString = s.nextLine();
		String[] position = rowColumnString.split(",");
		int row = Integer.parseInt(position[0]);
		int column = Integer.parseInt(position[1]);
		System.out.println("Row = " + row);  
		System.out.println("Column = " + column);
		if(turn == 1){
			b.setCell(row, column, Cell.X);
			System.out.println(b.toString());
			if(b.victory(turn) == true){
				break;
			}
			turn++;
			}
		else{
			b.setCell(row, column, Cell.O);
			System.out.println(b.toString());
			if(b.victory(turn) == true){
				break;
			}
			turn--;
			}
		count++;
		if(count == 9){
			System.out.println("The game ended in a draw");
			}
		}
	s.close();
	b.exit();
	}
}
