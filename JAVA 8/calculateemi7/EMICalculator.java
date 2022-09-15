package com.yash.java8.calculateemi7;

public class EMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Result r = new Result();
	        Calculate c;
	        double d = 0;
	        c = r.emiCalculation();

	       d = r.input(c, 1800, 2, 22, 14);
	       System.out.println(d);
	}

}
