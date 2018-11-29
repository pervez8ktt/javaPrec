package com.prec.main;

public class VeriableDemoClass {
	
	//Instance variable
	
	int a;
	
	//Static Variable
	
	static int b;
	
	public static void main(String args[]){
		VeriableDemoClass v1 = new VeriableDemoClass();
		
		v1.a = 10;
		
		v1.b = 30;
		
		VeriableDemoClass v2 = new VeriableDemoClass();
		
		v2.a = 20;
		
		v2.b = 40;
		
		
		System.out.println("V1 a: "+v1.a);
		System.out.println("V2 a: "+v2.a);
		System.out.println("V1 b: "+v1.b);
		System.out.println("V2 b: "+v2.b);
		
		System.out.println("VeribaleDemo b: "+VeriableDemoClass.b);
		
	}
}
