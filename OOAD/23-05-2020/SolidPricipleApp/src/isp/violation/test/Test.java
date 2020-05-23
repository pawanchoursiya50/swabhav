package isp.violation.test;

import isp.violation.Rectangle;
import isp.violation.Square;

public class Test {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle(10, 20);
		shouldNotChangeWidth_IfHeightIsModified(rect);

		Rectangle rect2 = new Square(20);
		shouldNotChangeWidth_IfHeightIsModified(rect2);

	}

	private static void shouldNotChangeWidth_IfHeightIsModified(Rectangle rect) {

		int beforeWidth = rect.getWidth();

		rect.setHeigth(rect.getHeigth() + 20);

		int afterWidth = rect.getWidth();

		System.out.println(beforeWidth == afterWidth);

	}

}
