package isp.violation;

public class Square extends Rectangle{

	public Square(int side) {
		super(side, side);
	}

	@Override
	public void setHeigth(int side) {
		heigth = side;
		width = side;
	}
	
	@Override
	public void setWidth(int side) {
		super.setWidth(side);
		super.setHeigth(side);

	}

}
