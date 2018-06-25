package com.stackroute.pe2;

public class PalindromeChecker {
	
	public String reverse(String input) {
		if(input.isEmpty()) {
			return null;
		}
		String rev = "";
		int len = input.length();
		for(int i = len - 1; i != -1; i--) {
			rev += input.charAt(i);
		}
		
		return rev;
	}
	
	public boolean palindrome(String input) {
		if(input.equals("")) {
			return false;
		}
		String rev = ""; 
		boolean pal = false;
		int len = input.length();
		for(int i = len - 1; i != -1; i--) {
			rev += input.charAt(i);
		}
		if(input.equals(rev)) {
			pal = true;
		}
		
		return pal;
	}
	
}

