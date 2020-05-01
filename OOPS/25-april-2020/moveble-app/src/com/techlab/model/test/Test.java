package com.techlab.model.test;

import com.techlab.model.*;

public class Test {

	public static void main(String[] args) {

		IMoveble[] movable = new IMoveble[3];
		
		Bike bike = new Bike();
		Car car = new Car();
		Truck truck = new Truck();
		
		movable[0] = bike;
		movable[1] = car;
		movable[2] = truck;
		
		startRace(movable);
	}
	
	private static void startRace(IMoveble[] movebles) {
		
		for(IMoveble moveble : movebles) {
			moveble.move();
		}
	}

}
