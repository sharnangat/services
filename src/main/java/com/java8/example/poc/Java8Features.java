package com.java8.example.poc;

import java.util.Arrays;
import java.util.List;

public class Java8Features {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	List numberList = Arrays.asList(1,2,3,4,5,6,7,9);
	
	
	numberList.stream().forEach(System.out::print);
	
	
	
	}

}
