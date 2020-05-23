package ocp.solution1.test;

import ocp.solution1.CompoundInterest;
import ocp.solution1.FestivalType;
import ocp.solution1.FixedDeposit;
import ocp.solution1.SimpleInterest;;

public class FixedDepositTest {

	public static void main(String[] args) {
		
		FixedDeposit fd = new FixedDeposit(101, "Bob", 50000, 3, FestivalType.DIWALI);
		
		System.out.println("Total interest is : "+ fd.calculateInterest(new SimpleInterest(fd)));
		
		System.out.println("Total interest is : "+ fd.calculateInterest(new CompoundInterest(fd)));

	}

}
