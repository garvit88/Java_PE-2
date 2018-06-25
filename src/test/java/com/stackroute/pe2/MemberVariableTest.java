package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MemberVariableTest {

	 static MemberVariable mv;
		
		@BeforeClass 
		public static void setup() {
			// This methods runs, before running any one of the test case
			// This method is used to initialize the required variables
			mv = new MemberVariable();
		}

		@AfterClass
		public static void teardown() {
			// This method runs, after running all the test cases
			// This method is used to clear the initialized variables
			mv = null;

		}
		
		@SuppressWarnings("deprecation")
		@Test
		public void testdisplay() {
			assertEquals(
					"testdisplay(): display method failed, the actual output is not same as the expected output",
					new String[] {"Harry Potter", "30", "2500.3"},mv.display());
			assertNotNull(
					"testdisplay(): display function failed, giving null values",
					mv.display());
		}
}
