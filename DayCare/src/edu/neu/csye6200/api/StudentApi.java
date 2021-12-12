package edu.neu.csye6200.api;

import edu.neu.csye6200.api.abstractClass.AbstractStudent;
import edu.neu.csye6200.model.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentApi extends AbstractStudent {

    @Override
    public int getNumOfStudents() {
        return 0;
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void delStudent(Student student) {

    }

    @Override
    public void delStudent(long studentId) {

    }

    public void setImmunizationDate(Date immunizationDate) {

    }

    public Date getImmunizationDate(long studentId) {
        return null;
    }

    public void setRegistrationDate(Date registrationDate) {

    }

    public Date getRegistrationDate(long studentId) {
        return null;
    }
}
