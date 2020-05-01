package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlab.model.Professor;
import com.techlab.model.Student;

class ProfessorTest {
	
	static Professor professor;
	static SimpleDateFormat format;
	
	@BeforeAll
	static void generate_instanceOf_studentClass() throws ParseException {
		format = new SimpleDateFormat("dd/mm/yyyy");
		professor = new Professor(102, "mumbai", format.parse("15/02/1992"), (double)40000);
	}
	
	@Test
	void test_Professor_id_return_102() {
		assertEquals(102, professor.getId());
	}
	
	@Test
	void test_Professor_address_return_mumbai() {
		assertEquals("mumbai", professor.getAddress());
	}
	
	@Test
	void test_Professor_dob() {
		assertEquals("15/02/1992", format.format(professor.getDob()) );
	}
	
	@Test
	void test_Professor_salary_ruturn_40000() {
		assertEquals(40000, professor.getBasicSalary());
	}
	
	@Test
	void test_professor_NetSalary_return_480000(){
		assertEquals(480000, professor.calculateNetSalary());
	}

}
