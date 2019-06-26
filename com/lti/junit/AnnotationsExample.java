package com.lti.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationsExample {
	
	private ArrayList<String> list;
	
	@BeforeClass
	public static void m1()
	{
		System.out.println("using @BeforeClass,executed before all test" + "cases");
	}
	@Before
	public void m2() throws Exception {
		list= new ArrayList<String>();
		System.out.println("using @Before annotations,executed before each case" + "test cases");
	}

	@AfterClass
	public static void m3() throws Exception {
		
		System.out.println("Using @AfterClass , executed after all the test case");
	}

	@After
	public void m4() {
		list.clear();
		System.out.println("Using @After , executed after each test case");
		
	}
	
	@Test
	public void m5()
	{
		list.add("test");
		assertFalse(list.isEmpty());
		assertEquals(1,list.size());
		System.out.println();
	}
	
	@Ignore
	public void m6()
	{
		System.out.println("Using @Ignore, this executed is ignored");
	}
	@Test(timeout = 10)
	public void m7()
	{
		System.out.println("Using @Test(timeout), it can be used ot enforce timeout " +"in JUnit test case");
		
	}
	@Test(expected = NoSuchMethodException.class)
	//@Test(enabled = false)
	public void m8()
	{
		//System.out.println("Inside m6()");
		
		System.out.println("Using @Test(excepted), it will check for" +"specified exception during its execution");
	}
	

}
