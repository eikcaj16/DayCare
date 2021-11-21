package edu.neu.csye6200.model;

import java.time.*;
import java.util.Map;

import edu.neu.csye6200.utils.ConversionHelper;

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
		ConversionHelper convHelp = new ConversionHelper();
		Student s = new Student();
		s.setFirstName(attributes[0]);
		s.setLastName(attributes[1]);
		s.setAge(convHelp.stringToInt(attributes[2]));
		s.setAddress(attributes[3]);	
		s.setPhoneNum(convHelp.stringToLong(attributes[4]));
		s.setImmunizationDate(convHelp.stringtoDate(attributes[5]));
		s.setRegistrationDate(convHelp.stringtoDate(attributes[6]));
		s.setStudentId(convHelp.stringToLong(attributes[7]));
		
		return s;
	}

}