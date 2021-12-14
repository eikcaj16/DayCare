package edu.neu.csye6200.api.concrete;

import edu.neu.csye6200.api.StudentApi;
import edu.neu.csye6200.api.helper.StudentHelper;
import edu.neu.csye6200.dao.StudentDao;
import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.utils.ConvertUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ConcreteStudentApi implements StudentApi {
    @Override
    public int getNumOfStudents() {
        return 0;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public List<Student> getAllStudentsInClassroom(int classroomId) {
        return null;
    }

    @Override
    public List<Student> getAllStudentsInGroup(int classroomId, int groupId) {
        return null;
    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void deleteStudent(Student student) {

    }

    @Override
    public void deleteStudent(int studentId) {

    }
}
