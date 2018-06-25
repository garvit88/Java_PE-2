package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentGradesCalculatorTest {

	static StudentGradesCalculator sg;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		sg = new StudentGradesCalculator();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		sg = null;

	}
	
	@Test
	public void testValidRange() {
		assertEquals(
				"testValidateInput(): validating input failed",
				"No in the grades are not in a valid range.",sg.validateInput("2",new int[]{120,20}));
	}
	
	@Test(expected = NumberFormatException.class)
	public void testValidateInput() {
		sg.validateInput("a", new int[]{120,20});
	}
	
	@Test
	public void testParameters() {
		assertEquals(
				"testParameters(): validating input failed, Grades for all the students are not provided",
				"Grades for all the students are not provided",sg.validateInput("4",new int[]{12,20}));
		assertEquals(
				"testParameters(): validating input failed, Grades are more than the total no of students",
				"Grades are more than the total no of students",sg.validateInput("1",new int[]{12,20}));
	}
	
	@Test(expected = NumberFormatException.class)
	public void testValidateInputFailure() {
		assertNull(
				"testValidateInputFailure(): validating input fail, the function not returning null even if the No Of Students are not provided",
				sg.validateInput("",new int[]{12,20}));
		assertNotNull(
				"testValidateInputFailure(): validating input fail, the function returning null even if the No Of Students > 0",
				sg.validateInput("2",new int[]{12,20}));
	}
	
	@Test
	public void testCalculateAverage() {
		assertEquals(
				"testCalculateAverage(): calulateAverage function failed, the output is not same as expected output",
				81,sg.calculateAverage("4",new int[]{86,65,98,77}));
	}
	
	@Test
	public void testCalculateMax() {
		assertEquals(
				"testCalculateMax(): calulateMax function failed, the output is not same as expected output",
				98,sg.calculateMax("4",new int[]{86,65,98,77}));
		}
	
	@Test
	public void testCalculateMin() {
		assertEquals(
				"testCalculateMin(): calulateMin function failed, the output is not same as expected output",
				65,sg.calculateMin("4",new int[]{86,65,98,77}));
		}
	}


