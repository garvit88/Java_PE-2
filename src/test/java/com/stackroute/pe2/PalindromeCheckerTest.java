package com.stackroute.pe2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PalindromeCheckerTest {
	// Separate for both reverse and palindrome functions
	// check if the input is correct
	// answer is not null if there is some input
	// answer is null if the input is null

	 static PalindromeChecker p;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		p = new PalindromeChecker();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		p = null;

	}
	
	@Test
	public void testReverse() {
		assertEquals(
				"testReverse(): reverse function failed, the reverse returned by the function is not as expected",
				"gnihtemos",p.reverse("something"));
		assertEquals(
				"testReverse(): reverse function failed, the reverse returned by the function is not as expected",
				"1579",p.reverse("9751"));
	}
	
	@Test
	public void testReverseFailure() {
		assertNotNull(
				"testReverseFailure(): reverse function failed, giving null values",
				p.reverse("pqe"));
		assertNotEquals(
				"testReverseFailure(): reverse function failed, expected and the actual output not matches",
				157,p.reverse("751"));
		assertNotEquals(
				"testReverseFailure(): reverse function failed, expected and the actual output not matches",
				"abc",p.reverse("abc"));
	}
	
	@Test
	public void testReverseNull() {
		assertNull(
				"testReverseNull(): reverse function failed, not giving null value for empty input",
				p.reverse(""));
	}
	
	@Test
	public void testPalindrome() {
		assertTrue(
				"testPalindrome(): palindrome function failed, palindrome returned by the function is not as expected",
				p.palindrome("level"));
		assertTrue(
				"testPalindrome(): palindrome function failed, palindrome returned by the function is not as expected",
				p.palindrome("12321"));
		assertFalse(
				"testPalindrome(): palindrome function failed, palindrome returned by the function is not as expected",
				p.palindrome("someone"));
		assertFalse(
				"testPalindrome(): palindrome function failed, palindrome returned by the function is not as expected",
				p.palindrome("12345"));
	}
	
	@Test
	public void testPalindromeFailure() {
		assertNotNull(
				"testPalindromeFailure(): palindrome function failed, palindrome giving null values",
				p.palindrome("aba"));
	}

}
