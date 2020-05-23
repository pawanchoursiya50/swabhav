package ocp.solution1;

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
	
	float calculateRate() {
		if(festival == FestivalType.NORMAL) {
			return (float) 0.07;
		}
		else if(festival == FestivalType.DIWALI) {
			return (float) 0.08;
		}
		return (float) 0.09;
	}
	
	public float calculateInterest(IInterest interest) {
		
		return interest.calculate();
	}

	public int getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public double getPricipleAmt() {
		return pricipleAmt;
	}

	public int getDuration() {
		return duration;
	}

	public FestivalType getFestival() {
		return festival;
	}

	
}
