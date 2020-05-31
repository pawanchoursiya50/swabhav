package isp.solutuon;

public class Robot implements Workable{

	@Override
	 public void startWork() {
	  System.out.println("Robot start work");

	 }

	 @Override
	 public void stopWork() {
	  System.out.println("Robot stop work");

	 }

}
