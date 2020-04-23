package com.techlab.model;

public class Inventory {

	private Guitar[] guitars = new Guitar[10];
	private int possition = 0;

	public void addGuitar(String serialNumber, double price, String model, Builder builder, Type type, Wood backWood,
			Wood topWood, int numString) {

		guitars[possition] = new Guitar(serialNumber, price,
				new GuitarSpec(builder, model, type, backWood, topWood, numString));
		possition++;
	}

	public Guitar getGuitar(String serialNumber) {

		for (Guitar guitar : guitars) {

			if (guitar != null)
				if (guitar.getSerialNumber().equals(serialNumber)) {
					return guitar;
				}
		}
		return null;
	}

	public Guitar[] search(GuitarSpec wantGuitar) {
		Guitar[] availableGuitar = new Guitar[10];
		int possition = 0;

		for (Guitar guitar : guitars) {
			if (guitar != null) {
				if (guitar.getSpec().match(wantGuitar)) {
					availableGuitar[possition] = guitar;
					possition++;
				}
			}
		}
		return availableGuitar;
	}

	public Guitar[] getGuitarArray() {
		return guitars;
	}
}
