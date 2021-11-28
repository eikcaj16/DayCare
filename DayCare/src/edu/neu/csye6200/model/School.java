package edu.neu.csye6200.model;

import java.util.List;

public class School extends AbstractSchool {
	
	private List<AbstractClassroom> classrooms;

	public void trackStudentEnrollment() {
		// TODO - implement AbstractSchool.trackStudentEnrollment
		throw new UnsupportedOperationException();
	}

	public void trackStudentImmunization() {
		// TODO - implement AbstractSchool.trackStudentImmunization
		throw new UnsupportedOperationException();
	}

	public void trackStudentRegistration() {
		// TODO - implement AbstractSchool.trackStudentRegistration
		throw new UnsupportedOperationException();
	}

	public void trackAnnualEmployeeReview() {
		// TODO - implement AbstractSchool.trackAnnualEmployeeReview
		throw new UnsupportedOperationException();
	}

	public int getNumOfClassrooms() {
		// TODO - implement AbstractSchool.getNumOfClassrooms
		return classrooms.size();
	}

	public List<AbstractClassroom> getAllClassrooms() {
		// TODO - implement AbstractSchool.getAllClassrooms
		return classrooms.stream().sorted().toList();
	}

	/**
	 * 
	 * @param classroomId
	 */
	public void addClassroom(Classroom classroom) {
		// TODO - implement AbstractSchool.addClassroom
		classrooms.add(classroom);
	}

	/**
	 * 
	 * @param classroom
	 */
	public void delClassroom(Classroom classroom) {
		// TODO - implement AbstractSchool.delClassroom
		classrooms.remove(classroom);
	}

	/**
	 * 
	 * @param classroomId
	 */
	public void delClassroom(int classroomId) {
		// TODO - implement AbstractSchool.delClassroom
		
		throw new UnsupportedOperationException();
	}

}