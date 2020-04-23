package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlab.model.Builder;
import com.techlab.model.Guitar;
import com.techlab.model.GuitarSpec;
import com.techlab.model.Type;
import com.techlab.model.Wood;

class GuitarTest {

	static Guitar guitar;
	
	@BeforeAll
	public static void creat_Guitar_object() {
		guitar = new Guitar("xyz123", 50000, new GuitarSpec(Builder.COLLINGS, "fender", Type.ELECTRIC,
				Wood.ALDER, Wood.ADIRONDACK, 5));
	}
	
	@Test
	public void test_getSpec_return_ObjOf_GuitarClass() {
		
		assertEquals(true, guitar.getSpec() instanceof  GuitarSpec);

	}
	
	@Test
	public void test_getPrice_shouldReturn_50000_asGuitarPrice() {
		assertEquals(50000, guitar.getPrice());
	}
	
	@Test
	public void test_getPrice_Return_8000_whichPassed_througth_setPrice() {
		guitar.setPrice(8000);
		assertEquals(8000, guitar.getPrice());
	}
	

	
	@Test
	public void test_getSerialNumber_shouldReturn_xyz123() {
		
		assertEquals("xyz123", guitar.getSerialNumber() );
	}


}
