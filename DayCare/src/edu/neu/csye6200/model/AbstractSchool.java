package edu.neu.csye6200.model;

import java.util.*;

public abstract class AbstractSchool {

	public abstract void trackStudentEnrollment();

	public abstract void trackStudentImmunization();

	public abstract void trackStudentRegistration();

	public abstract void trackAnnualEmployeeReview();

	public abstract int getNumOfClassrooms();

	public abstract List<AbstractClassroom> getAllClassrooms();

	/**
	 * 
	 */
	public abstract AbstractClassroom addClassroom();

	/**
	 * 
	 * @param classroom
	 */
	public abstract void delClassroom(Classroom classroom);

	/**
	 * 
	 * @param classroomId
	 */
	public abstract void delClassroom(int classroomId);

}