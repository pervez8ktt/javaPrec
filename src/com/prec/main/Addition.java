package com.prec.main;

public class Addition {

	int a;
	int b;
	
	public int addNumbers(){
		int c = a+b;
		
		return c;
	}
	
	
	public void initializeVeriables(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	
	public static void main(String args[]){
		Addition addition = new Addition();
		
		addition.initializeVeriables(10, 20);
		
		int result = addition.addNumbers();
		
		System.out.println("Result is : "+result);
		
		
	}
	
}
