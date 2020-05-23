package isp.solution1;

public class Rectangle extends Shape {

	protected int width;
	protected int heigth;
	
	public Rectangle(int width, int heigth) {
		this.width = width;
		this.heigth = heigth;
	}

	@Override
	public double calculateArea() {
		return width * heigth;
	}
	
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	
}
