package edu.neu.csye6200.api.helper;

import edu.neu.csye6200.model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;

import static edu.neu.csye6200.utils.ConvertUtil.*;

public class StudentHelper {

    public static Student createStudent(ResultSet rs) throws SQLException {
        Student student = new Student();
        student.setStudentId(stringToLong(rs.getString("student_id")));
        student.setFirstName(rs.getString("first_name"));
        student.setLastName(rs.getString("last_name"));
        student.setAddress(rs.getString("address"));
        student.setDateOfBirth(rs.getString("date_of_birth"));
        student.setParentName(rs.getString("parent_name"));
        student.setEmail(rs.getString("email"));
        student.setRegistrationDate(rs.getString("reg_date"));
        student.setPhoneNum(stringToInt(rs.getString("phone_no")));
        student.setClassroomId(stringToInt(rs.getString("classroom_id")));
        student.setGroupId(stringToInt(rs.getString("group_id")));
        student.setReview(stringToDouble(rs.getString("rating")));
        return student;
    }

    public static Student createStudent(String[] attributes) {
        Student student = new Student();
        student.setFirstName(attributes[0]);
        student.setLastName(attributes[1]);
        student.setAddress(attributes[2]);
        student.setDateOfBirth(attributes[3]);
        student.setParentName(attributes[4]);
        student.setEmail(attributes[5]);
        student.setRegistrationDate(attributes[6]);
        student.setPhoneNum(stringToInt(attributes[7]));
        student.setClassroomId(stringToInt(attributes[8]));
        student.setGroupId(stringToInt(attributes[9]));
        student.setReview(stringToDouble(attributes[10]));
        return student;
    }
}
