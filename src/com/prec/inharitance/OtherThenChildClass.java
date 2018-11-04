package com.prec.inharitance;

public class OtherThenChildClass {

	public void myMethod(){
		
		ChildClass childClass = new ChildClass();
		
		ParentClass parentClass = new ParentClass();
		
		//Child Class Method
		childClass.childMethod();
		
		//Parent Class Default Method
		childClass.iAmDefaultMethod();
		
		//Parent class protected Method
		childClass.protectedMethod();
		
		//Parent class public method
		childClass.printMe();
	}
	
}
