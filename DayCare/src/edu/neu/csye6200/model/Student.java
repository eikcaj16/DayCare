package edu.neu.csye6200.model;

import java.time.*;
import java.util.Date;
import java.util.Map;

public class Student extends Person {

	private Date immunizationDate;
	private Date registrationDate;
	private long studentId;

	/**
	 * 
	 * @param immunizationDate
	 */
	public void setImmunizationDate(Date immunizationDate) {
		this.immunizationDate = immunizationDate;
	}

	public Date getImmunizationDate() {
		return this.immunizationDate;
	}

	/**
	 * 
	 * @param registrationDate
	 */
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Date getRegistrationDate() {
		return this.registrationDate;
	}


	/**
	 * 
	 * @param studentId
	 */
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public long getStudentId() {
		return this.studentId;
	}
	
	public static Student createStudent(String[] attributes) {
		Student s = new Student();
		s.setFirstName(attributes[0]);
		s.setLastName(attributes[1]);
		s.setAge(Integer.parseInt(attributes[2]));
		s.setAddress(attributes[3]);
		s.setPhoneNum(Integer.parseInt(attributes[4]));
		s.setStudentId(Integer.parseInt(attributes[7]));
		
		return s;
	}

}