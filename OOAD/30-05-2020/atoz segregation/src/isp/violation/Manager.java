package isp.violation;

public class Manager implements IWorker{


	 @Override
	 public void startWork() {
	 System.out.println("Manager start work");
	  
	 }

	 @Override
	 public void stopWork() {
	  System.out.println("Manager stop work");
	  
	 }

	 @Override
	 public void startEat() {
	  System.out.println("Manager start eat");
	  
	 }

	 @Override
	 public void stopEat() {
	  System.out.println("Manager stop eat");
	  
	 }
}
