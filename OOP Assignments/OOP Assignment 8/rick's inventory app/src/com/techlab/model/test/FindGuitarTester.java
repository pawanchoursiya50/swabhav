package com.techlab.model.test;

import com.techlab.model.Builder;
import com.techlab.model.Guitar;
import com.techlab.model.Inventory;
import com.techlab.model.Type;
import com.techlab.model.Wood;

public class FindGuitarTester {

	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		Guitar wantGuitar = new Guitar("", 0, "fender", Builder.COLLINGS, Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

		Guitar[] guitars = inventory.search(wantGuitar);
		if (guitars != null) {
			printInfo(guitars);
		} else {
			System.out.println("No Guitar availbale according to your choice");
		}
	}

	private static void printInfo(Guitar[] guitars) {
		for (Guitar guitar : guitars) {
			if (guitar != null) {
				System.out.println("Serial number : " + guitar.getSerialNumber());
				System.out.println("Price : " + guitar.getPrice());
				System.out.println("Builder : " + guitar.getBuilder());
				System.out.println("Model : " + guitar.getBuilder());
				System.out.println("Type : " + guitar.getType());
				System.out.println("BackWood : " + guitar.getBackWood());
				System.out.println("TopWood : " + guitar.getTopWood() +"\n");
			}

		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("abc121", 10000.0, "fender", Builder.COLLINGS, Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("abc122", 50000.0, "stract1572", Builder.OLSON, Type.ACOUSTIC, Wood.ALDER, Wood.COCOBOLO);
		inventory.addGuitar("abc123", 83000.0, "stract1573", Builder.MARTIN, Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.MAPLE);
		inventory.addGuitar("abc124", 80000.0, "stract1574", Builder.RYAN, Type.ELECTRIC, Wood.MAHOGANY, Wood.SITKA);
		inventory.addGuitar("abc125", 67000.0, "stract1575", Builder.ANY, Type.ACOUSTIC, Wood.MAHOGANY, Wood.BRAZILIAN_ROSEWOOD);
		inventory.addGuitar("abc126", 210000.0, "fender", Builder.COLLINGS, Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

	}

}
