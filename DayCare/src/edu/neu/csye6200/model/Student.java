package edu.neu.csye6200.model;

import edu.neu.csye6200.utils.LocalDate;

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

}