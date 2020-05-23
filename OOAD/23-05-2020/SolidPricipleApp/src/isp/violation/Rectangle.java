package isp.violation;

public class Rectangle {

	protected int width;
	protected int heigth;
	
	public Rectangle(int width, int heigth) {
		this.width = width;
		this.heigth = heigth;
	}

	public float calculateArea() {
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
