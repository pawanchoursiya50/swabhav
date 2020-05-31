package dip.violation;

public class XmlLogger implements Loggarable{

	@Override
	public void log(String errorDetails) {
		System.out.println("Writing to XML file");
		System.out.println("   contents are : " + errorDetails);
	}
}
