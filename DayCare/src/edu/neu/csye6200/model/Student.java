package edu.neu.csye6200.model;

public class Student extends Person {

	private String registrationDate;
	private String annualRegistrationDate;
	private int age;
	private int classroomId;
	private int groupId;
	private double review;
	private long studentId;

	public Student(String registrationDate, String annualRegistrationDate, int age, int classroomId, int groupId, double review, long studentId) {
		this.registrationDate = registrationDate;
		this.annualRegistrationDate = annualRegistrationDate;
		this.age = age;
		this.classroomId = classroomId;
		this.groupId = groupId;
		this.review = review;
		this.studentId = studentId;
	}

	public Student() {
	}

	public String getAnnualRegistrationDate() {
		return annualRegistrationDate;
	}

	public void setAnnualRegistrationDate(String annualRegistrationDate) {
		this.annualRegistrationDate = annualRegistrationDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public int getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(int classroomId) {
		this.classroomId = classroomId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public double getReview() {
		return review;
	}

	public void setReview(double review) {
		this.review = review;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

}