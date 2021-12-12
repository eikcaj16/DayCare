package edu.neu.csye6200.model;

import edu.neu.csye6200.api.abstractClass.AbstractGroup;

public class Group extends AbstractGroup {

	private long teacher_id;
	private int  student_num;
	private final int groupId;

	public Group(int id){
		student_num = 0;
		teacher_id = -1;
		this.groupId = id;
	}
	

	public Group() {
		super();
		this.groupId = 0;
	}

	public long getTeacher() {
		return this.teacher_id;
	}

	public void setTeacher(long teacherId) {
		this.teacher_id = teacherId;
	}

	// TODO : required 
	public int getGroupId() {
		return 0;
	}

	public void addStudent(long studentId) {
		student_num++;
	}

	public void delStudent(long studentId) {
		student_num--;
	}

	public int getNumOfStudents() {
		return student_num;
	}
}
