package edu.neu.csye6200.api;

import edu.neu.csye6200.api.abstractClass.AbstractTeacher;
import edu.neu.csye6200.model.Teacher;

import java.util.List;

public class TeacherApi extends AbstractTeacher {

    @Override
    public int getNumOfTeachers() {
        return 0;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return null;
    }

    @Override
    public void addTeacher(Teacher teacher) {

    }

    @Override
    public void updateTeacher(Teacher teacher) {

    }

    @Override
    public void delTeacher(Teacher teacher) {

    }

    @Override
    public void delTeacher(long teacherId) {

    }

}
