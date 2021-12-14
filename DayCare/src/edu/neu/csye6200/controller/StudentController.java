package edu.neu.csye6200.controller;

import edu.neu.csye6200.api.StudentApi;
import edu.neu.csye6200.model.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentController {

	private StudentApi api = new StudentApi();

	public int getNumOfStudents() {
		return api.getNumOfStudents();
	}

	public List<Student> getAllStudents() {
		return api.getAllStudents();
	}
	public void addStudent(Student student) { api.addStudent(student); }

	public void delStudent(Student student) {
		api.deleteStudent(student);
	}

	public void delStudent(long studentId) {
		api.deleteStudent(studentId);
	}

	public void setRegistrationDate(String registrationDate, Student student) {
		api.setRegistrationDate(registrationDate, student);
	}

	public String getRegistrationDate(Student student){
		return api.getRegistrationDate(student.getStudentId());
	}

}
