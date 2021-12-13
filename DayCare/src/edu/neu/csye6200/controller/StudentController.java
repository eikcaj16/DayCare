package edu.neu.csye6200.controller;

import edu.neu.csye6200.api.StudentApi;
import edu.neu.csye6200.model.Student;

import java.sql.SQLException;
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
	public void addStudent(Student student) throws SQLException {
		api.addStudent(student);
	}

	public void delStudent(Student student) {
		api.delStudent(student);
	}

	public void delStudent(long studentId) {
		api.delStudent(studentId);
	}

	public void setRegistrationDate(String registrationDate, Student student) {
		api.setRegistrationDate(registrationDate, student);
	}

	public String getRegistrationDate(Student student){
		return api.getRegistrationDate(student.getStudentId());
	}

}
