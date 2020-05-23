package isp.solution1;

public class Square extends Shape{

	int side;
	
	public Square(int side) {
		this.side = side;
	}

	@Override
	public double calculateArea() {
		return side * side;
	}
	
	public void setSide(int side) {
		this.side = side;
	}
	
	public int getSide() {
		return side;
	}
	
}
