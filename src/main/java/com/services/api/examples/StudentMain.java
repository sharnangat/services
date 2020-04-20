package com.services.api.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 List<Student> list= createStudentList();
		
	 	 
	 
	 System.out.println(list.size());
	
	 System.out.println("Before the sorting the data");
	 System.out.println("Student Code,  Student Name");
	 
	 for(Student s  :list){
		 
		System.out.println(s.getStdCode()+"   "+ s.getStdName()); 
	 }
	 
	 System.out.println("After sorting Data");
	Collections.sort(list,new StudentSort());
	
	 for(Student s  :list){
		 
			System.out.println(s.getStdCode()+"   "+ s.getStdName()); 
		 }
	 
	 
	 // checking contains in the list
	 
	 
	 System.out.println("After ovverriding equals and hashcode method");
	     Student one=new Student();
	 
	 	one.setStdCode("Z");
		one.setStdName("Sanjay");
	 
		
		Boolean found=list.contains(one);
		if(found){
			System.out.println("Found code "+one.getStdCode()+ " and Checking  name+"+one.getStdName());
		}
		
		
		
	 System.out.println("Java 8 Operations");
		

	 
	 
	 
	}

	private static List<Student> createStudentList() {
		// TODO Auto-generated method stub

		List<Student> stdList =new ArrayList<>();
		
		Student one=new Student();
		Student two=new Student();
		Student three=new Student();
		
		one.setStdCode("Z");
		one.setStdName("Sanjay");
		
		two.setStdCode("B");
		two.setStdName("Amruta");
		
		three.setStdCode("A");
		three.setStdName("Anushka");
		
		
		
		
		stdList.add(one);
		stdList.add(two);
		stdList.add(three);
		
		
		
		
		Boolean  valueFound=stdList.contains(one);
		if(valueFound){
			
		System.out.println("Record has been found in the list");	
		}
		
		
		return stdList;
	}

}
