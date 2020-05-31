package dip.violation;

public class TextLogger implements Loggarable{

	@Override
	public void log(String errorDetails) {
		System.out.println("Writing to Text file");
		System.out.println("   contents are : " + errorDetails);
	}
}
