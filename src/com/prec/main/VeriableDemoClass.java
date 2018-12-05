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
		
		
		String[]name = {"Ram","Shyaam", "Shiv" , "Lakhman"};
		
		for(int i =0; i< name.length; i++){
			String s = name[i];
			System.out.println(s);
		}
		
		for(int i =3; i>= 0; i--){
			System.out.println(name[i]);
		}
		
		for(String s : name){
			System.out.println(s);
		}
	}
}
