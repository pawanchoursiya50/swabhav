package com.techlab.model;

import java.util.ArrayList;
import java.util.Scanner;

public class GameTerminal {
	
	Scanner scn;
	Game game;
	
	int randomNumber;
	int userNumber;
	int result;
	boolean status = false;
	int count = 1;

	public GameTerminal(){
		scn = new Scanner(System.in);
		game = new Game();

	}
	
	public void start() {
		char choice;
		do {
			playGame();
			status = false;
			System.out.println("Do you want to play again. /nYes - y     NO - n ::-");
			choice = scn.next().charAt(0);
		}while(choice == 'y' || choice == 'Y');
	}
	
	public void playGame() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		System.out.println("Enter your guess : ");
		userNumber = scn.nextInt();
		randomNumber = game.generateRandomNumber();
		arr.add(userNumber);

		
		while (!status) {
//			System.out.println("Enter your guess : ");
//			userNumber = scn.nextInt();
//			arr.add(userNumber);
			
			result = game.matchNumber(randomNumber, userNumber);
			status = checkResult(result);

			if (status == true) {
				showDetails(arr);
			} else {
				count++;
				System.out.println("Enter your another guess :- ");
				userNumber = scn.nextInt();
				arr.add(userNumber);
			}
		}
	}
	
	public static boolean checkResult(int result) {

		if (result < 0) {
			System.out.println("Sorry! Too low");
			return false;
		} else if (result > 0) {
			System.out.println("Sorry! Too high");
			return false;

		}
		return true;
	}
	
	public void showDetails(ArrayList<Integer> arr) {
		System.out.println("you won the match and you attempted " + count + " times");
		System.out.println("These are you all actual tries ::- ");
		
		for(int element : arr) {
			System.out.println(element);
		}		
	}
	
}
