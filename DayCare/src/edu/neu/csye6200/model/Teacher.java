package edu.neu.csye6200.model;

public class Teacher extends Person {

	private double review;
	private int credits;
	private long employeeId;

	/**
	 * 
	 * @param review
	 */
	public void setReview(double review) {
		this.review = review;
	}

	public double getReview() {
		return this.review;
	}

	/**
	 * 
	 * @param credits
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getCredits() {
		return this.credits;
	}

	/**
	 * 
	 * @param emplpyeeId
	 */
	public void setEmployeeId(long emplpyeeId) {
		this.employeeId = emplpyeeId;
	}

	public long getEmployeeId() {
		return this.employeeId;
	}

}