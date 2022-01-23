package com.AssessmentJavaPratice;

public class Throw17 {
	public static void main(String[] args)
    {

        int a=81,b=0,result;
        int c=25,d=2,e;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                result = a / b;
                System.out.print("\nThe result is " + result);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\nError " + Ex.getMessage());
        }
        try
        {
            if(d==0)        
                throw(new ArithmeticException("Can't divide by 0."));
            else
            {
                e = c / d;
                System.out.print("\nThe result is " + e);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\nError " + Ex.getMessage());
        }
        System.out.print("\nEnd of program.");
    }
}
