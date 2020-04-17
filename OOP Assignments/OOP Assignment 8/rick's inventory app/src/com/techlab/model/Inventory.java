package com.techlab.model;

public class Inventory {

	Guitar[] guitars = new Guitar[10];
	private int possition = 0;

	public void addGuitar(String serialNumber, double price, String model, Builder builder, Type type, Wood backWood,
			Wood topWood, int numString) {

		Guitar guitar = new Guitar(serialNumber, price, new GuitarSpec(builder, model, type, backWood, topWood, numString));
		guitars[possition] = guitar;
		possition++;
	}

	public Guitar getGuitar(String serialNumber) {

		for (Guitar guitar : guitars) {

			if (guitar.getSerialNumber().equalsIgnoreCase(serialNumber)) {
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

//				if (!guitar.getSpec().getModel().equalsIgnoreCase(wantGuitar.getModel())) {
//					continue;
//				}
//				if (!guitar.getSpec().getBuilder().equals(wantGuitar.getBuilder())) {
//					continue;
//				}
//				if (!guitar.getSpec().getType().equals(wantGuitar.getType())) {
//					continue;
//				}
//				if (!guitar.getSpec().getBackWood().equals(wantGuitar.getBackWood())) {
//					continue;
//				}
//				if (!guitar.getSpec().getTopWood().equals(wantGuitar.getTopWood())) {
//					continue;
//				}
//
//				availableGuitar[possition] = guitar;
//				possition++;

}
