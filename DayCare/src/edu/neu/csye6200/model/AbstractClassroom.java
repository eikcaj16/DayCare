package edu.neu.csye6200.model;

import java.util.*;

public abstract class AbstractClassroom {

	public abstract int getClassroomId();

	public abstract int getNumOfStudents();

	public abstract List<Student> getAllStudents();

	/**
	 * add a student to classroom according to rules
	 * - set the classroom_id of Student table in database
	 * @param studentId a student id
	 */
	public abstract boolean addStudent(long studentId);

	/**
	 * delete a student from classroom
	 * @param studentId a student id
	 */
	public abstract boolean delStudent(long studentId);

	public abstract int getNumOfTeachers();

	public abstract List<Teacher> getAllTeachers();

	/**
	 *
	 * @param teacherId
	 * @return
	 */
	public abstract boolean addTeacher(long teacherId);

	/**
	 *
   * @param teacherId
   * @return
   */
	public abstract boolean delTeacher(long teacherId);

	abstract List<Group> getAllGroups();
}