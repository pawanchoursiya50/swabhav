package com.techlab.boxing;

public class AutoBoxingTest {

	public static void main(String[] args) {
		
		//Auto Boxing
		Integer phy = 60;
		Double math = 77.53;
		Float NLP = (float) 55.15;
		Character alpha = 'A';
		
		//Auto UnBoxing
		int unBoxPhy = phy;
		double unBoxMath = math;
		float unBoxNLP = NLP;
		char firstAlpha = alpha;
		
		System.out.println("Physics :- " + unBoxPhy);
		System.out.println("Math :- " + unBoxMath);
		System.out.println("NLP :- " + unBoxNLP);
		System.out.println("First alpha :- " + firstAlpha);
		

	}

}
