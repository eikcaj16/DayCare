package edu.neu.csye6200.model;

import java.util.*;

public abstract class AbstractClassroom {

	abstract int getClassroomId();

	/**
	 * 
	 * @param id
	 */
	abstract void setClassroomId(int id);

	abstract int getNumOfStudents();

	abstract List<Student> getAllStudents();

	/**
	 * 
	 * @param student
	 */
	abstract void addStudent(Student student);

	/**
	 * 
	 * @param student
	 */
	abstract void delStudent(Student student);

	/**
	 * 
	 * @param studentId
	 */
	abstract void delStudent(long studentId);

	abstract int getNumOfTeachers();

	abstract List<Teacher> getAllTeachers();

	/**
	 * 
	 * @param teacher
	 */
	abstract void addTeacher(Teacher teacher);

	/**
	 * 
	 * @param teacher
	 */
	abstract void delTeacher(Teacher teacher);

	/**
	 * 
	 * @param teacherId
	 */
	abstract void delTeacher(long teacherId);

	abstract int getNumOfGroups();

	abstract List<Group> getAllGroups();

	/**
	 * 
	 * @param teacher
	 */
	abstract void addGroup(Group grp);

	/**
	 * 
	 * @param group
	 */
	abstract void delGroup(Group group);

	/**
	 * 
	 * @param groupId
	 */
	abstract void delGroup(int groupId);

}