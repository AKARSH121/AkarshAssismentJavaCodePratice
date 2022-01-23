package com.AssessmentJavaPratice;


public class Constructors5 {
	int empID;
	String name;
	void display() {
		System.out.println(empID +" : "+ name);
	}
	public static void main(String[] args) {
				
			Constructors5 emp1 = new Constructors5();
			emp1.display();



			paraConstructor emp2 = new paraConstructor(201452, "Akarsh");

		}

	}
	class paraConstructor{
		int empID;
		String name;
		paraConstructor(int empID,String name) {
			this.empID=empID;
			this.name=name;
			System.out.println(empID +" : "+ name);


	}

}
