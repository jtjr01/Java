package TicTacToe;

public class Board {
public enum Cell {E, X, O}
private Cell[][]board;

public Board(){
	board = new Cell[3][3];
	for (int i=0; i<board.length; i++){
		for (int j= 0; j<board[i].length; j++){
			board [	i][j] = Cell.E;
		}
}
}
public String toString(){
	String result = "";
	for (Cell[] row :board ){
		for(Cell c :row){
			if(c == Cell.E){
				System.out.print("_ ");
			}
			if(c == Cell.X){
				System.out.print("X ");	
			}
			if(c == Cell.O){
				System.out.print("O ");
			}
		}
		System.out.print("\n");	
	}
	return result;
}

public void victory(){
	
}
public void setCell(int r, int c, Cell value){
	board[r][c]= value;
	}
}
