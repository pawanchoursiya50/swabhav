package com.techlab.model.test;

import com.techlab.model.Builder;
import com.techlab.model.Guitar;
import com.techlab.model.GuitarSpec;
import com.techlab.model.Inventory;
import com.techlab.model.Type;
import com.techlab.model.Wood;

public class FindGuitarTester {

	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec wantGuitar = new GuitarSpec(Builder.COLLINGS, "fender", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);

		Guitar[] guitars = inventory.search(wantGuitar);
		if (guitars[0] != null) {
			printInfo(guitars);
		} else {
			System.out.println("No Guitar availbale according to your choice");
		}
	}

	private static void printInfo(Guitar[] guitars) {
		for (Guitar guitar : guitars) {
			if (guitar != null) {
				GuitarSpec spec = guitar.getSpec();
				System.out.println("Serial number : " + guitar.getSerialNumber());
				System.out.println("Price : " + guitar.getPrice());
				System.out.println("Builder : " + spec.getBuilder());
				System.out.println("Model : " + spec.getBuilder());
				System.out.println("Type : " + spec.getType());
				System.out.println("BackWood : " + spec.getBackWood());
				System.out.println("TopWood : " + spec.getTopWood() +"\n");
			}

		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("abc121", 10000.0, "fender", Builder.COLLINGS, Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);
		inventory.addGuitar("abc122", 50000.0, "stract1572", Builder.OLSON, Type.ACOUSTIC, Wood.ALDER, Wood.COCOBOLO, 9);
		inventory.addGuitar("abc123", 83000.0, "stract1573", Builder.MARTIN, Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.MAPLE, 10);
		inventory.addGuitar("abc124", 80000.0, "stract1574", Builder.RYAN, Type.ELECTRIC, Wood.MAHOGANY, Wood.SITKA, 15);
		inventory.addGuitar("abc125", 67000.0, "stract1575", Builder.ANY, Type.ACOUSTIC, Wood.MAHOGANY, Wood.BRAZILIAN_ROSEWOOD, 7);
		inventory.addGuitar("abc126", 210000.0, "fender", Builder.COLLINGS, Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);

	}

}
