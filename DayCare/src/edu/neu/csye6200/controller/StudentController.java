package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.Student;

import java.time.*;
import java.util.Date;

public class StudentController {
	private Student model;
	
	StudentController(Student model){
		this.model = model;
	}
	
	public void setImmunizationDate(Date immunizationDate) {
		model.setImmunizationDate(immunizationDate);
	}

	public Date getImmunizationDate() {
		return model.getImmunizationDate();
	}

	public void setRegistrationDate(Date registrationDate) {
		model.setRegistrationDate(registrationDate);
	}

	public Date getRegistrationDate() {
		return model.getRegistrationDate();
	}
	
	public void setStudentId(long studentId) {
		model.setStudentId(studentId);
	}

	public long getStudentId() {
		return model.getStudentId();
	}
}
