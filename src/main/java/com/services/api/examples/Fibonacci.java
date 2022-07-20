package com.services.api.examples;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a = 0, c;
		 int b = 1;
		 
		 for(int i=1;i<=10;i++)
		 {
			 c=a+b;
			 System.out.println( c);
			 a=b;
			 b=c;
			 
		 }
		

	}

}
