package edu.neu.csye6200.model;

import java.time.*;
import java.util.Map;

public class Student extends Person {

	private LocalDate immunizationDate;
	private LocalDate registrationDate;
	private long studentId;

	/**
	 * 
	 * @param immunizationDate
	 */
	public void setImmunizationDate(LocalDate immunizationDate) {
		this.immunizationDate = immunizationDate;
	}

	public LocalDate getImmunizationDate() {
		return this.immunizationDate;
	}

	/**
	 * 
	 * @param registrationDate
	 */
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public LocalDate getRegistrationDate() {
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
		s.setImmunizationDate(LocalDate.parse(attributes[5]));
		s.setRegistrationDate(LocalDate.parse(attributes[6]));
		s.setStudentId(Integer.parseInt(attributes[7]));
		
		return s;
	}

}