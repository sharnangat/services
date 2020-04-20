package com.services.api.examples;

import java.util.Comparator;

public class StudentSort implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		System.out.println("Started Sorted");
		
		return o1.getStdCode().compareTo(o2.getStdCode());
	}

}
