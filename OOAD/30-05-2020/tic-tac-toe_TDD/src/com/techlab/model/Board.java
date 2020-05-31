package com.techlab.model;

import java.util.ArrayList;

public class Board {

	ArrayList<Cell> cells = new ArrayList<Cell>();

	public Board() {
		// Each board have 9 cells
		cells.add(new Cell());
		cells.add(new Cell());
		cells.add(new Cell());
		cells.add(new Cell());
		cells.add(new Cell());
		cells.add(new Cell());
		cells.add(new Cell());
		cells.add(new Cell());
		cells.add(new Cell());
	}

	public boolean mark(int possition, Mark mark) {
		try {
			cells.get(possition).markCell(mark);
			return true;
		}
		catch(NotEmptyException ex) {
			System.out.println(ex.getMessage());
			return false;
		}
	}
}
