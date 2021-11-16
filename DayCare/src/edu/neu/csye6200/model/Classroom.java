package edu.neu.csye6200.model;

import java.util.List;

public class Classroom extends AbstractClassroom {
	
	private int classroomId;
	private List<Student> students;
	private List<Teacher> teachers;
	private List<Group> groups;

	public int getClassroomId() {
		return this.classroomId;
	}

	/**
	 * 
	 * @param id
	 */
	protected void setClassroomId(int id) {
		this.classroomId = id;
	}

	public int getNumOfStudents() {
		// TODO - implement AbstractClassroom.getNumOfStudents
		return students.size();
	}

	public List<Student> getAllStudents() {
		// TODO - implement AbstractClassroom.getAllStudents
		return students.stream().sorted().toList();
	}

	/**
	 * 
	 * @param student
	 */
	public void addStudent(Student student) {
		// TODO - implement AbstractClassroom.addStudent
		students.add(student);
	}

	/**
	 * 
	 * @param student
	 */
	public void delStudent(Student student) {
		// TODO - implement AbstractClassroom.delStudent
		students.remove(student);
	}

	/**
	 * 
	 * @param studentId
	 */
	public void delStudent(long studentId) {
		// TODO - implement AbstractClassroom.delStudent
	}

	public int getNumOfTeachers() {
		// TODO - implement AbstractClassroom.getNumOfTeachers
		return teachers.size();
	}

	public List<Teacher> getAllTeachers() {
		// TODO - implement AbstractClassroom.getAllTeachers
		return teachers.stream().sorted().toList();
	}

	/**
	 * 
	 * @param teacher
	 */
	public void addTeacher(Teacher teacher) {
		// TODO - implement AbstractClassroom.addTeacher
		teachers.add(teacher);
	}

	/**
	 * 
	 * @param teacher
	 */
	public void delTeacher(Teacher teacher) {
		// TODO - implement AbstractClassroom.delTeacher
		teachers.remove(teacher);
	}

	/**
	 * 
	 * @param teacherId
	 */
	public void delTeacher(long teacherId) {
		// TODO - implement AbstractClassroom.delTeacher
		throw new UnsupportedOperationException();
	}

	public int getNumOfGroups() {
		// TODO - implement AbstractClassroom.getNumOfGroups
		return groups.size();
	}

	public List<Group> getAllGroups() {
		// TODO - implement AbstractClassroom.getAllGroups
		return groups.stream().sorted().toList();
	}

	/**
	 * 
	 * @param teacher
	 */
	public void addGroup(Group grp) {
		// TODO - implement AbstractClassroom.addGroup
		groups.add(grp);
	}

	/**
	 * 
	 * @param group
	 */
	public void delGroup(Group group) {
		// TODO - implement AbstractClassroom.delGroup
		groups.remove(group);
	}

	/**
	 * 
	 * @param groupId
	 */
	public void delGroup(int groupId) {
		// TODO - implement AbstractClassroom.delGroup
		throw new UnsupportedOperationException();
	}
}