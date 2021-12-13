package edu.neu.csye6200.api.abstractClass;

import edu.neu.csye6200.model.Student;

import java.sql.SQLException;
import java.util.List;

public abstract class AbstractStudent {

	public abstract int getNumOfStudents();

	public abstract List<Student> getAllStudents();

	/**
	 * add a student to classroom according to rules
	 * - set the classroom_id of Student table in database
	 * @param student a student object
	 */
	public abstract void addStudent(Student student) throws SQLException;

	public abstract void updateStudent(Student student) throws SQLException;

	public abstract void deleteStudent(Student student);

	/**
	 * delete a student from classroom
	 * @param studentId a student id
	 */
	public abstract void deleteStudent(long studentId);
}