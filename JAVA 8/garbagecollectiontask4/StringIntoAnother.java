package com.yash.java8.garbagecollectiontask4;

import java.util.Arrays;
import java.util.List;

public class StringIntoAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("hello ", " Java");

	       StringBuilder sb = new StringBuilder();
	       
	        list.forEach(sb::append);
	        
	        System.out.println(sb.insert(6, " my"));
	   
	       System.out.println(sb);
	}

}
