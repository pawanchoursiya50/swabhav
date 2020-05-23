package ocp.solution1;

public class CompoundInterest implements IInterest{

	FixedDeposit fd;
	public CompoundInterest(FixedDeposit fd) {
		this.fd = fd;
	}
	
	@Override
	public float calculate() {
		double  power = Math.pow(1 + fd.calculateRate(), fd.getDuration());
		
		return  (float) ( (fd.getPricipleAmt() * power ) - fd.getPricipleAmt() );
	}
}
