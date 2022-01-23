package com.AssessmentJavaPratice;


public class AccessModifier2 {
	public int flag;// Public Scope
	private int data = 80;
	private void msg() {// Private Access Modifier
		System.out.println("Private Scope.");
	}
	public static void main(String[] args) {
		AccessModifier2 obj=new AccessModifier2();
	     System.out.println(obj.data);
		 obj.msg();
		 new Other().func();
	}
	protected void func() {// Protected Scope
		System.out.println("Protected Scope");
	}
	void met() {// Package Scope
		System.out.println("Package Scope.");
	}
}
class Other{
	void func() {
		AccessModifier2 ref=new AccessModifier2();
		ref.flag=80;
		ref.met();
		ref.func();

	}

}
