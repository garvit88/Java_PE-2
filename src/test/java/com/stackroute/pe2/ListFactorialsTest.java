package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ListFactorialsTest {
	
	static ListFactorials lf;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		lf = new ListFactorials();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		lf = null;

	}

	@Test(expected = NumberFormatException.class)
	public void testValidateInput() {
		lf.integerFactorial("abc");
		lf.longFactorial("no");
		lf.integerFactorial("");
	}
	
	@Test
	public void testIntegerFactorial() {
		assertEquals(
				"testIntegerFactorial(): integerFactorial function failed, the output is not same as expected output",
				"40320",lf.integerFactorial("8"));
	}
	
	@Test 
	public void testIntegerFactorialOutOfRange() {
		assertEquals(
				"testIntegerFactorialOutOfRange(): integerFactorial function failed, the output is not giving out of range",
				"Out of range",lf.integerFactorial("13"));
	}
	
	@Test
	public void testIntegerFactorialFailure() {
		assertNotNull(
				"testIntegerFactorialFailure(): integerFactorial function failed, it is returning null values",
				lf.integerFactorial("10"));
	}
	
	@Test
	public void testLongFactorial() {
		assertEquals(
				"testLongFactorial(): longFactorial function failed, the output is not same as expected output",
				"1307674368000",lf.longFactorial("15"));
	}
	
	@Test 
	public void testLongFactorialOutOfRange() {
		assertEquals(
				"testLongFactorialOutOfRange(): longFactorial function failed, the output is not giving out of range",
				"Out of range",lf.longFactorial("22"));
	}
	
	@Test
	public void testLongFactorialFailure() {
		assertNotNull(
				"testLongFactorialFailure(): longFactorial function failed, it is returning null values",
				lf.longFactorial("10"));
	}
}
