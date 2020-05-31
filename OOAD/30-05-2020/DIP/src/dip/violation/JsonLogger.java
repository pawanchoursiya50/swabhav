package dip.violation;

public class JsonLogger implements Loggarable{

	@Override
	public void log(String errorDetails) {
		System.out.println("Writing to JSON file");
		System.out.println("   contents are : " + errorDetails);
	}
}
