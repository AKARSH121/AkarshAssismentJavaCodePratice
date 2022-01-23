package com.AssessmentJavaPratice;

public class Throws17 {
	void Division() throws ArithmeticException
    {
        int a=81,b=0,r;
r = a / b;
        System.out.print("The result is  " + r);
    }
     public static void main(String[] args)
    {
Throws17 T = new Throws17();
         try
        {
            T.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("Error  " + Ex.getMessage());
        }
        System.out.print("\nEnd of program.");
}
}
