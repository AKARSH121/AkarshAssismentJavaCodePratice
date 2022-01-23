package com.AssessmentJavaPratice;

public class Final17 {

	public static void main(String[] args) {
		
            int a=81,b=0,r=0;
            try
            {
                r = a / b;
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("\nError : " + Ex.getMessage());
            }
            finally
            {
                System.out.print("\nThe result is  " + r);
            }

	}

}
