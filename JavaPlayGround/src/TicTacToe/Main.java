package TicTacToe;

import java.util.Scanner;

import TicTacToe.Board.Cell;

public class Main {

public static void main(String[] args){
	Scanner s = new Scanner (System.in);
	Board b = new Board();
	String input = "";
	int turn = 1;
	int count = 0;
	System.out.println(b.toString());
	while(count < 9){
		System.out.print("Please enter a row,column pair for the location you would like an X: ");
		input= s.nextLine();
		String rowColumnString = s.nextLine();
		String[] position = rowColumnString.split(",");
		int row = Integer.parseInt(position[0]);
		int column = Integer.parseInt(position[1]);
		System.out.println("Row = " + row);  
		System.out.println("Column = " + column);
		b.setCell(row, column, Cell.X);
		System.out.println(b.toString());
		b.victory();
		}
	s.close();
	}
}
