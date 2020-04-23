package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlab.model.*;


class InventoryTest {

	private static Inventory inventory;
	
	@BeforeAll
	public static void get_instanceOf_Inventory() {
		inventory = new Inventory();
		inventory.addGuitar("xyz123", 55000, "fedral", Builder.ANY, Type.ACOUSTIC, Wood.ADIRONDACK, Wood.CEDAR, 4);
		inventory.addGuitar("abc", 55000, "fender", Builder.ANY, Type.ACOUSTIC, Wood.ADIRONDACK, Wood.CEDAR, 4);

	}
	
	@Test
	public void test_addGuitar_add_new_Guitar_inGuitarArray() {
		Guitar[] guitars = inventory.getGuitarArray();
		
		assertEquals(true, guitars[0] instanceof Guitar);
	}

	@Test
	public void test_getGuitar_return_GuitarWith_serialNo_abc() {
		
		assertEquals(true, inventory.getGuitar("abc") instanceof Guitar);
	
	}
	
	@Test
	public void test_getGuitar_searchWithSerialno_opq_return_NULL() {
		
		assertEquals(null, inventory.getGuitar("opq"));
	
	}
	
	@Test
	public void test_search_return_arrayOf_Guitar() {
		
		GuitarSpec wantGuitar = new GuitarSpec(Builder.ANY, "fender", Type.ACOUSTIC, Wood.ADIRONDACK, Wood.CEDAR, 4);
		Guitar[] guitars = inventory.search(wantGuitar);

		assertEquals(true, guitars[0] instanceof Guitar);
	}
	
	@Test
	public void test_search_return_arrayOf_Guitar_withNULL_values() {
		
		GuitarSpec wantGuitar = new GuitarSpec(Builder.COLLINGS, "fender", Type.ELECTRIC, Wood.ADIRONDACK, Wood.CEDAR, 4);
		Guitar[] guitars = inventory.search(wantGuitar);

		assertEquals(false, guitars[0] instanceof Guitar);
	}
	
	
}



































