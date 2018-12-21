package com.prec.profile;

/**
 * Method overloading
 * 
 * @author Pervez
 *
 */

public class UserProfile extends Object {

	String name;
	DateOfBirth dateOfBirth;

	Address workAddress;

	Address homeAddress;

	Address tempAddress;

	public void userProfile(String name, DateOfBirth dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public void userProfile(DateOfBirth dateOfBirth, String name) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public String userProfile() {
		String s = "name : " + name + "\nDate of Birth: " + dateOfBirth.getDateOfBirth();
		return s;
	}

	public static void main(String args[]) {

		UserProfile userProfile = new UserProfile();
		userProfile.name = "Ram";
		userProfile.dateOfBirth.addDateOfBirth(2018, 01, 12);
		userProfile.homeAddress.city = "Jaipur";

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello";
	}
}
