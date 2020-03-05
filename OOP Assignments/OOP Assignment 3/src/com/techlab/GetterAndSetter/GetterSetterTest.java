package com.techlab.GetterAndSetter;

public class GetterSetterTest {

	public static void main(String[] args) {
		
		GetterSetter GS_obj = new GetterSetter();
		GS_obj.setName("Jon");
		GS_obj.setAge(30);
		GS_obj.setLocation("NYK");
		
		System.out.println("Name :- " + GS_obj.getName());
		System.out.println("Location :- " + GS_obj.getLocation());
		System.out.println("Age :- " + GS_obj.getAge());
	}

}
