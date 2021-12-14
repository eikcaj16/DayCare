package edu.neu.csye6200.api.concrete;

import edu.neu.csye6200.api.TeacherApi;
import edu.neu.csye6200.dao.TeacherDao;
import edu.neu.csye6200.model.Teacher;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ConcreteTeacherApi implements TeacherApi {
    @Override
    public List<Teacher> getAllTeachers() {
        return null;
    }

    @Override
    public int getNumOfTeachers() {
        return 0;
    }

    @Override
    public List<Teacher> getAllTeachersInClassroom(int classroomId) {
        return null;
    }

    @Override
    public List<Teacher> getTeacherInGroup(int classroomId, int groupId) {
        return null;
    }

    @Override
    public void addTeacher(Teacher teacher) {

    }

    @Override
    public void updateTeacher(Teacher teacher) {

    }

    @Override
    public void deleteTeacher(Teacher teacher) {

    }

    @Override
    public void deleteTeacher(int teacherId) {

    }

    @Override
    public double getRating(int teacherId) {
        return 0;
    }
}
