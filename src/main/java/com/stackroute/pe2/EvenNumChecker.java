package com.stackroute.pe2;

public class EvenNumChecker {
	public static boolean isEven(String input) {
		int number = Integer.parseInt(input);
		if(number % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
