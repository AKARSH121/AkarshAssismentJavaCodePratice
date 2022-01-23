package com.AssessmentJavaPratice;

public class ExceptionHandling18 {
	public static void main(String[] args) {
	int a= 7;
	int b = 5;
	String s =null;
	
	try {
		
		int c = a/b;
		//s.length();
			
	} catch(ArithmeticException e) {
		System.out.println("Internal error occurred");
		e.printStackTrace();
		
	} catch(Exception e) {
		System.out.println("111111111 --- Internal error");
	} finally {
		System.out.println("This is my finally block");
	}
		
	System.out.println("This is end of statement");
}
}
