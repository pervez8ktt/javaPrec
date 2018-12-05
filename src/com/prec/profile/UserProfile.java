package com.prec.profile;

public class UserProfile {

	String name;
	DateOfBirth dateOfBirth;
	
	public void addUserProfile(String name, DateOfBirth dateOfBirth){
		this.name = name;
		this.dateOfBirth= dateOfBirth;
	}
	
	public String printDateOfBirth(){
		String s = "name : "+name+"\nDate of Birth: "+dateOfBirth.getDateOfBirth();
		return s;
	}
	
	
	public static void main(String args[]){
		DateOfBirth dateOfBirth = new DateOfBirth();
		
		
	}
}
