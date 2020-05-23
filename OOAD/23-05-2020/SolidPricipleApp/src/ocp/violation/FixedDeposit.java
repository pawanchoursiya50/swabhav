package ocp.violation;

public class FixedDeposit {

	private int accNo;
	private String name;
	private double pricipleAmt;
	private int duration;
	private FestivalType festival;
	
	public FixedDeposit(int accNo, String name, double pricipleAmt, int duration, FestivalType festival) {
		this.accNo = accNo;
		this.name = name;
		this.pricipleAmt = pricipleAmt;
		this.duration = duration;
		this.festival = festival;
	}
	
	private float calculateRate() {
		if(festival == FestivalType.NORMAL) {
			return (float) 0.07;
		}
		else if(festival == FestivalType.DIWALI) {
			return (float) 0.08;
		}
		return (float) 0.09;
	}
	
	public float calculateSimpleInterest() {
		
		return (float) ((pricipleAmt * (1 + (calculateRate())*duration)) - pricipleAmt);
	}
	
	//If we need to add compound interest than we have to change this class

}
