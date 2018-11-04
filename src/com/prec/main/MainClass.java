package com.prec.main;

import com.prec.inharitance.ChildClass;
import com.prec.inharitance.ParentClass;

public class MainClass {

	public static void main(String[] args) {
		
		ChildClass childClass = new ChildClass();
		
		ParentClass parentClass = new ParentClass();
		
		//Parent Class method
		childClass.printMe();
		
		//Child Class Method
		childClass.childMethod();
		
		
		ChildClassTwo childClassTwo = new ChildClassTwo();
		
		childClassTwo.childMethod();
		childClassTwo.printMe();
		
		
	}
	
}
