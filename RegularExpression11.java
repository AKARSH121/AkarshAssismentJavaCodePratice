package com.AssessmentJavaPratice;

import java.util.regex.*;
public class RegularExpression11 {

	public static void main(String[] args) {
		String pattern = "[a-z]+";
		String check = "Java hello world";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );

	}

}
