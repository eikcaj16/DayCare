package edu.neu.csye6200.model;

import edu.neu.csye6200.utils.ConversionHelper;

import java.util.Date;

public class Student extends Person {

	private String immunizationDate;
	private String registrationDate;
	private int classroomId;
	private int groupId;
	private double rating;
	private long studentId;

	public String getImmunizationDate() {
		return immunizationDate;
	}

	public void setImmunizationDate(String immunizationDate) {
		this.immunizationDate = immunizationDate;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public int getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(int classroomId) {
		this.classroomId = classroomId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}



}