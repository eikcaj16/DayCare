package edu.neu.csye6200.model;

import edu.neu.csye6200.api.abstractClass.AbstractClassroom;
import edu.neu.csye6200.api.abstractClass.AbstractStudent;
import edu.neu.csye6200.utils.DatabaseUtil;
import edu.neu.csye6200.utils.Utilities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Classroom {

	private static int class_count = 0;
	private static final int[] AllGroupSize = {4, 5, 6, 8, 12, 15};
	private static final int[] AllGroupNum = {3, 3, 3, 3, 2, 2};
	private static final int[] AllMinAge = {6, 13, 25, 36, 48, 60};
	private static final int[] AllMaxAge = {12, 24, 35, 47, 59, Integer.MAX_VALUE};

	private final int classroom_type;
	private final int classroomId;
	private int student_num;
	private int teacher_num;

	private final List<Group> groups;

	public Classroom(int type) {
		classroomId = class_count++;
		classroom_type = type;
		student_num = 0;
		groups = new ArrayList<>();
		for (int i = 0; i < AllGroupNum[type]; i++) {
			groups.add(new Group(i));
		}
	}
	public Classroom() {
		super();
		this.classroom_type = 0;
		this.classroomId = 0;
		this.groups = null;
	}

	public int getNumOfStudents() {
//		Connection con = DatabaseUtil.getRemoteConnection();
//		try {
//			assert con != null;
//			Statement state = con.createStatement();
//			String sql = "SELECT COUNT(*) as num FROM student WHERE CLASSROOM_ID = "
//					+ this.classroomId;
//			ResultSet rs = state.executeQuery(sql);
//			int stu_size = 0;
//			while(rs.next()){
//				stu_size = rs.getInt("num");
//			}
//			System.out.printf("There are %d student", stu_size);
//			return stu_size;
//
//		}catch (SQLException e){
//			e.printStackTrace();
//		}
//		return 0;

		return student_num;
	}

	public List<Student> getAllStudents() {
		// TODO - implement AbstractClassroom.getAllStudents
		String sql = "SELECT * FROM student "
				+ "WHERE classroom_id = "  + classroomId;
		ResultSet rs = DatabaseUtil.getSQLResult(sql);
		List<Student> students = new ArrayList<>();
		try{
			while(Objects.requireNonNull(rs).next()) {
				Student s = new Student();
				s.setFirstName(rs.getString("first_name"));
				s.setLastName(rs.getString("last_name"));
				s.setDateOfBirth(rs.getString("date_of_birth"));
				s.setAddress(rs.getString("address"));
				s.setPhoneNum(rs.getLong("phone_no"));
				s.setRegistrationDate(rs.getString("reg_date"));
				s.setStudentId(rs.getLong("student_id"));
				students.add(s);
			}
		} catch (SQLException e){
			e.printStackTrace();
		}

		return students;
	}

	/**
	 * add a student to classroom according to rules
	 * - set the classroom_id of Student table in database
	 * @param studentId a student id
	 */

	/**
	 * delete a student from classroom
	 * @param studentId a student id
	 */

	public boolean delStudent(long studentId) {
		String sql = "SELECT * FROM student "
				+ "WHERE STUDENT_ID = "  + studentId;
		ResultSet rs = DatabaseUtil.getSQLResult(sql);
		int classroom_id = 0, group_id = 0;
		try{
			if(Objects.requireNonNull(rs).next()) {
				classroom_id = rs.getInt("classroom_id");
				group_id = rs.getInt("group_id");
				if(rs.getObject("classroom_id") == null || classroom_id != classroomId) {
					System.out.println("The student is not in this classroom!");
					return false;
				}
			}
			else{
				System.out.println("The student does not exist!");
				return false;
			}
		} catch (SQLException e){
			e.printStackTrace();
		}

		sql = "UPDATE student "
				+ "SET classroom_id = NULL, group_id = NULL" +
				" WHERE student_id = " + studentId;
		DatabaseUtil.executeSQL(sql);

		groups.get(group_id).delStudent(studentId);
		student_num--;
		System.out.println("Delete student success!");
		return true;
	}
}