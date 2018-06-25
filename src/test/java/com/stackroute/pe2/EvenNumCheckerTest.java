package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvenNumCheckerTest {
	// to check the output is correct
	// to check it is not returning null
	// to check 
	
	@Test(expected = NumberFormatException.class)
	public void testValidateInput() {
		EvenNumChecker.isEven("a");
	}
	
	@Test
	public void testIsEven() {
		assertTrue(
				"testIsEven(): isEven function failed, it is returning false even if the input is even",
				EvenNumChecker.isEven("248"));
		assertFalse(
				"testIsEven(): isEven function failed, it is returning true even if the input is odd",
				EvenNumChecker.isEven("247"));
	}
	
	@Test
	public void testIsEvenFailure() {
		assertNotNull(
				"testIsEvenFailure(): isEven function failed, it is returning null values",
				EvenNumChecker.isEven("248"));
	}

}
