package com.prec.inharitance;

public class ChildClass extends ParentClass{

	
	public void printMe(String s) {
		
	}
	
	public void childMethod(){
		System.out.println("I am child");
		
		iAmDefaultMethod();
		protectedMethod();
		printMe();
		
		
	}
	
	public static void main(String[] args) {
		
	}
	
}
