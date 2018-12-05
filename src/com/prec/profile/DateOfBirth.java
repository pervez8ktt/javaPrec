package com.prec.profile;

public class DateOfBirth {

	private int year;
	private int month;
	private int day;
	
	public void addDateOfBirth(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String getDateOfBirth(){
		String s = day+"/"+month+"/"+year;
		return s;
	}
	
}
