package com.lti.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalTest {
	
	
	private Calulator cal;
	@Before
	public void setUp() throws Exception {
	
	cal  = new Calulator();
	}

	@After
	public void tearDown() throws Exception {
		cal = null;
	}
	
	@Test
	public void testAdd()
	{
		double result = cal.add(10.5, 20.32);
		assertEquals(30.82,result,0);
	}
	
	
	@Test
	public void testsub() {

		double result = cal.sub(20, 20);
		assertEquals(0,result,0);
	}
	
	@Test
	public void testmul() {

		double result = cal.mul(5, 2);
		assertEquals(10,result,0);
	}
	
	@Test
	public void testdiv() 
	{

		double result = cal.div(100, 20);
		assertEquals(5,result,0);
	}
	
	
	@Test(expected = ArithmeticException.class)
	public void testdivbyzero()
		{
			cal.div(100, 0);
		}

		
		
	}


