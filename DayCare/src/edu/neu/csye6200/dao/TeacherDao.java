package edu.neu.csye6200.dao;

import edu.neu.csye6200.model.Teacher;
import edu.neu.csye6200.utils.DatabaseUtil;

import java.sql.ResultSet;

public class TeacherDao {

    public void addTeacher(Teacher teacher) {
        String sql = "INSERT into TEACHER (teacher_id, classroom_id, group_id, first_name, last_name, date_of_birth, address, parent_name, phone_no, rating) " +
                "VALUES('"+teacher.getTeacherId()+"','"+teacher.getClassroomId()+"','"+teacher.getGroupId()+"','"+teacher.getFirstName()
                +"','"+teacher.getLastName()+"','"+teacher.getAge()+"','"+teacher.getAddress()+"','"+teacher.getParentName()
                +"','"+teacher.getPhoneNum()+"','"+teacher.getRating()+");";
        DatabaseUtil.executeSQL(sql);
    }

    public void updateTeacher(Teacher teacher) {
        String sql = "UPDATE teacher SET" +
                "  first_name = " + teacher.getFirstName() +
                ", last_name = " + teacher.getLastName() +
                ", address = " + teacher.getAddress() +
                ", parent_name = " + teacher.getParentName() +
                ", date_of_birth = " + teacher.getAge() + // todo change this
                ", phone_no = " + teacher.getPhoneNum() +
                ", rating = " + teacher.getRating() +
                ", classroom_id = " + teacher.getClassroomId() +
                ", group_id = " + teacher.getGroupId() +
                " WHERE teacher_id = " + teacher.getTeacherId();
        DatabaseUtil.executeSQL(sql);
    }

    public void updateClassroomAndGroupByTeacherId(Teacher teacher) {
        String sql = "UPDATE teacher SET classroom_id = " + teacher.getClassroomId() +
                ", group_id = " + teacher.getGroupId() + " WHERE teacher_id = " + teacher.getTeacherId();
        DatabaseUtil.executeSQL(sql);
    }

    public ResultSet getTeacherById(Long teacherId) {
        String sql = "SELECT * FROM teacher WHERE teacher_id = " + teacherId;
        return DatabaseUtil.getSQLResult(sql);
    }

    public ResultSet getTeacherRatingById(long teacherId) {
        String sql = "SELECT rating FROM teacher WHERE teacher_id = " + teacherId;
        return DatabaseUtil.getSQLResult(sql);
    }
}
