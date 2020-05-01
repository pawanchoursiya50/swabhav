package com.techlab.test;

public class BugTest {

	public static void main(String[] args) {

		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);

			int c = a / b;
			System.out.println(c);

		} 
		
		catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("you should pass two number");
		} 
		
		catch (NumberFormatException error) {
			System.out.println("you should pass a proper integer");
		} 
		
		catch(ArithmeticException error) {
			System.out.println("you can't divide a number by zero");
		}
		
		catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("End of main");

	}

}
