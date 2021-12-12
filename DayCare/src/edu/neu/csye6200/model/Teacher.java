package edu.neu.csye6200.model;


import java.time.LocalDate;

import edu.neu.csye6200.utils.ConversionHelper;


public class Teacher extends Person {

	private double review;
	private long employeeId;

	/**
	 * 
	 * @param review
	 */
	public void setReview(double review) {
		this.review = review;
	}

	public double getReview() {
		return this.review;
	}

	/**
	 * 
	 * @param emplpyeeId
	 */
	public void setEmployeeId(long emplpyeeId) {
		this.employeeId = emplpyeeId;
	}

	public long getEmployeeId() {
		return this.employeeId;
	}
	
	public static Teacher createTeacher(String[] attributes) {

// 		Teacher t = new Teacher();
// 		t.setFirstName(attributes[0]);
// 		t.setLastName(attributes[1]);
// 		t.setAge(Integer.parseInt(attributes[2]));
// 		t.setAddress(attributes[3]);
// 		t.setPhoneNum(Integer.parseInt(attributes[4]));
// 		t.setReview(Double.parseDouble(attributes[5]));
// 		t.setEmployeeId(Integer.parseInt(attributes[6]));

		ConversionHelper convHelp = new ConversionHelper();
		Teacher t = new Teacher();
		t.setFirstName(attributes[0]);
		t.setLastName(attributes[1]);
		t.setAge((int)(convHelp.stringToInt(attributes[2])/12));
		t.setAddress(attributes[3]);
		t.setPhoneNum(convHelp.stringToLong(attributes[4]));
		t.setReview(convHelp.stringToDouble(attributes[5]));
		t.setEmployeeId(convHelp.stringToLong(attributes[6]));
		
		return t;
	}

}