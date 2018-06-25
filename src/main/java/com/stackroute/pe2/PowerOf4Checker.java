package com.stackroute.pe2;

public class PowerOf4Checker {

	public boolean power(String input) {
		int num = Integer.parseInt(input);
		while(num > 0) {
	        if(num == 1) {
	            return true;
	        }
	        if(num % 4 != 0) {
	            return false;
	        } else {
	            num = num / 4;
	        }
		}
	
		return false;
	}
}
