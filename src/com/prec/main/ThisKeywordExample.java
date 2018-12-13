package com.prec.main;

public class ThisKeywordExample {

	int age;
	
	public void printAge(){
		VeriableDemoClass.printAge(this);
	}
	
	
	public static void main(String[] args) {
		
		ThisKeywordExample k1 = new ThisKeywordExample();
		
		k1.age = 10;
		
		ThisKeywordExample k2 = new ThisKeywordExample();
		
		k2.age = 20;
		
		k1.printAge();
		k2.printAge();
		
		
		
	}
}
