package edu.neu.csye6200.model;

import java.util.List;

public class Group extends AbstractGroup{

	private Teacher teacher;
	private List<Student> students;
	private int groupId;
	
	public Teacher getTeacher() {
		return this.teacher;
	}

	/**
	 * 
	 * @param teacher
	 */
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Student> getAllStudents() {
		// TODO - implement AbstractGroup.getAllStudents
		return students.stream().sorted().toList();
	}

	public int getGroupId() {
		return this.groupId;
	}

	/**
	 * 
	 * @param groupId
	 */
	protected void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	/**
	 * 
	 * @param student
	 */
	public void addStudent(Student student) {
		// TODO - implement AbstractGroup.addStudent
		students.add(student);
	}

	/**
	 * 
	 * @param student
	 */
	public void delStudent(Student student) {
		// TODO - implement AbstractGroup.delStudent
		students.add(student);
	}

	/**
	 * 
	 * @param studentId
	 */
	public void delStudent(long studentId) {
		// TODO - implement AbstractGroup.delStudent
		throw new UnsupportedOperationException();
	}

	public int getNumOfStudents() {
		// TODO - implement AbstractGroup.getNumOfStudents
		return students.size();
	}

}
