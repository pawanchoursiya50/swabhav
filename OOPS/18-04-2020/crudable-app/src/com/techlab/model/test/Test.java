package com.techlab.model.test;

import com.techlab.model.*;

public class Test {

	public static void main(String[] args) {
		
		DataBase db = new DataBase();
		
		db.doDBOperation( new AddressDB() );
		db.doDBOperation( new CustomerDB() );
		db.doDBOperation( new OrderDB() );

	}
}
