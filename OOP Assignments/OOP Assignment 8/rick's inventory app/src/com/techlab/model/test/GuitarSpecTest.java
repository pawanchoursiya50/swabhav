package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
//import org.junit.Test; why this Test is not working properly
import org.junit.jupiter.api.Test;



import com.techlab.model.Builder;
import com.techlab.model.GuitarSpec;
import com.techlab.model.Type;
import com.techlab.model.Wood;

public class GuitarSpecTest {

	static GuitarSpec spec;
	
	@BeforeAll
	public static void getInsatance_of_GuitarSpec() {
		spec = new GuitarSpec(Builder.FENDER, "xyz456", Type.ACOUSTIC, Wood.ADIRONDACK, Wood.COCOBOLO, 4);
	}
	
	@Test
	public void test_instanceof_GuitarClass() {
		assertEquals(true, spec instanceof GuitarSpec);
	}
	
	@Test
	public void test_getBuilder__return_builderOf_guitar() {
		assertEquals(Builder.FENDER, spec.getBuilder());
	}
	
	@Test
	public void test_getType_return_ACOUSTIC() {
		assertEquals(Type.ACOUSTIC, spec.getType());
	}
	
	@Test
	public void test_getModel_return_xyz456() {
		assertEquals("xyz456", spec.getModel());
	}
	
	@Test
	public void test_getBackWood_return_ADIRONDACK() {
		assertEquals(Wood.ADIRONDACK, spec.getBackWood());
	}
	
	@Test
	public void test_getTopWood_return_COCOBOLO() {
		assertEquals(Wood.COCOBOLO, spec.getTopWood());
	}
	
}



























