package com.prec.main;

import com.prec.inharitance.ParentClass;

public class ChildClassTwo extends ParentClass{
	
	public void childMethod(){
		System.out.println("I am child");
		
		printMe();
		protectedMethod();
		
	}

}
