package edu.neu.csye6200.model;

import edu.neu.csye6200.utils.DatabaseUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Classroom extends AbstractClassroom {

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

	public Classroom(int type){
		classroomId = class_count++;
		classroom_type = type;
		student_num = 0;
		groups = new ArrayList<>();
		for(int i = 0; i < AllGroupNum[type]; i++){
			groups.add(new Group(i));
		}
	}

	@Override
	public int getClassroomId() {
		return this.classroomId;
	}

	@Override
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

	@Override
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
				s.setAge(calAge(rs.getString("date_of_birth")));
				s.setAddress(rs.getString("address"));
				s.setPhoneNum(rs.getLong("phone_no"));
				s.setRegistrationDate(rs.getDate("reg_date"));
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
	@Override
	public boolean addStudent(long studentId) {
		if(student_num >= AllGroupSize[classroom_type] * AllGroupNum[classroom_type]){
			System.out.println("The class room is full!");
			return false;
		}

		// Query the student info from database and cal the age
		String sql = "SELECT * FROM student "
				+ "WHERE STUDENT_ID = "  + studentId;
		ResultSet rs = DatabaseUtil.getSQLResult(sql);
		int age = 0;
		try{
			if(Objects.requireNonNull(rs).next()) {
				 String birthdate = rs.getString("date_of_birth");
				 age = calAge(birthdate);
			}
			else{
				System.out.println("This student id not exist!");
				return false;
			}
		} catch (SQLException e){
			e.printStackTrace();
		}

		//Check if the student age fit this classroom
		if(age >= AllMinAge[classroom_type] && age <= AllMaxAge[classroom_type]){
			// Assign student to a group
			int assign_group_id = -1;
			for(Group g: groups){
				if(g.getNumOfStudents() < AllGroupSize[classroom_type]){
					g.addStudent(studentId);
					assign_group_id = g.getGroupId();
					break;
				}
			}
			if(assign_group_id == -1){
				System.out.println("The class room is full!");
				return false;
			}

			//Update classroom id of the student in database
			sql = "UPDATE student " +
					"SET classroom_id = " + classroomId +
					", group_id = " + assign_group_id +
					" WHERE student_id = " + studentId;
			DatabaseUtil.executeSQL(sql);
			System.out.println("Add success!");
			student_num++;
			return true;
		}
		else{
			System.out.println("Student age is not fit!");
			return false;
		}
	}

	/**
	 * delete a student from classroom
	 * @param studentId a student id
	 */
	@Override
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

	@Override
	public int getNumOfTeachers() {
		return teacher_num;
	}

	@Override
	public List<Teacher> getAllTeachers() {
		// TODO - implement AbstractClassroom.getAllTeachers
		return null;
	}

	/**
	 * add a teacher to classroom
	 * @param teacherId
	 * @return
	 */
	@Override
	public boolean addTeacher(long teacherId) {
		if(teacher_num > AllGroupNum[classroom_type]){
			System.out.println("The classroom is full!");
			return false;
		}

		String sql = "SELECT * FROM teacher WHERE teacher_id = " + teacherId;
		ResultSet rs = DatabaseUtil.getSQLResult(sql);
		try{
			if(Objects.requireNonNull(rs).next()) {
				for(Group g: groups){
					if(g.getTeacher() == -1){
						g.setTeacher(teacherId);

						sql = "UPDATE teacher " +
								"SET classroom_id = " + classroomId +
								", group_id = " + g.getGroupId() +
								" WHERE teacher_id = " + teacherId;
						DatabaseUtil.executeSQL(sql);

						teacher_num++;
						System.out.println("Add teacher success!");
						return true;
					}
				}

				System.out.println("The classroom is full!");
			}
			else{
				System.out.println("This teacher id not exist!");
			}
			return false;
		} catch (SQLException e){
			e.printStackTrace();
		}

		return false;
	}

	/**
	 *
	 * @param teacherId
	 * @return
	 */
	@Override
	public boolean delTeacher(long teacherId) {
		String sql = "SELECT * FROM teacher WHERE teacher_id = " + teacherId;
		ResultSet rs = DatabaseUtil.getSQLResult(sql);
		try{
			if(Objects.requireNonNull(rs).next()) {
				int c_id = rs.getInt("classroom_id");
				if(c_id != classroomId){
					System.out.println("This teacher is not in the classroom!");
					return false;
				}

				int g_id = rs.getInt("group_id");
				groups.get(g_id).setTeacher(-1);

				sql = "UPDATE teacher " +
						"SET classroom_id = NULL"+
						", group_id = NULL"+
						" WHERE teacher_id = " + teacherId;
				DatabaseUtil.executeSQL(sql);
				teacher_num--;
				System.out.println("Delete success!");
			}
			else{
				System.out.println("This teacher id not exist!");
			}
			return false;
		} catch (SQLException e){
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<Group> getAllGroups() {
		return groups;
	}

	int calAge(String birthdate){
		String[] date = birthdate.split("-");
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		LocalDate now = LocalDate.now();
		return 12 * (now.getYear() - year - 1) + (12 - now.getMonthValue()) + month;
	}
}