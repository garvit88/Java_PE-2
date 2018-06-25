package com.stackroute.pe2;

import java.math.BigInteger;

public class ListFactorials {

	public String integerFactorial(String input) {
		String ret = "";
		int num = Integer.parseInt(input);
		long fact = 1;
		for(int i = 1; i <= num; i++) {
	        fact = fact * i;
	        if(fact > Integer.MAX_VALUE) {
	        	ret = "Out of range";
	        	break;
	        }
	        else {
	        	ret = String.valueOf(fact);
	        }
        }
		
		 return ret;
	}
	
	public String longFactorial(String input) {
		String ret = "";
		int num = Integer.parseInt(input);
		BigInteger fact = new BigInteger("1");
		BigInteger longMaxValue = new BigInteger(String.valueOf(Long.MAX_VALUE));
		for(int i = 1; i <= num; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
	        if(fact.compareTo(longMaxValue) > 0) {
	        	ret = "Out of range";
	        	break;
	        }
	        else {
	        	ret = String.valueOf(fact);
	        }
        }
		
		 return ret;
	}

}
