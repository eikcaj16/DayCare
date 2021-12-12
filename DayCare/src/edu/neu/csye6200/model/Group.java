package edu.neu.csye6200.model;

public class Group extends AbstractGroup{

	private long teacher_id;
	private int  student_num;
	private final int groupId;

	public Group(int id){
		student_num = 0;
		teacher_id = -1;
		this.groupId = id;
	}

	public long getTeacher() {
		return this.teacher_id;
	}

	public void setTeacher(long teacherId) {
		this.teacher_id = teacherId;
	}

	public int getGroupId() {
		return this.groupId;
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
