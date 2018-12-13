package com.prec.profile;

/**
 *  Method overloading
 * @author Pervez
 *
 */

public class UserProfile extends Object{

	String name;
	DateOfBirth dateOfBirth;

	public void userProfile(String name, DateOfBirth dateOfBirth){
		this.name = name;
		this.dateOfBirth= dateOfBirth;
	}
	
	public void userProfile(DateOfBirth dateOfBirth, String name){
		this.name = name;
		this.dateOfBirth= dateOfBirth;
	}
	
	
	public String userProfile(){
		String s = "name : "+name+"\nDate of Birth: "+dateOfBirth.getDateOfBirth();
		return s;
	}
	
	public static void main(String args[]){
		DateOfBirth dateOfBirth = new DateOfBirth();
		
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello";
	}
}
