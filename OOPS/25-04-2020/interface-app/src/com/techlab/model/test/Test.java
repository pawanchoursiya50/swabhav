package com.techlab.model.test;

import com.techlab.model.*;

public class Test {

	public static void main(String[] args) {
		
		Man man = new Man();
		Boy boy = new Boy();
		
		cinemaHall(boy);
		
//		cinemaHall(man);
		
		partyHall(boy);
		partyHall(man);
	}
	
	private static void cinemaHall(IEmotionable obj) {
		System.out.println("At the cinema hall");
		
		obj.cry();
		obj.laugh();
	}
	
	private static void partyHall(IMannerable obj) {
		System.out.println("At the partyHall");

		obj.wish();
		obj.depart();
	}
}
