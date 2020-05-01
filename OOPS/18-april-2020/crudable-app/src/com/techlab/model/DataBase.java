package com.techlab.model;

public class DataBase {

	public void doDBOperation(ICrudable obj) {
		
		obj.create();
		
		obj.read();

		obj.update();
		
		obj.delete();
	}
}
