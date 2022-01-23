package com.AssessmentJavaPratice;
import java.util.*;
public class Collections6 {

	public static void main(String[] args) {
		System.out.println(" list the array");
		ArrayList<String> cars=new ArrayList<String>();   
	      cars.add("Bmw,Citroen");    	   
	      System.out.println(cars);  
		
	
	      System.out.println("\n");
	      System.out.println(" print the Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(15); 
	      vec.addElement(30); 
	      System.out.println(vec);
		
		
	      System.out.println("\n");
	      System.out.println(" print the LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Ram");  
	      names.add("Kumar");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       
	       System.out.println("\n");
	       System.out.println(" print the HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       System.out.println(set);
	       
	       
	       System.out.println("\n");
	       System.out.println(" print the LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	      }

	}

}