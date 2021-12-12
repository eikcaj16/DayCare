package edu.neu.csye6200.model;

public class Group {

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

}
