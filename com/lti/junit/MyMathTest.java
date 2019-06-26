package com.lti.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
	
	MyMath myMath = new MyMath(); 

	@Test
	public void sum_with3number() throws Exception
	{
		
		System.out.println("Test1");
		assertEquals(6 , myMath.sum(new int[] {1,2,3}));
	}
	@Test
	public void sum_with1number() throws Exception {
		System.out.println("Test2");
		assertEquals(4,myMath.sum(new int[] {3,1} ));
	}
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


}
