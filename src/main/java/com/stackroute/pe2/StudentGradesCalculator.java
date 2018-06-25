package com.stackroute.pe2;

import java.util.Arrays;

public class StudentGradesCalculator {
	public String validateInput(String no, int[] grades) {
		String ret = "";
		int noOfStudents = 0;
		
		if(no.isEmpty()) {
			ret = null;
		}
		noOfStudents = Integer.parseInt(no);
		
		for(int i = 0; i < grades.length; i++) {
			if(!(grades[i] > 0 && grades[i] < 100)) {
				ret = "No in the grades are not in a valid range.";
			}
		}
		
		if(noOfStudents > grades.length) {
			ret = "Grades for all the students are not provided";
		}
		else if(noOfStudents < grades.length){
			ret = "Grades are more than the total no of students";
		}
		
		calculateAverage("2",new int[]{12,20});
		calculateMax("2",new int[]{12,20});
		calculateMin("2",new int[]{12,20});
			
		return ret;
	}
	
	public int calculateAverage(String no, int[] grades) {
		int sum = 0;
		for(int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		
		return sum/grades.length;
	}
	
	public int calculateMax(String no, int[] grades) {
		Arrays.sort(grades);
		
		return grades[grades.length - 1];
	}
	
	public int calculateMin(String no, int[] grades) {
		Arrays.sort(grades);
		
		return grades[0];
	}
	
}
