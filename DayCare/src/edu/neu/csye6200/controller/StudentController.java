package edu.neu.csye6200.controller;

import edu.neu.csye6200.api.StudentApi;
import edu.neu.csye6200.model.Student;

import java.util.Date;
import java.util.List;

public class StudentController {

	private StudentApi api = new StudentApi();

	public int getNumOfStudents() {
		return api.getNumOfStudents();
	}

	public List<Student> getAllStudents() {
		return api.getAllStudents();
	}
	public void addStudent(Student student) {
		api.addStudent(student);
	}

	public void delStudent(Student student) {
		api.delStudent(student);
	}

	public void delStudent(long studentId) {
		api.delStudent(studentId);
	}

	public void setImmunizationDate(Date immunizationDate) {
		api.setImmunizationDate(immunizationDate);
	}

	public Date getImmunizationDate() {
		return api.getImmunizationDate();
	}

	public void setRegistrationDate(Date registrationDate) {
		api.setRegistrationDate(registrationDate);
	}

	public Date getRegistrationDate() {
		return api.getRegistrationDate();
	}

}
