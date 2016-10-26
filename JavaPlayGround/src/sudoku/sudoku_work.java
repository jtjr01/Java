/*
 * Name: Jose Terrones Jr.
 * Purpose: This program will solve the sudoku problem given.
 * It will first initialize the array with the given numbers
 * and then it will solve it and print the result.
 */

package sudoku;

public class sudoku_work {
	static int dimension = 9;
	static int sudoku [][] = new int [dimension][dimension];
	
	public static void initialize()
	{
		sudoku[0][0] = 1; 
		sudoku[0][1] = 4;
		sudoku[0][2] = 7;
		sudoku[0][3] = 2;
		sudoku[0][4] = 3;
		sudoku[0][5] = 8;
		sudoku[0][6] = 5;
		sudoku[0][7] = 6;
		sudoku[0][8] = 9;
		sudoku[1][0] = 2;
		sudoku[1][1] = 5;
		sudoku[1][2] = 8;
		sudoku[1][3] = 1;
		sudoku[1][4] = 6;
		sudoku[1][5] = 9;
		sudoku[1][6] = 3;
		sudoku[1][7] = 4;
		sudoku[1][8] = 7;
		sudoku[2][0] = 3; 
		sudoku[2][1] = 6;
		sudoku[2][2] = 9;
		sudoku[2][3] = 4;
		sudoku[2][4] = 5;
		sudoku[2][5] = 7;
		sudoku[2][6] = 1;
		sudoku[2][7] = 2;
		sudoku[2][8] = 8;
		sudoku[3][0] = 4; 
		sudoku[3][1] = 7;
		sudoku[3][2] = 1;
		sudoku[3][3] = 3;
		sudoku[3][4] = 8;
		sudoku[3][5] = 0;
		sudoku[3][6] = 6;
		sudoku[3][7] = 9;
		sudoku[3][8] = 5;
		sudoku[4][0] = 5; 
		sudoku[4][1] = 8;
		sudoku[4][2] = 2;
		sudoku[4][3] = 6;
		sudoku[4][4] = 9;
		sudoku[4][5] = 0;
		sudoku[4][6] = 4;
		sudoku[4][7] = 7;
		sudoku[4][8] = 3;
		sudoku[5][0] = 6; 
		sudoku[5][1] = 9;
		sudoku[5][2] = 3;
		sudoku[5][3] = 5;
		sudoku[5][4] = 7;
		sudoku[5][5] = 0;
		sudoku[5][6] = 2;
		sudoku[5][7] = 8;
		sudoku[5][8] = 1;
		sudoku[6][0] = 7; 
		sudoku[6][1] = 1;
		sudoku[6][2] = 4;
		sudoku[6][3] = 8;
		sudoku[6][4] = 2;
		sudoku[6][5] = 3;
		sudoku[6][6] = 9;
		sudoku[6][7] = 5;
		sudoku[6][8] = 6;
		sudoku[7][0] = 8; 
		sudoku[7][1] = 2;
		sudoku[7][2] = 5;
		sudoku[7][3] = 9;
		sudoku[7][4] = 1;
		sudoku[7][5] = 6;
		sudoku[7][6] = 7;
		sudoku[7][7] = 3;
		sudoku[7][8] = 4;
		sudoku[8][0] = 9; 
		sudoku[8][1] = 3;
		sudoku[8][2] = 6;
		sudoku[8][3] = 7;
		sudoku[8][4] = 4;
		sudoku[8][5] = 5;
		sudoku[8][6] = 8;
		sudoku[8][7] = 1;
		sudoku[8][8] = 2;
		System.out.println("This is the problem.");
		print(sudoku);
		solve(sudoku);
		System.out.println("This is after it is solved.");
		print(sudoku);
	}
	//Method will go through the entire board till a 0 is found
	public static void solve(int [][] sudoku)
	{
		int i,j;
		for(i = 0; i < dimension; i++)
		{
			for (j = 0 ; j < dimension; j++)
			{
				if (sudoku[i][j] == 0)
				{
					for (int val = 1; val <= 9; ++val)
					{
						if(check(val,i,j, sudoku))
						{
							sudoku[i][j] = val;
						}
					}
				}
			}
		}
	}
	//This method is to check if the number being placed is valid or not.
	public static boolean check(int val, int i, int j, int [][] sudoku)
	{
		 for (int k = 0; k < 9; ++k)
		 {
	            if (val == sudoku[i][k])
	            {
	                return false;
	            }
		 }
		return true;
	}
	public static void print(int [][] sudoku)
	{
		int i, j;
		for(i = 0; i < dimension; i++)
		{
			System.out.print("|");
			for(j = 0; j < dimension; j++)
			{
				if (j == 3)
				{
					System.out.print("|");
				}
				else if (j == 6)
				{
					System.out.print("|");
				}
				System.out.print(" " + sudoku[i][j] + " ");
			}
			System.out.println("|");
			if (i == 2)
			{
				System.out.println(" -----------------------------");
			}
			else if (i == 5) 
			{
				System.out.println(" -----------------------------");
			}
		}
		System.out.println(" -----------------------------");
	}

}
