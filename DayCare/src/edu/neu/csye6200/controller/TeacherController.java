package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.Teacher;

public class TeacherController {

	private Teacher model;
	
	TeacherController(Teacher model){
		this.model = model;
	}
	
	/**
	 * 
	 * @param review
	 */
	public void setReview(double review) {
		model.setReview(review);
	}

	public double getReview() {
		return model.getReview();
	}

	/**
	 * 
	 * @param credits
	 */
	public void setCredits(int credits) {
		model.setCredits(credits);
	}

	public int getCredits() {
		return model.getCredits();
	}

	/**
	 * 
	 * @param emplpyeeId
	 */
	public void setEmployeeId(long emplpyeeId) {
		model.setEmployeeId(emplpyeeId);
	}

	public long getEmployeeId() {
		return model.getEmployeeId();
	}
}
