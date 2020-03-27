package com.techlab.model;

public class Person {

	private String name;
	private int age;
	private String gender;
	private float heigth;
	private float weigth;
	
	public Person(String Pname, int P_age, String Pgender, float Pheigth, float Pweigth) {
		this.name = checkName(Pname);
		this.age =  checkDiamention(P_age);
		this.gender = checkGender(Pgender);
		this.heigth = checkDiamention(Pheigth);
		this.weigth = checkDiamention(Pweigth);
	}

	private String checkName(String pname) {
		if(pname == null) {
			return "Unkown";
		}
		return pname;
	}

	private String checkGender(String pgender) {
		if(!pgender.equalsIgnoreCase("male") && !pgender.equalsIgnoreCase("female")) {
			return "Other";
		}
		
		return pgender;
	}
	
	private float checkDiamention(float value) {
		if(value <=0) {
			return 1;
		}
		return value;
	}
	
	private int checkDiamention(int p_age) {
		if(p_age <=0) {
			return 1;
		}
		return p_age;
	}
	
	public void doWorkOut() {
		weigth -= (2*weigth)/100;
	}
	
	public void doEat() {
		weigth += (5*weigth)/100;
	}

	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public float getHeigth() {
		return heigth;
	}

	public float getWeigth() {
		return weigth;
	}
	
	
}
