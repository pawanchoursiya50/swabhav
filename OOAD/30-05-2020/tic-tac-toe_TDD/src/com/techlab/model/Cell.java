package com.techlab.model;

public class Cell {

	private Mark mark = Mark.Empty;

	public Cell() {

	}

	public boolean isEmpty() {
		if (mark == Mark.Empty) {
			return true;
		}
		return false;
	}

	public void markCell(Mark mark) throws NotEmptyException {

		if (isEmpty()) {
			this.mark = mark;
		} 
		else {
				throw new NotEmptyException("Cell is not Empty!!!!!!!");
		}

	}

	public Mark getMark() {
		return mark;
	}
}
