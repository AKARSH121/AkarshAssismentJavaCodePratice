package com.AssessmentJavaPratice;


public class InnerClass8 {

	public static void main(String[] args) {
		akarsh dev = new akarsh() {

			@Override
			public void atom() {
				System.out.println("annonymous inner class");
			}
		};
		dev.atom();

		model gov = new model();
		gov.home(new akarsh() {
			@Override
			public void atom() {
				System.out.println();
				System.out.println("Argument based annonymous inner class");
			}

		});

		System.out.println();

		new outer().new inner().print();

		System.out.println();



	}

}


interface akarsh{
	void atom();
}


class model {
	void home(akarsh ref) {
	ref.atom();}
}

class outer{
	class inner{
		void print() {
			System.out.println("Regular inner class");
		}
	}
}



class Outer{
	void func() {
		class Inner{
			void print() {
				System.out.println("Method local inner class");
			}
		}
		new Inner().print();


	}

}