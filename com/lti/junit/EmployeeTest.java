package com.lti.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	
	@Test
	public void mySimpleEqualsTest()  // equal method is overidden
	{
		String expectedname = "Raj";
		assertEquals(expectedname , Employee.getEmpNameWithHighestSalary());
	}
	
	@Test
	public void myObjectEqualsTest()
	{
		Employee expectedEmpObj = new Employee(1,"Raj",15000);
		
		assertEquals(expectedEmpObj , Employee.getHighestPaidEmployee());
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

}
