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
		if(turn == 1){
			System.out.print("Please enter a row,column pair for the location you would like an X: ");
		}
		else{
			System.out.print("Please enter a row,column pair for the location you would like an O: ");
		}
		String rowColumnString = s.nextLine();
		String[] position = rowColumnString.split(",");
		int row = Integer.parseInt(position[0]);
		int column = Integer.parseInt(position[1]);
		System.out.println("Row = " + row);  
		System.out.println("Column = " + column);
		if(turn == 1){
			b.setCell(row, column, Cell.X);
			turn++;
		}
		else{
			b.setCell(row, column, Cell.O);
			turn--;
		}
		System.out.println(b.toString());
		count++;
		}
	s.close();
	}
}
