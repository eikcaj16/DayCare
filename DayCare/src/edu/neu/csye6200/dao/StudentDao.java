package edu.neu.csye6200.dao;

import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.utils.DatabaseUtil;

import java.sql.ResultSet;

public class StudentDao {

//    public ResultSet addStudentToDb(Student student){
//
//    }

    public void updateStudent(Student student){
        String sql = "UPDATE student " + "SET first_name = " + student.getFirstName() +
                ", last_name = " + student.getLastName() +
                ", address = " + student.getAddress() +
                ", date_of_birth = " + student.getDateOfBirth() +
                ", parent_name = " + student.getParentName() +
                ", email = " + student.getEmail() +
                ", reg_date = " + student.getRegistrationDate() +
                ", phone_no = " + student.getPhoneNum() +
                ", rating = " + student.getRating() +
                " WHERE student_id = " + student.getStudentId();
        DatabaseUtil.executeSQL(sql);
    }
    public void updateClassIdAndGroupIdForStudent(Student student){
        String sql = "UPDATE student " +
                "SET classroom_id = " + student.getClassroomId() +
                ", group_id = " + student.getGroupId() +
                " WHERE student_id = " + student.getStudentId();
        DatabaseUtil.executeSQL(sql);
    }

    public ResultSet getStudentFromDb(Student student){
        String sql = "SELECT * FROM student "
                + "WHERE STUDENT_ID = "  + student.getStudentId();
        return DatabaseUtil.getSQLResult(sql);
    }
}
