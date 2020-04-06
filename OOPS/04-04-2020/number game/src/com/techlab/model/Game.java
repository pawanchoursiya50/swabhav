package com.techlab.model;

//import java.util.Random;

public class Game {

	public int generateRandomNumber() {
		
		return ((int) (Math.random()*99)) + 1;
	}
	
	public int matchNumber(int randomNumber, int userChoice) {
		if(userChoice > randomNumber) {
			return 1;
		}
		else if(userChoice < randomNumber) {
			return -1;
		}
		return 0;
	}

	public void checkCondition(boolean status) {
		// TODO Auto-generated method stub
		
	}
}
