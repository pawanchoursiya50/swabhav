package isp.violation.test;

import isp.violation.*;

public class ISPTest {
	public static void main(String args[]) {
		Robot b = new Robot();
		Manager m = new Manager();

		atTheWorkStation(m);
		atTheCafeteria(m);

		atTheWorkStation(b);
		atTheCafeteria(b);
	}

	public static void atTheWorkStation(IWorker w) {
		w.startWork();
		w.stopWork();
	}

	public static void atTheCafeteria(IWorker w) {
		w.startEat();
		w.stopEat();
	}

}