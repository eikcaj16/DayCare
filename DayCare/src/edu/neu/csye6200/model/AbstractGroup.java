package edu.neu.csye6200.model;

import java.util.*;
abstract class AbstractGroup {

	abstract Teacher getTeacher();

	/**
	 * 
	 * @param teacher
	 */
	abstract void setTeacher(Teacher teacher);

	abstract List<Student> getAllStudents();

	abstract int getGroupId();

	/**
	 * 
	 * @param groupId
	 */
	abstract void setGroupId(int groupId);

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

	abstract int getNumOfStudents();

}