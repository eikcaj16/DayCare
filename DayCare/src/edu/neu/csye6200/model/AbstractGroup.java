package edu.neu.csye6200.model;

import java.util.*;
abstract class AbstractGroup {

	public long getTeacher() {
		return 0;
	}

	/**
	 * 
	 * @param teacherId
	 */
	public abstract void setTeacher(long teacherId);

	public abstract int getGroupId();

	/**
	 *
	 * @param studentId
	 */
	public abstract void addStudent(long studentId);


	/**
	 * 
	 * @param studentId
	 */
	public abstract void delStudent(long studentId);

	public abstract int getNumOfStudents();
}