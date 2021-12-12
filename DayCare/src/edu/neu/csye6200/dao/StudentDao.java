package edu.neu.csye6200.dao;

import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.utils.DatabaseUtil;

import java.sql.ResultSet;

public class StudentDao {

    public void addStudentToDb(Student student){
        String sql = "INSERT INTO student (student_id, first_name, last_name, address, date_of_birth, parent_name, email, reg_date, phone_no, classroom_id, group_id, rating) " +
                "VALUES(" + student.getStudentId() + "," + student.getFirstName() + "," + student.getLastName() + "," + student.getAddress() + "," +
                student.getDateOfBirth() + "," + student.getParentName() + "," + student.getPhoneNum() + "," + student.getEmail() + "," +
                student.getRegistrationDate() + "," + student.getClassroomId() + "," + student.getGroupId() + "," + student.getRating() + ");";
        DatabaseUtil.executeSQL(sql);

    }

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
                " WHERE student_id = " + student.getStudentId() + ";";
        DatabaseUtil.executeSQL(sql);
    }
    public void updateClassIdAndGroupIdForStudent(Student student){
        String sql = "UPDATE student " +
                "SET classroom_id = " + student.getClassroomId() +
                ", group_id = " + student.getGroupId() +
                " WHERE student_id = " + student.getStudentId() + ";";
        DatabaseUtil.executeSQL(sql);
    }

    public ResultSet getStudentFromDb(Student student){
        String sql = "SELECT * FROM student "
                + "WHERE STUDENT_ID = "  + student.getStudentId() + ";";
        return DatabaseUtil.getSQLResult(sql);
    }

    public void deleteStudentFromDb(Student student){
        String sql = "DELETE FROM student " +
                "WHERE student_id = " + student.getStudentId() + ";";
        DatabaseUtil.executeSQL(sql);
    }
}
