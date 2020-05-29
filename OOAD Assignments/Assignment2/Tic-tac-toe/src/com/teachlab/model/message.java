package com.teachlab.model;

public class message {

	public static void rules() {
		System.out.println("player1 mark is 'O' and player2 mark is 'X'");
		System.out.println("player1 will play first");
		System.out.println("Each player will give their cordinate and mark");
		System.out.println("cordinate start from '1'");
		System.out.println("Ex. (1 2 X) \n");
	}
	
	public static void printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static void notCorrectCordinate() {
		System.out.print("please enter appropriate coordinates!!!!!\n");
	}
	
	public static void notCorrectMark() {
		System.out.print("Your mark is not correct\n");	
		System.out.println("player1 mark is 'O' and player2 mark is 'X'!!!!!\n");
	}
	
	public static void notEmptyCell() {
		System.out.print("this cell is already occupied, Please choose another  cell!!!!!\n");
	}
}
