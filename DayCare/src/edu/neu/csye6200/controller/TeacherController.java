package edu.neu.csye6200.controller;

import edu.neu.csye6200.api.TeacherApi;
import edu.neu.csye6200.model.Teacher;

import java.util.List;

public class TeacherController {

	private final TeacherApi api = new TeacherApi();

	public int getNumOfTeachers() {
		return api.getNumOfTeachers();
	}

	public List<Teacher> getAllTeachers() {
		return api.getAllTeachers();
	}

	public void addTeacher(Teacher teacher) {
		api.addTeacher(teacher);
	}

	public void updateTeacher(Teacher teacher) {
		api.updateTeacher(teacher);
	}

	public void delTeacher(Teacher teacher) {
		api.delTeacher(teacher);
	}

	public void delTeacher(long teacherId) {
		api.delTeacher(teacherId);
	}

	public double getRating(long teacherId) { return api.getRating(teacherId); }
}
