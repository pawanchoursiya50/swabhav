package ocp.solution1;

public class SimpleInterest implements IInterest{

	FixedDeposit fd;
	public SimpleInterest(FixedDeposit fd) {
		this.fd = fd;
	}

	@Override
	public float calculate() {
		return (float) ((fd.getPricipleAmt() * (1 + (fd.calculateRate())*fd.getDuration())) - fd.getPricipleAmt());
	}

}
