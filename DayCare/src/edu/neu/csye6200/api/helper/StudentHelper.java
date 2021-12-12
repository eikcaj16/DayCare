package edu.neu.csye6200.api.helper;

import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.utils.ConversionHelper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentHelper {

    public static Student createStudent(ResultSet rs) throws SQLException {
        ConversionHelper convHelper = new ConversionHelper();
        Student s = new Student();
        s.setStudentId(convHelper.stringToLong(rs.getString("student_id")));
        s.setFirstName(rs.getString("first_name"));
        s.setLastName(rs.getString("last_name"));
        s.setAddress(rs.getString("address"));
        s.setDateOfBirth(rs.getString("date_of_birth"));
        s.setParentName(rs.getString("parent_name"));
        s.setEmail(rs.getString("email"));
        s.setRegistrationDate(rs.getString("reg_date"));
        s.setPhoneNum(convHelper.stringToInt(rs.getString("phone_no")));
        s.setClassroomId(convHelper.stringToInt(rs.getString("classroom_id")));
        s.setGroupId(convHelper.stringToInt(rs.getString("group_id")));
        s.setRating(convHelper.stringToDouble(rs.getString("rating")));
        return s;
    }}
