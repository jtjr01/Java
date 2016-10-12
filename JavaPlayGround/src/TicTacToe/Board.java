/*
 * Name: Jose Terrones Jr.
 * Purpose: Handles the displaying of the board and places the correct
 * markers at each designated coordinate. Also run the various win conditions
 * to determine a winner.
 */

package TicTacToe;

public class Board {
public enum Cell {E, X, O}
private Cell[][]board;

//Initializes the board to empty
public Board(){
	board = new Cell[3][3];
	for (int i=0; i<board.length; i++){
		for (int j= 0; j<board[i].length; j++){
			board [	i][j] = Cell.E;
			}
		}
	}

//Displays the board correctly
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
//Goes through each possible win condition and returns the winner
public boolean victory(int turn){
	if(board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] !=  Cell.E){
		System.out.println("Player " + turn + " has won");
		return true;
		}
	if(board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] !=  Cell.E){
		System.out.println("Player " + turn + " has won");
		return true;
		}
	if(board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] !=  Cell.E){
		System.out.println("Player " + turn + " has won");
		return true;
		}
	if(board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] !=  Cell.E){
		System.out.println("Player " + turn + " has won");
		return true;
		}
	if(board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] !=  Cell.E){
		System.out.println("Player " + turn + " has won");
		return true;
		}
	if(board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[0][2] !=  Cell.E){
		System.out.println("Player " + turn + " has won");
		return true;
		}
	if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] !=  Cell.E){
		System.out.println("Player " + turn + " has won");
		return true;
		}
	if(board[2][0] == board[1][1] && board[2][0] == board[0][2] && board[2][0] !=  Cell.E){
		System.out.println("Player " + turn + " has won");
		return true;
		}
	return false;
	}

public void exit(){
	System.out.println("Progran exiting");
	}
//Places the players designated piece onto the board
public void setCell(int r, int c, Cell value){
	board[r][c]= value;
	}
}
