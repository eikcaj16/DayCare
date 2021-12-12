package edu.neu.csye6200.api.abstractClass;

import edu.neu.csye6200.model.Student;

import java.util.List;

public abstract class AbstractStudent {

	public abstract int getNumOfStudents();

	public abstract List<Student> getAllStudents();

	/**
	 * add a student to classroom according to rules
	 * - set the classroom_id of Student table in database
	 * @param student a student object
	 */
	public abstract void addStudent(Student student);

	public abstract void updateStudent(Student student);

	public abstract void delStudent(Student student);

	/**
	 * delete a student from classroom
	 * @param studentId a student id
	 */
	public abstract void delStudent(long studentId);
}