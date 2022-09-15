package com.yash.java8.sequencechartask2;

import java.util.Arrays;

public class SequenceNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String given[] = {"Taj is situated in Agra"};
	        String find="ast";
	        boolean Match = Arrays.stream(given).anyMatch(s->s.contains(find));
	       
	        if(Match==true) {
	            System.out.println(find+" String found");
	        }
	        else {
	        System.out.println(find+" String not found");
	        }
	}

}
