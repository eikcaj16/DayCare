package edu.neu.csye6200.model;

import java.util.*;

abstract class AbstractSchool {

	abstract void trackStudentEnrollment();

	abstract void trackStudentImmunization();

	abstract void trackStudentRegistration();

	abstract void trackAnnualEmployeeReview();

	abstract int getNumOfClassrooms();

	abstract List<AbstractClassroom> getAllClassrooms();

	/**
	 * 
	 * @param classroomId
	 */
	abstract void addClassroom(Classroom classroom);

	/**
	 * 
	 * @param classroom
	 */
	abstract void delClassroom(Classroom classroom);

	/**
	 * 
	 * @param classroomId
	 */
	abstract void delClassroom(int classroomId);

}