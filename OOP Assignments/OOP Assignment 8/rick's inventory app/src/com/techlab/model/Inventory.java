package com.techlab.model;

public class Inventory {

	Guitar[] guitars = new Guitar[10];
	private int possition = 0;

	public void addGuitar(String serialNumber, double price, String model, Builder builder, Type type, Wood backWood,
			Wood topWood) {

		Guitar guitar = new Guitar(serialNumber, price, model, builder, type, backWood, topWood);
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

	public Guitar[] search(Guitar SearchGuitar) {
		Guitar[] availableGuitar = new Guitar[10];
		int possition = 0;

		for (Guitar guitar : guitars) {
			if (guitar != null) {
				
				if (!guitar.getModel().equalsIgnoreCase(SearchGuitar.getModel())) {
					continue;
				}
				if (!guitar.getBuilder().equals(SearchGuitar.getBuilder())) {
					continue;
				}
				if (!guitar.getType().equals(SearchGuitar.getType())) {
					continue;
				}
				if (!guitar.getBackWood().equals(SearchGuitar.getBackWood())) {
					continue;
				}
				if (!guitar.getTopWood().equals(SearchGuitar.getTopWood())) {
					continue;
				}

				availableGuitar[possition] = guitar;
				possition++;
			}

		}
		return availableGuitar;

	}
}
