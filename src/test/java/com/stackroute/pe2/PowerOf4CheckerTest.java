package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PowerOf4CheckerTest {
	// output is same as expected
	// output is not null if some values is provided
	
	static PowerOf4Checker p;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		p = new PowerOf4Checker();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		p = null;

	}
	
	@Test(expected = NumberFormatException.class)
	public void testValidateInput() {
		p.power("abc");
		p.power("");
	}
	
	@Test
	public void testPower() {
		assertTrue(
				"testPower(): the power function failed, the values returned by the function is not correct",
				p.power("16"));
		assertFalse(
				"testPower(): the power function failed, the values returned by the function is not correct",
				p.power("20"));
	}
	
	@Test
	public void testPowerFaliure() {
		assertNotNull(
				"testPowerFailure(): the power function failed, the values returned by the function is null",
				p.power("16"));
	}
}
