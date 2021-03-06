package com.techlab.model;

public class Player {

	private int id;
	private String name;
	private int age;

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Player(int id, String name) {
		this(id, name, 18);
	}
 
	public Player whoIsElder(Player p) {
		if(this.age > p.age) {
			return this;
		}
		return p;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
