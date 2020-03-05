package com.techlab.enumerations;

enum NameOfPlanets{
	Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune;
	
	//Constructor in Enumerations
	private NameOfPlanets(){
		System.out.println("this is constructor of "+ this.toString());
	}
	
	//Method in Enumerations
	public void sun() {
		System.out.println("Center of solar system is SUN");
	}
}

public class EnumerationTest {

	public static void main(String[] args) {
		
		//Creating variable of 'NameOfPlanets' type
		NameOfPlanets planet1 = NameOfPlanets.Mercury;
		System.out.println("\nFirst planet is :- "+ planet1  +"\n");
		
		
		//Creating array of 'NameOfPlanets' type which will
		//store all constants of 'NameOfPlanets'	
		NameOfPlanets[] allPlanets = NameOfPlanets.values();
		 
		for(NameOfPlanets planet : allPlanets) {
			System.out.print(planet +"\t");
		}System.out.println();
		
		//calling the method of Enumerations
		planet1.sun();
	}

}
