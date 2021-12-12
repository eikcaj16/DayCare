package edu.neu.csye6200.controller;

import edu.neu.csye6200.api.TeacherApi;
import edu.neu.csye6200.model.Teacher;

import java.util.List;

public class TeacherController {

	private TeacherApi api = new TeacherApi();

	public int getNumOfTeachers() {
		return api.getNumOfTeachers();
	}

	public List<Teacher> getAllTeachers() {
		return api.getAllTeachers();
	}

	public void addTeacher(Teacher teacher) {
		api.addTeacher(teacher);
	}

	public void delTeacher(Teacher teacher) {
		api.delTeacher(teacher);
	}

	public void delTeacher(long teacherId) {
		api.delTeacher(teacherId);
	}
	/**
	 * 
	 * @param review
	 */
	public void setReview(double review) {
		api.setReview(review);
	}

	public double getReview() {
		return api.getReview();
	}

	public long getTeacherId() {
		return api.getTeacherId();
	}
}
