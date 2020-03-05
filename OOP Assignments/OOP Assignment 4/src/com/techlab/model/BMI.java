package com.techlab.model;

public class BMI {
	
	double height, weight, BMI;
	
	public BMI(double weight, double height){
		this.height = checkHeight(height);
		this.weight = checkWeight(weight);
		
		calculateBMI();
	}

	private double checkHeight(double height) {
		if(height <= 0) {
			height = 1;
		}
		
		return height/3.281;
	}

	private double checkWeight(double weight) {
		if(weight <= 0) {
			weight = 1;
		}
		return weight;
	}
	
	private double calculateBMI(){
		BMI =  (weight / (height*height));
		return BMI;
	}
	
	public String catagory() {
		if(BMI < 18.5) {
			return "your BMI is = "+ BMI + " and you are underWeight";
		}
		else if(BMI > 24.9) {
			return "your BMI is = "+ BMI + " and you are overWeight";
		}
		
		return "your BMI is = "+ BMI + " and you are Normal";
	}

}
