package com.services.api.examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	 Set<Student> set1 =new HashSet<>();
	 
	 Student s1 =new Student();
	 s1.setStdCode("A1");
     s1.setStdName("Sanjay");
	 
     Student s2 =new Student();
	 s2.setStdCode("A1");
     s2.setStdName("Sanjay");
	 
     
	 set1.add(s1);
	 set1.add(s2);
		
	 System.out.println("Student Added into Set"+set1.size());	
	
	Iterator<Student>    itr= set1.iterator();
	
	 while(itr.hasNext()){
		 
		 Student getStd = itr.next();
		 
		 System.out.println(getStd.getStdCode()+ " "+getStd.getStdName() );
		 
		 
	 }
	
	
	 
	}

}
