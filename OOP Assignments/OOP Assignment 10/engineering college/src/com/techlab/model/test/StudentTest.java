package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlab.model.Student;

class StudentTest {

	static Student stud;
	static SimpleDateFormat format;
	
	@BeforeAll
	static void generate_instanceOf_studentClass() throws ParseException {
		format = new SimpleDateFormat("dd/mm/yyyy");
		stud = new Student(101, "mumbai", format.parse("15/02/1992"), "computer");
	}
	
	@Test
	void test_Student_id_return_101() {
		assertEquals(101, stud.getId());
	}
	
	@Test
	void test_Student_address_return_mumbai() {
		assertEquals("mumbai", stud.getAddress());
	}
	
	@Test
	void test_Student_dob() {
		assertEquals("15/02/1992", format.format(stud.getDob()) );
	}
	
	@Test
	void test_Student_Branch_return_computer() {
		assertEquals("computer", stud.getBranch());
	}

}
