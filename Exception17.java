package com.AssessmentJavaPratice;
@SuppressWarnings("serial")
public class Exception17  extends Exception {
	
		public Exception17(String s) 
	    { 
	        super(s); 
	    } 
	} 
	public class Main 
	{ 
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            throw new Exception17("temp"); 
	        } 
	        catch (Exception17 ex) 
	        { 
	            System.out.println("Caught"); 
	            System.out.println(ex.getMessage()); 
	        } 

	}

}
