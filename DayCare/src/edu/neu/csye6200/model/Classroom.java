package edu.neu.csye6200.model;

import java.util.ArrayList;
import java.util.List;

public class Classroom extends AbstractClassroom {
	
	private int classroomId;
	private final List<Student> students;
	private final List<Teacher> teachers;
	private final List<Group> groups;

	public Classroom(int id){
		setClassroomId(id);
		students = new ArrayList<>();
		teachers = new ArrayList<>();
		groups = new ArrayList<>();
	}

	public int getClassroomId() {
		return this.classroomId;
	}

	/**
	 * 
	 * @param id An Integer for identifying Classroom
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
	 * @param student A student Object
	 */
	public void addStudent(Student student) {
		// TODO - implement AbstractClassroom.addStudent
		students.add(student);
	}

	/**
	 * 
	 * @param student A student Object
	 */
	public void delStudent(Student student) {
		// TODO - implement AbstractClassroom.delStudent
		students.remove(student);
	}

	/**
	 * 
	 * @param studentId A long data type student Id
	 */
	public void delStudent(long studentId) {
		// TODO - implement AbstractClassroom.delStudent
		for(Student s: students){
			if(s.getStudentId() == studentId){
				students.remove(s);
				return;
			}
		}
		System.out.println("ERROR! Fail to find student with Id:" + studentId);
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
	 * @param teacher A teacher Object
	 */
	public void addTeacher(Teacher teacher) {
		// TODO - implement AbstractClassroom.addTeacher
		teachers.add(teacher);
	}

	/**
	 * 
	 * @param teacher A teacher Object
	 */
	public void delTeacher(Teacher teacher) {
		// TODO - implement AbstractClassroom.delTeacher
		teachers.remove(teacher);
	}

	/**
	 * 
	 * @param teacherId A long data type teacher Id
	 */
	public void delTeacher(long teacherId) {
		// TODO - implement AbstractClassroom.delTeacher
		for(Teacher t: teachers){
			if(t.getEmployeeId() == teacherId){
				teachers.remove(t);
				return;
			}
		}
		System.out.println("ERROR! Fail to find a teacher with Id:" + teacherId);

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
	 * @param group A group Object
	 */
	public void addGroup(Group group) {
		// TODO - implement AbstractClassroom.addGroup
		groups.add(group);
	}

	/**
	 * 
	 * @param group A group Object
	 */
	public void delGroup(Group group) {
		// TODO - implement AbstractClassroom.delGroup
		groups.remove(group);
	}

	/**
	 * 
	 * @param groupId A int data type group Id
	 */
	public void delGroup(int groupId) {
		// TODO - implement AbstractClassroom.delGroup
		for(Group g: groups){
			if(g.getGroupId() == groupId){
				groups.remove(g);
				return;
			}
		}

		System.out.println("ERROR! Fail to find a group with Id:" + groupId);

		throw new UnsupportedOperationException();
	}
}