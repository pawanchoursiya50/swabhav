package com.techlab.model.test;
import com.techlab.model.Player;
public class PlayerTest {

	public static void main(String[] args) {
		
		Player sachine = new Player(101, "sachine", 42);
		Player virat = new Player(101, "virat");
		
		printInfo(sachine);
		printInfo(virat);
		
		Player p = sachine.whoIsElder(virat);
		printInfo(p);
	}

	static void printInfo(Player p) {
		System.out.println("id : "+ p.getId());
		System.out.println("name : "+ p.getName());
		System.out.println("age : "+ p.getAge() +"\n");

	}

}
