package isp.solutuon.test;

import isp.solutuon.*;

public class ISPTest {
	public static void main(String args[]) {
		Robot b = new Robot();
		Manager m = new Manager();

		atTheWorkStation(m);
		atTheCafeteria(m);

		atTheWorkStation(b);
	}

	public static void atTheWorkStation(WorkableEatable w) {
		w.startWork();
		w.stopWork();
	}

	public static void atTheCafeteria(WorkableEatable w) {
		w.startEat();
		w.stopEat();
	}


	private static void atTheWorkStation(Robot b) {
		b.startWork();
		b.stopWork();
	}

	

}