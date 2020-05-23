package ocp.violation.test;

import ocp.violation.FestivalType;
import ocp.violation.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		
		FixedDeposit fd = new FixedDeposit(101, "Bob", 50000, 3, FestivalType.DIWALI);
		System.out.println("Total interest is : "+ fd.calculateSimpleInterest());
	}

}
